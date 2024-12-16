import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static int chute = 0;
    static int numero = 0;
    static int tentativas = 0;
    static int pontos = 0;
    static String nome;

    public static void main(String[] args) {

        // Variaveis
        Scanner scanner = new Scanner(System.in);
        numero = new Random().nextInt(10);

        System.out.println("Digite seu nome?");
        nome = scanner.nextLine();

        System.out.println("Bora jogar " + nome + "\nVou te explicar o jogo \nEu vou escolher um número de 0 a 10, e você tem que adivinhar!!");

        prepararJogo(scanner);


        System.out.println("O seu saldo de pontos foi: " + pontos);
    }



    //Funçao que prepara o jogo
    public static void prepararJogo(Scanner scanner){

        // Menu criado para o usuario informar seu nivel de dificuldade
        System.out.println("Escolha uma dificuldade!");
        System.out.println("1 = Fácil");
        System.out.println("2 = Médio");
        System.out.println("3 = Dificil");
        int menu = scanner.nextInt();


            // Estrutura SWITCH para decisao de escolha do menu
            switch (menu){
                case 1:
                    tentativasJogo(scanner, 10);
                    break;
                case 2:
                    tentativasJogo(scanner, 50);
                    break;
                case 3:
                    tentativasJogo(scanner,100);
                    break;
                default:
                    System.out.println("Não tem essa opção");
                    break;
            }
    }

    //Funcao pergunta se usuario quer jogar novamente
    public static void tentativasJogo(Scanner scanner, int limiteDificuldade) {
        String jogarNovamente = "s";

        // Estrutura DO.. WHILE para informar se caso o usuario quer jogar ou nao novamente. Se caso de SIM,
        // a funcao Jogar e chamada e inicia o jogo novemnte
        do {
            jogar(scanner, limiteDificuldade);
            System.out.println("Bora jogar novamente? SIM(s) ou NÃO(n)");
            jogarNovamente = scanner.next();
        } while (jogarNovamente.equalsIgnoreCase("s"));
    }

    // Funçao Logica do jogo
    public static void jogar(Scanner scanner, int limiteDificuldade){
        // Cada inicio do jogo o usuario comeca Zerado
        tentativas = 0;
        // Loop FOR criado para informar o usuario que ele tem direito a 5 tentativas
        while (tentativas < 5){
                System.out.println("Digite um número: ");
                // Estrutura Try.. Catch, para o programa executar e nao ter quebra durante seu processo
                try {
                    chute = scanner.nextInt();
                    if (chute < 1 || chute > limiteDificuldade){
                        System.out.println("Digite um número: ");
                        continue;
                    }
                    tentativas++;

                    // Condicao IF para se caso o usuario acertar ele pontua e finaliza o jogo
                    if (chute == numero){
                        System.out.println("Parabens você acertou o número " + numero);
                        pontos = pontos + 10;
                        break;
                    } else if (chute == numero - 1 || chute == numero + 1){
                        pontos = pontos + 5;
                    }

                    // Se ele nao acertar a condicao continua e o usuario pontua se o numero for perto do que foi gerado
                    if (chute > numero){
                        System.out.println("Tente novamente, o número é menor, palpites feitos: " + tentativas);
                    } else {
                        System.out.println("Tente novamente, o número é maior, palpites feitos: " + tentativas);
                    }
                    // Catch para o usuario se caso nao utilizar numero, o programa informa.
                } catch (InputMismatchException e){
                    System.out.println("Insira um número válido.");
                    scanner.next();
                }
            break;
        }
    }
}



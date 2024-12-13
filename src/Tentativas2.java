import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tentativas2 {

    static int chute = 0;
    static int numero = 0;
    static int tentativas = 0;
    static int pontos = 0;
    static String nome;
    static String jogarNovamente = "s";

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
        System.out.println("Escolha uma dificuldade!");
        System.out.println("1 = Fácil");
        System.out.println("2 = Médio");
        System.out.println("3 = Dificil");
        int menu = scanner.nextInt();

            switch (menu){
                case 1:
                    tentativasJogo(scanner, 10);
                case 2:
                    tentativasJogo(scanner, 50);
                case 3:
                    tentativasJogo(scanner,100);
                default:
                    System.out.println("Não tem essa opção");
                    break;
            }


    }

    //Funcao
    public static void tentativasJogo(Scanner scanner, int limiteDificuldade) {

        while (jogarNovamente == "s") {
            System.out.println("Bora jogar novamente? SIM(S) ou NÃO(N)");
            jogarNovamente = scanner.next();
            jogar(scanner);
        }
    }

    // Funçao Logica do jogo
    public static void jogar(Scanner scanner){
        while (tentativas < 5){
            for (int i = 1; i <= 5; i++){
                //System.out.println("Você " + nome + " tem " + tentativas);
                System.out.println("Digite um número: ");
                try {
                    chute = scanner.nextInt();
                    if (chute < 1 || chute > 10){
                        System.out.println("Digite um número: ");
                        continue;
                    }
                    tentativas++;

                    if (chute == numero){
                        System.out.println("Para você acertou o número " + numero);
                        pontos = pontos + 10;
                        break;
                    } else if (chute == numero - 1 || chute == numero + 1){
                        pontos = pontos + 5;
                    }

                    if (chute > numero){
                        System.out.println("Tente novamente, o número é menor, palpites feitos: " + i);
                    } else {
                        System.out.println("Tente novamente, o número é maior, palpites feitos: " + i);
                    }
                } catch (InputMismatchException e){
                    System.out.println("Insira um número válido.");
                    scanner.next();
                }
            }
            break;
        }
    }
}



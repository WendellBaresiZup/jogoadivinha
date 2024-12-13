import java.util.Random;
import java.util.Scanner;

public class Tentativas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = new Random().nextInt(10);
        int chute = 0;
        int tentativas = 0;
        int pontos = 0;
        String jogarNovamente = "s";

        System.out.println("Bem-Vindo ao jogo. Digite seu nome?");
        String nome = scanner.nextLine();


        System.out.println("Bora jogar " + nome + "\nVou te explicar o jogo \nEu vou escolher um número de 0 a 10, e você tem que adivinhar!!");
        System.out.println("Você " + nome + " tem 5 tentativas!");


        for (int i = 0; i < 5; i++){
            System.out.println("Vamos lá. Digite um número");
            chute = scanner.nextInt();

            tentativas++;

            if (chute == numero){
                System.out.println("Parabens você acertou o número " + numero);
                pontos = pontos + 10;
                break;
            }
            if (chute == numero - 1 || chute == numero + 1){
                System.out.println("Tente novamente, o número é menor");
                pontos = pontos + 5;
            } else {
                System.out.println("Tente novamente, o número é maior");
            }

            if (tentativas == 5 && chute != numero){
                System.out.println("Você não conseguiu acertar o número secreto");
            }

        }

        System.out.println("Bora jogar novamente? SIM(S) ou NÃO(N)");
        jogarNovamente = scanner.next();

        System.out.println("O seu saldo de pontos foi: " + pontos);

    }
}

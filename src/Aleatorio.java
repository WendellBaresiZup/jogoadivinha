import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int numero = numeroEscolhido();


            // Criando variaveis
            int menu;
            int pc;
            int usuario;

            System.out.println("Bem-Vindo ao jogo. Digite seu nome?");
            String nome = scanner.nextLine();


            System.out.println("Bora jogar " + nome + "\nVou te explicar o jogo \nEu vou escolher um número de 0 a 10, e você " + nome + " tem que adivinhar!!");


            //
            for (int i = 1; i <= 10; i++){
                int palpite = scanner.nextInt();
                if (palpite > numero){
                    System.out.println("O número é menos, palpites feitos: " + i);
                } else if (palpite < numero){
                    System.out.println("O número é maior, palpites feitos: " + i);
                } else if (palpite == numero) {
                    System.out.println("Parabéns você acertou!");
                    break;
                }
            }

    }

    private static int numeroEscolhido(){
        return new Random().nextInt(11);
    }
}

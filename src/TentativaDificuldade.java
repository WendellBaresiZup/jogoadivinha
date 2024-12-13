import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TentativaDificuldade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = new Random().nextInt(10);

        int chute = 0;
        int tentativas = 0;

        int pontos = 0;

        String jogarNovamente = "s";

        System.out.println("Digite seu nome?");
        String nome = scanner.nextLine();


        System.out.println("Escolha uma dificuldade!");
        System.out.println("1 = Fácil");
        System.out.println("2 = Médio");
        System.out.println("3 = Dificil");
        int menu = scanner.nextInt();


        while (tentativas < 5){
            switch (menu){
                case 1:
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
                        break;
                    }
                case 2:
                    for (int j = 1; j <= 50; j++){
                        int n2 = new Random().nextInt(50);
                        System.out.println("Digite um número: ");
                        try {
                            chute = scanner.nextInt();
                            if (chute < 1 || chute > 50){
                                System.out.println("Digite um número: ");
                                continue;
                            }
                            tentativas++;

                            if (chute == n2){
                                System.out.println("Para você acertou o número " + n2);
                                pontos = pontos + 10;
                                break;
                            } else if (chute == n2 - 1 || chute == n2 + 1){
                                pontos = pontos + 5;
                            }

                            if (chute > n2){
                                System.out.println("Tente novamente, o número é menor, palpites feitos: " + j);
                            } else {
                                System.out.println("Tente novamente, o número é maior, palpites feitos: " + j);
                            }
                        } catch (InputMismatchException e){
                            System.out.println("Insira um número válido.");
                            scanner.next();
                        }
                        break;
                    }
                case 3:
                    for (int k = 1; k <= 100; k++){
                        int n3 = new Random().nextInt(100);
                        System.out.println("Digite um número: ");
                        try {
                            chute = scanner.nextInt();
                            if (chute < 1 || chute > 100){
                                System.out.println("Digite um número: ");
                                continue;
                            }
                            tentativas++;

                            if (chute == n3){
                                System.out.println("Para você acertou o número " + n3);
                                pontos = pontos + 10;
                                break;
                            } else if (chute == n3 - 1 || chute == n3 + 1){
                                pontos = pontos + 5;
                            }

                            if (chute > n3){
                                System.out.println("Tente novamente, o número é menor, palpites feitos: " + k);
                            } else {
                                System.out.println("Tente novamente, o número é maior, palpites feitos: " + k);
                            }
                        } catch (InputMismatchException e){
                            System.out.println("Insira um número válido.");
                            scanner.next();
                        }
                        break;
                    }
                default:
                    //System.out.println("Não tem essa opção");
                    break;
            }

        }



        System.out.println("O seu saldo de pontos foi: " + pontos);
    }
}

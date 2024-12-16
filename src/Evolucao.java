import java.util.Random;
import java.util.Scanner;

public class Evolucao {
    public static void main(String[] args) {

        // classe Scanner para o usurio ter que colocar dados
        Scanner scanner = new Scanner(System.in);
        // classe random - essa classe vai gerar numeros aleatórios
        Random random = new Random();


        // Criando variaveis

        // Variavel de menu para escolha do usuario
        int menu;

        // Variavel para o número gerado
        int numeroGerado;

        // Variavel
        int usuario;

        System.out.println("Bem-Vindo ao jogo. Digite seu nome?");
        String nome = scanner.nextLine();


        System.out.println(nome + " bora jogar um jogo? \nInforme sua opção \n 1 -- SIM \n 2 -- NÃO \n");
        // Aonde o usuario vai fazer a escolha para iniciar o jogo
        menu = scanner.nextInt();

        //
            if (menu == 2){
                System.out.println("Queria muito ter jogado com você " + nome + "\n Quem sabe na próxima \n");
            } else if (menu == 1){

                System.out.println("Bora jogar " + nome + "\nVou te explicar o jogo \nEu vou escolher um número de 0 a 10, e você " + nome + " tem que adivinhar!!");

                numeroGerado = random.nextInt(11);
                System.out.println("Já escolhi o número " + nome + ". Agora tente adivinhar!");

                do {
                    usuario = scanner.nextInt();
                    if (usuario != numeroGerado){
                        System.out.println("Não é esse...");
                    } else {
                        System.out.println("Parabéns " + nome + ". Você acertou o número " + numeroGerado);
                    }
                } while (numeroGerado != usuario);

            }

    }
}
import java.util.Random;
import java.util.Scanner;
public class Adivinhador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinhar = random.nextInt(100) + 1;
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número de 1 a 100.");

        while (true) {
            System.out.println("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAdivinhar) {
                System.out.println("Parabéns! Você adivinhou o número " + numeroAdivinhar + " em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroAdivinhar) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }

        scanner.close();
    }
}

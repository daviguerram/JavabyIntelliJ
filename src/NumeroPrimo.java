import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean executando = true;

        System.out.println("Bem-vindo ao Primo!");

        while (executando) {
            System.out.println("1- Conferir se é número primo");
            System.out.println("2- Sair");
            int num = leia.nextInt();


            switch (num) {
                case 1:
                    System.out.println("Digite um número:");
                    int x = leia.nextInt();
                    if (x <= 1) {
                        System.out.println("Número inválido. O número deve ser maior que 1.");
                    } else {
                        boolean ehPrimo = verificarPrimo(x);
                        if (ehPrimo) {
                            System.out.println(x + " é um número primo.");
                        } else {
                            System.out.println(x + " não é um número primo.");
                        }
                    }
                    break;

                case 2:
                    executando = false;
                    break;
            }
        }
        leia.close();
        }
        public static boolean verificarPrimo(int numero) {
            if (numero<=1) {
                return false;
            }
            else if (numero <= 3) {
                return true;
            }
            else if (numero% 2 == 0 || numero % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= numero; i += 6) {
                if (numero % i == 0 || numero % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }


import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("Bem-vindo ao Super-Fatorial!");
            System.out.println("1- Calcular fatorial");
            System.out.println("2- Sair");
            int num = leia.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Digite um número: ");
                    double numero = leia.nextDouble();
                    if (numero < 0) {
                        System.out.println("Número inválido. O número deve ser não negativo.");
                    } else {
                        long fatorial = calcularFatorial((int) numero);
                        System.out.println("O fatorial de " + numero + " é " + fatorial);
                    }
                    break;
                case 2:
                    executando = false;
                    break;
            }
        }
        leia.close();
    }

            public static long calcularFatorial(int n){
                if (n == 0 || n == 1) {
                    return 1;
                } else {
                    long resultado = 1;
                    for (int i = 2; i <= n; i++) {
                        resultado *= i;
                    }
                    return resultado;
                }
            }
        }



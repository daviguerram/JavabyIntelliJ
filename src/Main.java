import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            out.println("Bem-vindo a Multi-Calculadora!");
            out.println("Qual operação numérica deseja fazer?");
            out.println("1 - Adição");
            out.println("2 - Subtração");
            out.println("3 - Multiplicação");
            out.println("4 - Divisão");
            out.println("5 - Sair");
            int num = leia.nextInt();

            int x,y,res;

            switch (num) {
                case 1:
                    out.println("Digite dois números: ");
                    x = leia.nextInt();
                    y = leia.nextInt();
                    res = x + y;
                    out.println("O resultado é: " + res);
                    break;

                case 2:
                    out.println("Digite dois números: ");
                     x = leia.nextInt();
                     y = leia.nextInt();
                     res = x - y;
                    out.println("O resultado é: " + res);
                    break;

                case 3:
                    out.println("Digite dois números: ");
                    x = leia.nextInt();
                    y = leia.nextInt();
                    res = x * y;
                    out.println("O resultado é: " + res);
                    break;

                case 4:
                    out.println("Digite dois números: ");
                    x = leia.nextInt();
                    y = leia.nextInt();
                    res = x / y;
                    out.println("O resultado é: " + res);
                    break;

                case 5:
                    executando = false;
                    break;

                default:
                    out.println("Opção inválida");
                    break;

            }
        }
    }
}
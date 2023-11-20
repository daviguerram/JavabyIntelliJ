import java.util.Scanner;
public class ConversordeReal {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("Bem-vindo ao Conversor de Real!");
            System.out.println("1- Converter Real para Dólar");
            System.out.println("2- Converter Real para Euro");
            System.out.println("3- Sair");
            int x = leia.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Digite um valor em reais: ");
                    double y = leia.nextDouble();
                    double res = y/4.94;
                    System.out.println("O valor convertido em dólares é igual a: "+res);
                    break;
                case 2:
                    System.out.println("Digite um valor em reais: ");
                    y = leia.nextDouble();
                    res = y/5.27;
                    System.out.println("O valor convertido em euros é igual a: "+res);
                    break;
                case 3:
                    executando = false;
                    break;
            }


        }
    }
}

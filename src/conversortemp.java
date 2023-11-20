import java.util.Scanner;

import static java.lang.System.out;
public class conversortemp {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            out.println("Bem-Vindo ao Multi-Conversor!");
            out.println("Qual operação deseja fazer?");
            out.println("1- Converter Celsius para Fahrenheit");
            out.println("2- Converter Fahrenheit para Celsius");
            out.println("3- Converter metros para pés");
            out.println("4- Converter pés para metros");
            out.println("5- Sair");
            int num = leia.nextInt();

            double x,res;

            switch (num) {
                case 1:
                    out.println("Digite o valor: ");
                    x = leia.nextDouble();
                    res = x*1.8+32;
                    out.println("O valor convertido é igual a: "+res);
                    break;
                case 2:
                    out.println("Digite o valor: ");
                    x = leia.nextDouble();
                    res = (x-32)*5/9;
                    out.println("O valor convertido é igual a: "+res);
                    break;
                case 3:
                    out.println("Digite o valor: ");
                    x = leia.nextDouble();
                    res= x*3.28;
                    out.println("O valor convertido é igual a: "+res);
                    break;
                case 4:
                    out.println("Digite o valor: ");
                    x= leia.nextDouble();
                    res=x/3.38;
                    out.println("O valor convertido é igual a: "+res);
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

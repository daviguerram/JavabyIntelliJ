package aplicativoagenda;

import java.util.Scanner;

public class AplicativoAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("Menu da Agenda:");
            System.out.println("1- Adicionar Contato");
            System.out.println("2- Remover Contato");
            System.out.println("3- Listar Contatos");
            System.out.println("4- Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone do contato:");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite o endereço do contato: ");
                    String endereco = scanner.nextLine();
                    Contato novoContato = new Contato(nome, telefone, endereco);
                    agenda.adicionarContato(novoContato);
                    break;
                case 2:
                    System.out.println("Digite o índice do contato a ser removido:");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    agenda.removerContato(indice);
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    System.out.println("Saindo do aplicativo");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}

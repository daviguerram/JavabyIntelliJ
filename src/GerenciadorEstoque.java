import java.util.ArrayList;
import java.util.Scanner;
public class GerenciadorEstoque {
    private static ArrayList<ItemEstoque> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            System.out.println("Sistema de Gerenciamento de Estoque");
            System.out.println("1- Adicionar item");
            System.out.println("2- Remover item");
            System.out.println("3- Listar itens");
            System.out.println("4- Atualizar item");
            System.out.println("5- Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    removerItem();
                    break;
                case 3:
                    listarItens();
                    break;
                case 4:
                    atualizarItem();
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }
    }

    public static void adicionarItem() {
        System.out.println("Digite o nome do item:");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade do item: ");
        int quantidade = scanner.nextInt();

        ItemEstoque item = new ItemEstoque(nome, quantidade);
        estoque.add(item);
        System.out.println("Item adicionado ao estoque.");
    }
    public static void removerItem() {
        System.out.println("Digite o índice do item a ser removido:");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < estoque.size()) {
            estoque.remove(indice);
            System.out.println("Item removido do estoque.");
        } else {
            System.out.println("Índice inválido. Tente novamente");
        }
    }

    public static void listarItens() {
        System.out.println("Itens em estoque: ");
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(i + ": " + estoque.get(i));
        }
    }

    public static void atualizarItem() {
        System.out.println("Digite o índice do item a ser atualizado: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < estoque.size()) {
            ItemEstoque item = estoque.get(indice);
            System.out.println("Digite o novo nome do item: ");
            scanner.nextLine();
            String novoNome = scanner.nextLine();
            item.setNome(novoNome);

            System.out.println("Digite a nova quantidade do item: ");
            int novaQuantidade = scanner.nextInt();
            item.setQuantidade(novaQuantidade);

            System.out.println("Item atualizado com sucesso.");
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }
}

class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + " (Quantidade: " + quantidade + ")";
    }


}
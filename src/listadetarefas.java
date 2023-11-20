import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;
public class listadetarefas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            out.println("Lista de Tarefas:");
            listarTarefas(tarefas);

            out.println("\nEscolha uma ação: ");
            out.println("1- Adicionar tarefa");
            out.println("2- Remover tarefa");
            out.println("3- Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    out.println("Digite a nova tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    adicionarTarefa(tarefas, novaTarefa);
                    break;
                case 2:
                    out.println("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    removerTarefa(tarefas, indice);
                    break;
                case 3:
                    out.println("Saindo do aplicativo.");
                    System.exit(0);
                default:
                    out.println("Opção inválida. Tente novamente.");
            }
        }

    }

    private static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            out.println("Nenhuma tarefa na lista.");
        } else {
            for (int i=0; i < tarefas.size(); i++) {
                out.println(i+":" + tarefas.get(i));
            }
        }
    }

    private static void adicionarTarefa(ArrayList<String> tarefas, String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: "+ tarefa);
    }

    private static void removerTarefa(ArrayList<String> tarefas, int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            String tarefaRemovida = tarefas.remove(indice);
            out.println("Tarefa removida: " + tarefaRemovida);
        } else {
            out.println("Índice inválido. Tente novamente.");
        }
    }
}

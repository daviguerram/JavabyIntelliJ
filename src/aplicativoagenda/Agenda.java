package aplicativoagenda;

import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso");
    }

    public void removerContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            contatos.remove(indice);
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de Contatos:");
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println(i + ": " + contatos.get(i));
            }
        }
    }
}

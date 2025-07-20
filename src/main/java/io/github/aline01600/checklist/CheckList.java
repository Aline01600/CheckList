package io.github.aline01600.checklist;

import java.util.ArrayList;
import java.util.List;

public class CheckList {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void mostrarTarefas() {
        System.out.println("Tarefas atuais:");
        for (Tarefa t : tarefas) {
            System.out.println("- " + t);
        }
    }

    public Memento criarMemento() {
        return new Memento(new ArrayList<>(tarefas));
    }

    public void restaurarMemento(Memento memento) {
        tarefas = new ArrayList<>(memento.getEstadoSalvo());
    }
}

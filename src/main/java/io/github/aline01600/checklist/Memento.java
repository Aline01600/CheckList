package io.github.aline01600.checklist;

import java.util.List;

public class Memento {
    private final List<Tarefa> estadoSalvo;

    public Memento(List<Tarefa> estado) {
        // Cria uma cópia do estado para garantir imutabilidade
        this.estadoSalvo = List.copyOf(estado);
    }

    public List<Tarefa> getEstadoSalvo() {
        return estadoSalvo;
    }
}

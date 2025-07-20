package io.github.aline01600.checklist;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> historico = new Stack<>();

    public void salvarEstado(Memento memento) {
        historico.push(memento);
    }

    public Memento desfazer() {
        if (!historico.isEmpty()) {
            return historico.pop();
        }
        return null;
    }
}

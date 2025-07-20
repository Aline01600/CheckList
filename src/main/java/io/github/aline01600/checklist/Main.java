package io.github.aline01600.checklist;

public class Main {
    public static void main(String[] args) {
        CheckList checklist = new CheckList();
        Caretaker historico = new Caretaker();

        checklist.adicionarTarefa("Lavar roupa");
        checklist.adicionarTarefa("Limpar casa");
        historico.salvarEstado(checklist.criarMemento());

        checklist.adicionarTarefa("Estudar");
        historico.salvarEstado(checklist.criarMemento());

        checklist.adicionarTarefa("Fazer exercícios");
        checklist.mostrarTarefas();

        System.out.println("\n--- DESFAZER ---");
        checklist.restaurarMemento(historico.desfazer());
        checklist.mostrarTarefas();

        System.out.println("\n--- DESFAZER ---");
        checklist.restaurarMemento(historico.desfazer());
        checklist.mostrarTarefas();
    }
}

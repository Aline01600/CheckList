# CheckList

Este projeto Java implementa um sistema de CheckList com suporte a desfazer alterações utilizando o Padrão de Projeto Memento. A aplicação permite adicionar tarefas e restaurar estados anteriores da lista de tarefas com facilidade.

## Estrutura de Classes

Checklist: Classe principal que armazenaa e manipula as tarefas.
Tarefa: representa uma tarefa individual com uma descrição.
Memento: encapsula o estado interno do CheckList.
Caretaker: armazena o histórico de estados.

##Funcionalidades
- Adicionar Tarefas
- Visualizar Tarefas atuais
- Salvar estado atual(Memento)
- Desfazer alterações restalrando um estado anterior

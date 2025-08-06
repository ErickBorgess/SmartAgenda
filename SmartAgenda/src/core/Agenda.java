package core;

import java.util.ArrayList;
import java.util.List;

import model.Tarefa;
import observer.Observer;

//Classe que gerencia as tarefas e as notificações
public class Agenda {
    private List<Tarefa> tarefas = new ArrayList<>();
    private List<Observer> observadores = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        notificar(tarefa);
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    private void notificar(Tarefa tarefa) {
        for(Observer observador : observadores) {
            observador.atualizar(tarefa);
        }
    }

    public void executarTotal() {
        for(Tarefa tarefa : tarefas) {
            tarefa.executar();
        }
    }
}

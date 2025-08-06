package observer;

import model.Tarefa;

public class Logger implements Observer{
    public void atualizar(Tarefa tarefa) {
        System.out.println("[LOG] Nova Tarefa Atualizada!");
    }
}

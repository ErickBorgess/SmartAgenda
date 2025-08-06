package observer;

import model.Tarefa;

public class Notificador implements Observer {
    public void atualizar(Tarefa tarefa) {
        System.out.println("[NOTIFICACAO] Nova Tarefa Registrada!");
    }
}

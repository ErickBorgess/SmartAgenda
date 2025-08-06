package strategy;

import model.Tarefa;

public class ExecucaoImediata implements ExecucaoStrategy {
    public void executar(Tarefa tarefa) {
        System.out.println("Executando imediatamente: " + tarefa.getNome());
        tarefa.getComando().executar();
    }
}
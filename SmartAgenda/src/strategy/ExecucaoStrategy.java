package strategy;

import model.Tarefa;

public interface ExecucaoStrategy {
    void executar(Tarefa tarefa);
}

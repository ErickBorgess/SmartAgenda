package strategy;

import model.Tarefa;

public class ExecucaoAtrasada implements ExecucaoStrategy {
    public void executar(Tarefa tarefa) {
        try {
            System.out.println("Aguardando 5 segundos para iniciar a tarefa: "+tarefa.getNome());
            Thread.sleep(5000);
            tarefa.getComando().executar();;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

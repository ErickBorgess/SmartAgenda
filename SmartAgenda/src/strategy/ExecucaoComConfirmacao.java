package strategy;

import java.util.Scanner;
import model.Tarefa;

public class ExecucaoComConfirmacao implements ExecucaoStrategy {
    public void executar(Tarefa tarefa) {
        System.out.println("Deseja executar a tarefa '"+ tarefa.getNome()+"' agora? (sim/nao)");
        Scanner scanner = new Scanner(System.in);
        String confirmacao = scanner.nextLine();

        if(confirmacao.equalsIgnoreCase("sim")) {
            tarefa.getComando().executar();
        }else {
            System.out.println("Execução da tarefa recusada pelo usuário!");
        }

        scanner.close();
    }
}

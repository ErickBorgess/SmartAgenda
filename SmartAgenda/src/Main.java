import core.Agenda;
import model.Tarefa;
import observer.*;
import strategy.*;
import command.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();

        //Adicionando observadores (Observer)
        agenda.adicionarObservador(new Notificador());
        agenda.adicionarObservador(new Logger());

        //Criando comandos (Command)
        EnviarEmail comandoEmail = new EnviarEmail();
        TocarAlarme comandoAlarme = new TocarAlarme();

        //Criando estratégias (Strategy)
        ExecucaoImediata execucaoImediata = new ExecucaoImediata();
        ExecucaoComConfirmacao execucaoComConfirmacao = new ExecucaoComConfirmacao();
        ExecucaoAtrasada execucaoAtrasada = new ExecucaoAtrasada();

        //Criando tarefas com diferentes comandos e estratégias
        Tarefa tarefa1 = new Tarefa("Enviar relatório", "Relatório semanal para a equipe", comandoEmail, execucaoImediata);
        Tarefa tarefa2 = new Tarefa("Enviar proposta", "Proposta para o novo cliente", comandoEmail, execucaoComConfirmacao);
        Tarefa tarefa3 = new Tarefa("Lembre após tempo definido", "Avisar sobre início da reunião", comandoAlarme, execucaoAtrasada);
        //Adicionando tarefas à agenda
        agenda.adicionarTarefa(tarefa1);
        agenda.adicionarTarefa(tarefa2);
        agenda.adicionarTarefa(tarefa3);

        System.out.println("\n--- Executando todas as tarefas da agenda ---\n");
        agenda.executarTotal();
    }
}

package model;

import command.Command;
import strategy.ExecucaoStrategy;

public class Tarefa {
    private String nome;
    private String descricao;
    private Command comando;
    private ExecucaoStrategy estrategia;
    
    public Tarefa(String nome, String descricao, Command comando, ExecucaoStrategy estrategia) {
        this.nome = nome;
        this.descricao = descricao;
        this.comando = comando;
        this.estrategia = estrategia;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Command getComando() {
        return comando;
    }

    public void setEstrategia(ExecucaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void executar() {
        estrategia.executar(this);
    }
    
}

# SmartAgenda

## 📌 Objetivo
O **SmartAgenda** é um sistema simples de gerenciamento de tarefas implementado em Java, com foco na aplicação de **Padrões de Projeto Comportamentais** da estrutura GoF.  
O projeto foi desenvolvido como parte da disciplina de **Padrões de Projeto**, atendendo aos requisitos definidos pelo professor.

## 🛠️ Padrões GoF aplicados

### 1. **Strategy**
Permite definir diferentes estratégias de execução de tarefas, podendo trocar o comportamento em tempo de execução sem modificar a classe `Tarefa`.

Implementações:
- `ExecucaoImediata` → executa a tarefa no momento da chamada.
- `ExecucaoComConfirmacao` → solicita confirmação do usuário antes de executar.
- `ExecucaoAtrasada` → aguarda alguns segundos antes de executar.

Interface:
- `strategy/ExecucaoStrategy.java`

### 2. **Command**
Encapsula uma ação como um objeto, permitindo parametrizar métodos com diferentes comandos.

Implementações:
- `EnviarEmail` → simula envio de e-mail.
- `TocarAlarme` → simula acionamento de alarme.

Interface:
- `command/Command.java`

### 3. **Observer**
Permite que objetos sejam notificados automaticamente quando um evento ocorre (adição de tarefa).

Observadores:
- `Logger` → registra no console a adição de tarefas.
- `Notificador` → envia uma simulação de notificação.

Interface:
- `observer/Observer.java`

## 📂 Estrutura de Pastas
```
src/
 ├── command/
 │   ├── Command.java
 │   ├── EnviarEmail.java
 │   └── TocarAlarme.java
 ├── core/
 │   └── Agenda.java
 ├── model/
 │   └── Tarefa.java
 ├── observer/
 │   ├── Logger.java
 │   ├── Notificador.java
 │   └── Observer.java
 ├── strategy/
 │   ├── ExecucaoStrategy.java
 │   ├── ExecucaoImediata.java
 │   ├── ExecucaoAtrasada.java
 │   └── ExecucaoComConfirmacao.java
 └── Main.java
 ```

 ## Como executar
1. Abra o projeto no **VS Code** ou outra IDE Java.
2. Compile todos os arquivos.
3. Execute a classe `Main`.
package Tarefa06;

public interface IPagamento {
    boolean processarPagamento(double valor);
    StatusPagamento getStatus();
}
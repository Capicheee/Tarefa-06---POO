package Tarefa06;

import java.time.LocalDate;

public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private LocalDate dataValidade;
    private StatusPagamento statusPagamento = StatusPagamento.PENDENTE;

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            statusPagamento = StatusPagamento.APROVADO;
            return true;
        }
        statusPagamento = StatusPagamento.RECUSADO;
        return false;
    }

    @Override
    public StatusPagamento getStatus() {
        return statusPagamento;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}

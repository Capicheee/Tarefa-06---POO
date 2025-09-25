package Tarefa06;

import java.time.LocalDate;

public class PagamentoBoleto implements IPagamento {
    private String codigoBarras;
    private LocalDate dataVencimento;
    private double valor;
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

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

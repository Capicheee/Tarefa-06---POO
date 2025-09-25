package Tarefa06;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private IPagamento metodoPagamento;
    private StatusPedido statusPedido = StatusPedido.PENDENTE;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public void aplicarDesconto(double percentual) {
        for (ItemPedido item : itens) {
            item.precoUnitario = item.precoUnitario * (1 - percentual / 100.0);
        }
    }

    public boolean confirmarPedido() {
        if (metodoPagamento != null && metodoPagamento.processarPagamento(calcularTotal())) {
            statusPedido = StatusPedido.PROCESSANDO;
            return true;
        }
        return false;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarMetodoPagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}

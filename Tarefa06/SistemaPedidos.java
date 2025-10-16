package Tarefa06;

public class SistemaPedidos {
    public static void main(String[] args) {
        Cliente cliente = new ClientePF("Ju", "jkws@gmail.com", "123.456.789-00");
        Cliente cliente2 = new ClientePJ("Luis", "luis@gmail.com", "12.345.678/0001-00", "Empresa X", "123456789");

        System.out.println(cliente.getIdentificadorUnico());
        System.out.println(cliente2.getIdentificadorUnico());

        Produto produto1 = new Produto("Teclado", 150.0);
        Produto produto2 = new Produto("Mouse", 500.0);
        Produto produto3 = new Produto("Monitor", 800.0);
        Produto produto4 = new Produto("Console", 1500.0);

        Pedido pedido1 = new Pedido(cliente);
        Pedido pedido2 = new Pedido(cliente2);

        pedido1.adicionarItem(new ItemPedido(produto1, 2));
        pedido1.adicionarItem(new ItemPedido(produto2, 1));
        pedido2.adicionarItem(new ItemPedido(produto3, 1));
        pedido2.adicionarItem(new ItemPedido(produto4, 1));

        pedido1.setStatusPedido(StatusPedido.PENDENTE);
        pedido2.setStatusPedido(StatusPedido.PENDENTE);

        IPagamento metodoPagamento = new PagamentoCartaoCredito();
        pedido1.adicionarMetodoPagamento(metodoPagamento);

        IPagamento metodoPagamento2 = new PagamentoBoleto();
        pedido2.adicionarMetodoPagamento(metodoPagamento2);

        double total = pedido1.calcularTotal();
        boolean pagamentoAprovado = metodoPagamento.processarPagamento(total);

        System.out.println("Total do pedido 1: " + total);
        System.out.println("Pagamento aprovado? " + pagamentoAprovado);
    }
}

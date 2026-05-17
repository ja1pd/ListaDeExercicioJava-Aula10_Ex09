public class Pedido {
    public int numeroPedido;
    public String nomeCliente;
    public Hamburguer item1;
    public Hamburguer item2;
    public boolean pago;

    public double calcularTotal() {
        double total = 0;

        if (item1 != null) {
            total += item1.preco;
        }

        if (item2 != null) {
            total += item2.preco;
        }

        return total;
    }

    public void pagar() {
        pago = true;
    }

    public void exibirPedido() {
        System.out.println("===== PEDIDO #" + numeroPedido + " =====");
        System.out.println("Cliente: " + nomeCliente);

        if (item1 != null) {
            System.out.println("Item 1: " + item1.nome + " — R$ " + String.format("%.2f", item1.preco));
        }

        if (item2 != null) {
            System.out.println("Item 2: " + item2.nome + " — R$ " + String.format("%.2f", item2.preco));
        }

        System.out.println("Total: R$ " + String.format("%.2f", calcularTotal()));

        String status = "PENDENTE";

        if (pago) {
            status = "PAGO";
        }

        System.out.println("Status: " + status);
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hamburguer item1 = new Hamburguer();
        System.out.println("Nome do 1º hambúrguer:");
        item1.nome = scanner.nextLine();
        System.out.println("Descrição:");
        item1.descricao = scanner.nextLine();
        System.out.println("Preço:");
        item1.preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Deseja adicionar um 2º item? (s/n)");
        String resposta = scanner.nextLine();

        Hamburguer item2 = null;
        if (resposta.equalsIgnoreCase("s")) {
            item2 = new Hamburguer();
            System.out.println("Nome do 2º hambúrguer:");
            item2.nome = scanner.nextLine();
            System.out.println("Descrição:");
            item2.descricao = scanner.nextLine();
            System.out.println("Preço:");
            item2.preco = scanner.nextDouble();
            scanner.nextLine();
        }

        Pedido pedido = new Pedido();
        System.out.println("Número do pedido:");
        pedido.numeroPedido = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome do cliente:");
        pedido.nomeCliente = scanner.nextLine();
        pedido.item1 = item1;
        pedido.item2 = item2;

        pedido.exibirPedido();

        System.out.println("Confirmar pagamento? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            pedido.pagar();
            pedido.exibirPedido();
        }

        scanner.close();
    }
}

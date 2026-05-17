public class Hamburguer {
    public String nome;
    public String descricao;
    public double preco;

    public void exibir() {
        System.out.println(nome + " — R$ " + String.format("%.2f", preco));
        System.out.println("  " + descricao);
    }
}

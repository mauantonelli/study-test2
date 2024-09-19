import java.util.ArrayList;
import java.util.List;

public class ItemCompra {
    private int quantidadeComprada;
    private double valorTotal;
    private Produto produto;

    public ItemCompra(int quantidadeComprada, double valorTotal, Produto produto) {
        this.quantidadeComprada = quantidadeComprada;
        this.valorTotal = valorTotal;
        this.produto = produto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double calcularValorTotal(){
        List<Compra> compras = new ArrayList<>();
        double valorTotal = 0;

        for(Compra compra: compras){
            System.out.println(this.getValorTotal());

        }
        return valorTotal;

    }
}

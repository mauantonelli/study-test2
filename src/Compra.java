import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String numeroCompra;
    private LocalDate dataCompra;
    private double valorTotalCompra;
    private double valorDesconto;
    private double valorPagar;
    private List<ItemCompra> compras = new ArrayList<>();
    private Cliente cliente;

    public Compra(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compra(String numeroCompra, LocalDate dataCompra) {
        this.numeroCompra = numeroCompra;
        this.dataCompra = dataCompra;
    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void incluirItemCompra(ItemCompra itemCompra){
        this.compras.add(itemCompra);
    }

    public void removerItemCompra(ItemCompra itemCompra){
        this.compras.remove(itemCompra);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularValorTotalCompra(){
        double valorTotalCompra = 0;
        double valorDesconto = 0;
        double valorPagar = 0;

        valorDesconto = valorTotalCompra - 0.05*valorTotalCompra;

        for(ItemCompra compra: compras){
            if(valorTotalCompra > 1000){
                valorPagar = valorTotalCompra - valorDesconto;
            }
    }

        return valorPagar;
}

}

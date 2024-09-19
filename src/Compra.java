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

    public Compra(Cliente cliente, String numeroCompra, LocalDate dataCompra) {
        this.cliente = cliente;
        this.numeroCompra = numeroCompra;
        this.dataCompra = dataCompra;
        cliente.getCompras().add(this); // Adiciona a compra no histórico do cliente
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

    public double calcularValorTotalCompra() {
        valorTotalCompra = 0;

        for (ItemCompra item : compras) {
            valorTotalCompra += item.calcularValorTotal();
        }

        if (valorTotalCompra > 1000) {
            valorDesconto = valorTotalCompra * 0.05;
            valorPagar = valorTotalCompra - valorDesconto;
        } else {
            valorPagar = valorTotalCompra;
        }

        return valorPagar;
    }


}

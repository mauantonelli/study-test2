import java.time.LocalDate;

public class Compra {
    private String numeroCompra;
    private LocalDate dataCompra;
    private double valorTotalCompra;
    private double valorDesconto;
    private double valorPagar;


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
}

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("12345678910", "Maurício", "11999999999");
        Vendedor vendedor = new Vendedor("10987654321", "Thifany", "001");

        Produto panela = new Produto("Panela", 50.0);
        Produto geladeira = new Eletrodomestico("Geladeira", 3000.0, "110v");

        ItemCompra item1 = new ItemCompra(2, 0, panela);  // Valor total será calculado
        ItemCompra item2 = new ItemCompra(1, 0, geladeira);

        Compra compra = new Compra(cliente, "0001", LocalDate.now());
        compra.incluirItemCompra(item1);
        compra.incluirItemCompra(item2);

        compra.calcularValorTotalCompra();
        cliente.exibirHistoricoCompras();
    }
}

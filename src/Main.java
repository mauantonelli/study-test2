import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Produto panela = new Produto("Panela", 50);
        Produto jogoCama = new Produto("Jogo de Cama", 150);
        Produto geladeira = new Eletrodomestico("Geladeira", 5000, "110v");

        Cliente cliente = new Cliente("123", "Maria", "9999-9999");
        Vendedor vendedor = new Vendedor("456", "José", "101010");


        ItemCompra itemCompra1 = new ItemCompra(panela, 2);
        ItemCompra itemCompra2 = new ItemCompra(jogoCama, 1);
        ItemCompra itemCompra3 = new ItemCompra(geladeira, 1);


        Compra compra = new Compra(cliente, vendedor, "001", LocalDate.of(2024, 9, 21));


        compra.incluirItemCompra(itemCompra1);
        compra.incluirItemCompra(itemCompra2);
        compra.incluirItemCompra(itemCompra3);


        cliente.inserirCompras(compra);

        cliente.exibirHistoricoCompras();
    }
}

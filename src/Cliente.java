import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String telefone;
    private List<Compra> compras = new ArrayList<>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void inserirCompras(Compra itemCompra){
        this.compras.add(itemCompra);
    }

    public void exibirHistoricoCompras() {
        LocalDate dataLimite = LocalDate.of(2023, 9, 1);

        for (Compra compra : compras) {
            System.out.println("Compra nº: " + compra.getNumeroCompra() +
                    " | Cliente: " + compra.getCliente().getNome() +
                    " | Vendedor: " + compra.getVendedor().getNome() +
                    " | Total a Pagar: R$" + compra.calcularValorTotalCompra());

            if (compra.getDataCompra().isAfter(dataLimite)) {
                System.out.println("Exibindo compra após a data limite" + compra.getDataCompra());
            } else {
                System.out.println("Data não permitida!");
            }

            System.out.println("Itens comprados:");
            for (ItemCompra item : compra.getItens()) {
                System.out.println("Produto: " + item.getProduto().getDescricao() +
                        " | Quantidade: " + item.getQuantidadeComprada() +
                        " | Valor Total: R$" + item.calcularValorTotal());
            }

            System.out.println("-----------------------------------");
        }
    }


}

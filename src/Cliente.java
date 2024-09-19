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

    public void exibirHistoricoCompras() {
        for (Compra compra : compras) {
            System.out.println("Compra nº: " + compra.getNumeroCompra() +
                    " | Data: " + compra.getDataCompra() +
                    " | Cliente: " + compra.getCliente().getNome() +
                    " | Vendedor: " + compra.getVendedor().getNome() +
                    " | Total a Pagar: R$" + compra.calcularValorTotalCompra());


            System.out.println("Itens comprados:");
            for (ItemCompra item : compra.getItens()) {
                System.out.println("Produto: " + item.getProduto().getDescricao() +
                        " | Quantidade: " + item.getQuantidadeComprada() +
                        " | Valor Total: R$" + item.getValorTotal());
            }
            System.out.println("-----------------------------------");
        }
    }

}

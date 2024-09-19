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

    public void exibirHistoricoCompras(){
        System.out.println();
    }
}

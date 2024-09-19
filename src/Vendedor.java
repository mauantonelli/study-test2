public class Vendedor extends Pessoa {
    private String matricula;

    public Vendedor(String cpf, String nome, String matricula) {
        super(cpf, nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

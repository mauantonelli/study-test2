public class Eletrodomestico extends Produto {
    private String voltagem;

    public Eletrodomestico(String descricao, double precoUnitario, String voltagem) {
        super(descricao, precoUnitario);
        this.voltagem = voltagem;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
}

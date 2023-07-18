package modelProdutos;

public class Comestivel extends Produto{
    
    private int tipoComestivel; //1 – Prato, 2 – Lanche, 3 – Diversos

    public Comestivel(int tipoComestivel, String nome, int quantidade, float preco) {
        super(nome, quantidade, preco);
        this.tipoComestivel = tipoComestivel;
    }

    public int getTipoComestivel() {
        return tipoComestivel;
    }

    public void setTipoComestivel(int tipoComestivel) {
        this.tipoComestivel = tipoComestivel;
    }
    
    
    
}

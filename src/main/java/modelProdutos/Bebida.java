package modelProdutos;

public class Bebida extends Produto {
    
    private int tipoBebida; //1 – Água, 2 – Suco, 3 – Refrigerante, 4 – Outro;
    private String embalagem; //350ml, 1l, 2l,

    public Bebida(int tipoBebida, String embalagem, String nome, int quantidade, float preco) {
        super(nome, quantidade, preco);
        this.tipoBebida = tipoBebida;
        this.embalagem = embalagem;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public int getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(int tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    
    
    
    
    
}

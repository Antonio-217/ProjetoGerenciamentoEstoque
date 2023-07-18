package modelProdutos;

public class Produto {
    
    private String nome;
    private int quantidade;
    private float preco;

    public Produto(String nome, int quantidade, float preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public boolean retiradaEstoque(int quantidadeRetirar) {
        boolean resultado;
        if (this.quantidade >= quantidadeRetirar) {
            this.quantidade = this.quantidade - quantidadeRetirar;
            resultado = true;
        } else {
            resultado = false;
        }    
        return resultado;
    }
    
    public boolean entradaEstoque(int quantidadeEntrada) {
        boolean resultado;
        if (quantidadeEntrada > 0) {
            this.quantidade = this.quantidade + quantidadeEntrada;
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}

package aplicativo;

public class Produto {

    //atributos
    private String nome;
    private String codigo;
    private double valor;
    private int qtEstoque;
    

    //Construtor
    public Produto(String codigo, String nome, double valor, int qtEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.qtEstoque = qtEstoque;
    }

    public Produto() {}

    //Gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtEstoque() {
        return qtEstoque;
    }

    public void setQtEstoque(int qtEstoque) {
        this.qtEstoque = qtEstoque;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void baixarEstoque( int baixarEstoque){
        qtEstoque -= baixarEstoque;
    }

    @Override
    public String toString() {
        return String.format("%s  %s", getCodigo(), getNome());
    }

    public Object get(int i) {
        return null;
    }

    public Object getCodigo(int i) {
        return null;
    }

    public Object getProdVendido() {
        return null;
    }

    public Object getProdutos() {
        return null;
    }

  
    

    

    

    
}

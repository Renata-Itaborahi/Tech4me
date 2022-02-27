package fatura;

public class Fatura {

    //atributos
    private String numero;
    private String descricao;
    private int quant_item;
    private double preco_item;
    
    //construtores
    public Fatura () {}

    public Fatura (String numero, String descricao, int quant_item, double preco_item) {
        this.numero = numero;
        this.descricao = descricao;
        this.quant_item = quant_item;
        this.preco_item = preco_item;
        
    }

    //Geteres e seteres
    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public int getQuant_item () {
        return this.quant_item;
    }

    public void setQuant_item (int setQuant_item) {
        this.quant_item = setQuant_item;
    }

    public double getPreco_item () {
        return this.preco_item;
    }

    public void setPreco_item (double preco_item) {
        if (preco_item < 0);
        System.out.println("0.0");
    }

    public void getTotalFatura () {
        int fatura = 0;
        if (fatura < 0);
            System.out.println("0");         
    }

    //sobrecarga getTotalFatura
    public void getTotalFatura (double quant_item) {
            System.out.println("Quantidade de item comprada foi de: ");
    }      
}
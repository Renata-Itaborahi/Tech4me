package aplicativo;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Venda {

    //atributos
    private Double prodVendido;
    private int qtVendida;
    private LocalDate data;
    private Produto produtos;
    public Object format;
    private Double valorProdVendido;

    //Construtor
    public Venda() {}
    
    public Venda(Double prodVendido, int qtVendida, LocalDate data, Double valorProdVendido) {
        this.prodVendido = prodVendido;
        this.qtVendida = qtVendida;
        this.data = data;
        this.valorProdVendido = valorProdVendido;
    }
    
    public Venda(int qtVendida2, Produto produto) {
    }

    //Gets e Sets
    public Double getProdVendido() {
        return prodVendido;
    }

    public void setProdVendido(Double prodVendido) {
        this.prodVendido = prodVendido;
    }

    public int getQtVendido() {
        return qtVendida;
    }

    public void setQtVendido(int qtVendida) {
        this.qtVendida = qtVendida;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public int getQtVendida() {
        return qtVendida;
    }

    public void setQtVendida(int qtVendida) {
        this.qtVendida = qtVendida;
    }

    public Double getValorProdVendido() {
        return valorProdVendido;
    }

    public void setValorProdVendido(Double valorProdVendido) {
        this.valorProdVendido = valorProdVendido;
    }

    @Override
    public String toString() {
        return String.format("Produto vendido : %s - Data da venda: %s - Quantidade vendiada: %s", getProdVendido(), getData(), getQtVendido());
               
    }

    public boolean contains(String nextLine) {
        return false;
    }

    public static Stream<Produto> stream() {
        return null;
    }

    public boolean isAfter(String dt1) {
        return false;
    }

    public boolean isBefore(CharSequence dt2) {
        return false;
    }

    public Object format(Object formatter) {
        return null;
    }

    public static Object getValor() {
        return null;
    }  
}
    

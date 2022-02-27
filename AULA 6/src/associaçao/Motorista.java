package associaçao;

public class Motorista {

    //atributos
    private String nome;
    private int matricula;
    private Carro carro;

    //construtor
    public Motorista(Carro carro) {
        this.carro = carro;
    }

    public Motorista(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Geteres e Seteres
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    //Associação
    public void acelerar(int limite) {
        carro.acelerar(limite);
    }
}

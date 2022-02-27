package funcionario;

public class Funcionario {

    //atributos
    private int mat;
    private String nome;
    private double salario;

    //construtores
    public Funcionario() {}

    public Funcionario (int mat, String nome, double salario){
        this.mat = mat;
        this.nome = nome;
        this.salario = salario;
    }

    // Metdodo gets e sets
    public int getMat() {
        return mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

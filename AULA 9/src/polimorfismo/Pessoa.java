package polimorfismo;

public abstract class Pessoa {
    
    //atributo
    private String nome;
    private String cpf;
    
    // Geters e Seters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract String cumprimentar();

    //polimorfismo
    public String cumprimentar (Pessoa outraPessoa){
        return String.format("Olá, %s. ", outraPessoa.getNome());
    }
  
}
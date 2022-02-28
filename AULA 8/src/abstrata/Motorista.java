package abstrata;

public class Motorista extends Pessoa {

    //atributos
    private int matricula;
    private String habilitação;

    //Geters e Seters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getHabilitação() {
        return habilitação;
    }
    public void setHabilitação(String habilitação) {
        this.habilitação = habilitação;
    }
    @Override
    public String cumprimentar() {
        return "Olá, passageiro!!";
    }
   
}
    


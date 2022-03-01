package polimorfismo;

public class Motorista extends Pessoa {
   
//atributos
private int matricula;
private String habilitacao;

//Geters e Seters
public int getMatricula() {
    return matricula;
}
public void setMatricula(int matricula) {
    this.matricula = matricula;
}
public String getHabilitacao() {
    return habilitacao;
}
public void setHabilitacao(String habilitacao) {
    this.habilitacao = habilitacao;
}
@Override
public String cumprimentar() {
    return "Olá, passageiro!!";
}

//Polimorfismo
@Override
public String cumprimentar(Pessoa outraPessoa) {
    // da forma simples
    //return String.format("Meu nome é %s e vou ser seu motorista hoje.", getNome());

    //forma de uma classe filha acessar o metodo pai
    String original = super.cumprimentar(outraPessoa);
    String complemento = "Meu nome é %s e serei seu motorista hoje!";

    return String.format(original + complemento, getNome());
}

}





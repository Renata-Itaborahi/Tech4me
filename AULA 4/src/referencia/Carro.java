package referencia;

import java.util.InputMismatchException;

public class Carro { //indica em que pacote ele está, entra automatico

    //private String placa;
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;
    
    //construtor
    public Carro() {}

    public Carro(String placa, int numChassi) {
        setPlaca(placa); //utiliza assim uma vez que temos especificações em setPlaca
        this.numChassi = numChassi;
    }
    
    public void acelerar() {
        velocidadeAtual += 1;
    }

    //sobrecarga de metodo
    public void acelerar(int limite) {
        for (int i = velocidadeAtual; i < limite; i++ )
            acelerar();
    }
    

     boolean frear () {
        return false;
    }

    //Metodos especiais gets e sets
    public String getPlaca() {
                if("ERRO!!".equals(letrasPlaca)) {
            return letrasPlaca;  
        } else {
            return letrasPlaca + numerosPlaca;
        }
    } 

    public void setPlaca(String placa) { //"ABC1234"
        /*if(placa.length() == 7 && placa != null && placa.matches("[A-Z]{3}\\d{4}")) {
        this.letrasPlaca = placa.substring(0, 3);
        this.numerosPlaca = Integer.parseInt(placa.substring(3)); 
        } else  {
            //this.letrasPlaca = "ERRO!!";
            throw new InputMismatchException("Os 4 últimos dígitos devem ser numéricos");
        }*/

    if(placa == null) {
        // lançar uma exceção
        throw new NullPointerException("O valor da placa não pode ser nulo");
    }

    if(placa.length() != 7) {
        // lançar uma exceção
        throw new InputMismatchException("A placa tem que ter 7 caracteres");
    }

    if(!placa.matches("[A-Z]{3}\\d{4}")) {
        // lançar uma exceção
        throw new InputMismatchException("A placa tem que ser composta por 3 letras e 4 numeros");
    }

    this.letrasPlaca = placa.substring(0, 3);
    this.numerosPlaca = Integer.parseInt(placa.substring(3));
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    } 
 
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    @Override
    public String toString() {
        
        return String.format("%s - %s ", getPlaca(), getNumChassi());
    }
} 
    


package encapsulamento; //indica em que pacote ele está, entra automatico

public class Carro {
    //se quiser prepara letras e numero da pela ficaria assim.
    //private String placa;
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    

    void acelerar() {

    }
    
    boolean frear (){
        return false;

    }

    //Metodos especiais gets e sets
    public String getPlaca() {
        //equals - faz a comparação entre String antes com a String depois do seu nome.
        if("ERRO!!".equals(letrasPlaca)) {
            return letrasPlaca;  
        } else {
            return letrasPlaca + numerosPlaca;
        }
    } 

    //this.placa passa a ser utilizada no nome que vc deu durante o instanciamento.
    // ou seja carro.
    // o encapsumaneto seria as regras de negocia para proteger seu programa.
    public void setPlaca(String placa) { //"ABC1234"
        //length - tamanho -seria regra de negocio. (diz q/ teria que ter 4 caracteres)
        //matches - ser compativel (diz 3 letras e 4 numeros nesta ordem)
        if(placa.length() == 7 && placa != null && placa.matches("[A-Z]{3}\\d{4}")) {
        //subtring - pegando uma parte da String 
        this.letrasPlaca = placa.substring(0, 3);//peguando uma parte da String
        //parseInt - conversão de uma String para um Inteiro.
        this.numerosPlaca = Integer.parseInt(placa.substring(3)); 
        } else  {
            this.letrasPlaca = "ERRO!!";
        }
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }   
}

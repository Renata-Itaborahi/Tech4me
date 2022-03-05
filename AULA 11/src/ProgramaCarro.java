import java.util.InputMismatchException;

import classes.*;
import exceptions.PlacaInvalidaException;
import interfases.Acelerador;

public class ProgramaCarro {
    public static void main(String[] args) {

        Acelerador[] aceleradores = new Acelerador[3];
        Motorista m1 = new Motorista(123, "AB");

        try {
            aceleradores[0] = new Carro ("ABC1234", 1234567, m1);
            aceleradores[1] = new Carro ("ZXC4567", 7894566, new Motorista(456, "B"));
            aceleradores[2] = m1;
        } catch (PlacaInvalidaException e) {
            e.getMessage();
        }
        
        //para cada um ( ter um indice - vai ter um tipo de variavel de referencia : percorra meu vetor de Aceleradores)
        for (Acelerador a : aceleradores) {
            //getClass - pega o nome da classe
            System.out.printf("Chamada do metodo do objeto do tipo %s", a.getClass().getSimpleName()); 
            System.out.printf(" - Velocidade atual: %d\n", a.acelerar());
        }

        System.out.println("\n------------------------------\n");
        
        Autenticador aut = new Autenticador();
        Motorista mot = new Motorista(123, "AAJ50HA");
        mot.setCpf("12345678901");
        mot.setMatricula(521);
        // essa seria a credencial - 12345678901-521

        if (aut.autenticar(mot)) {
             System.out.println("ACESSO AUTORIZADO!");
        }else {
             System.out.println("ACESSO NEGADO!");
        }

        Carro car;
        try {
             car = new Carro("XYZ1234", 5656456, new Motorista (564, "CDS5695"));

             if(aut.autenticar(car)){
                 System.out.println("Acesso Autorizado!");
        }else {
             System.out.println("Acesso não autorizado!");
            }
        } catch (PlacaInvalidaException e) {
             System.out.println(e.getMessage());
        }
    }
}

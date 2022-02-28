import java.util.Scanner;

import abstrata.Motorista;
import abstrata.Passageiro;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner ler = new Scanner (System.in);
        // int param = 5;
        // //int i = 0;
        // Motorista[] vetorMot = new Motorista[param];
        
        // Motorista m1 = new Motorista();
        // Pessoa p1 = new Pessoa();

        // for(int i = 0; i < param; i++){
        //     //lendo um nome
        //     String nome = ler.nextLine();
        //     //Intanciando um motorista
        //     Motorista m = new Motorista();
        //     //setar um nome
        //     m.setNome(nome);
        //     //colocando o novp motorista M no veotr de motorista
        //     vetorMot[i] = m;
        // }
        
        // System.out.println("----------------------------");
        // System.out.println("----Nomes dos motoristas----");
        //     for(int i = 0; i < param; i++){
        //         System.out.println(vetorMot[i].getNome());
        //     }
          
        
        
        //System.out.printf("habilitação do motorista %s é: %s", m1.getNome(), m1.getHabilitação());

        Motorista m2 = new Motorista();
        Passageiro p2 = new Passageiro();

        System.out.println(m2.cumprimentar());
        System.out.println(p2.cumprimentar());
      }
  }



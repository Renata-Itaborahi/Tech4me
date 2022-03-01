import java.nio.channels.OverlappingFileLockException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

import carro.Carro;
import excecao.PlacaInvalidaException;

public class App {
    public static void main(String[] args) {

        //instancia
        Carro carro = new Carro();

        try {
            carro.setPlaca("ABC1234");
        } catch (PlacaInvalidaException e) {
            e.getMessage();
        }
        
        //dar valor ao atributo
        // try {
        //     // estas seriam exceções não verificadas
        //     //trecho do codigo que pode vir a lançar uma exceção
        //     carro.setPlaca(null);
        // } catch (InputMismatchException ex) {
        //     // ação a ser tomada qd eu tenho um problema de incompatibilidade dfe entrada.
        //     System.out.println(ex.getMessage());
        //     System.out.println("Programa encerrado!");
        //     return;
        // } catch (NullPointerException ex) {
        //     // ação a ser tomada qd eu tenho um problema de apontamento nulo.
        //     System.out.println(ex.getMessage());
        //     System.out.println("O programa continuará com a placa ABC1234");
        //     carro.setPlaca("ABC1234");

            carro.setNumChassi(120123123);
        
            //imprimir o resultado
            System.out.println("PLaca do carro cadastrada: " + carro.getPlaca());

            System.out.println("-------------------");

        //finally
        // Só não ussa o finally se tiver System.exit
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a placa: ");

        try {
            carro.setPlaca(ler.nextLine());
            System.out.println("PLaca do carro é " + carro.getPlaca());
            System.exit(0);
        } catch (PlacaInvalidaException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Entrou no bloco finally.");
            ler.close();
        }
        }

    }
        
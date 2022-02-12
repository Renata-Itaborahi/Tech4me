import java.util.InputMismatchException;

import excecao.Carro;

public class App {
    public static void main(String[] args) throws Exception {

        //instancia
        Carro carro = new Carro();
        
        //dar valor ao atributo
        try {
            // estas seriam exceções não verificadas
            //trecho do codigo que pode vir a lançar uma exceção
            carro.setPlaca(null);
        } catch (InputMismatchException ex) {
            // ação a ser tomada qd eu tenho um problema de incompatibilidade dfe entrada.
            System.out.println(ex.getMessage());
            System.out.println("Programa encerrado!");
            return;
        } catch (NullPointerException ex) {
            // ação a ser tomada qd eu tenho um problema de apontamento nulo.
            System.out.println(ex.getMessage());
            System.out.println("O programa continuará com a placa ABC1234");
            carro.setPlaca("ABC1234");

            carro.setNumChassi(120123123);
        
            //imprimir o resultado
            System.out.println("PLaca do carro cadastrada: " + carro.getPlaca());
            }
        }
    }
        


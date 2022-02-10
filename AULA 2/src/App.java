import encapsulamento.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia
        Carro carro = new Carro();

        //valor ao atributo
        carro.setPlaca("ABC1234");
        carro.setNumChassi(120123123);

        //imprimir o resultado
        System.out.println("PLaca do carro cadastrada: " + carro.getPlaca());
    }
}

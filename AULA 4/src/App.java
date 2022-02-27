import referencia.Carro;

public class App {
    public static void main(String[] args) throws Exception {

        //Criando obj c1 e c2
        Carro c1, c2;

        //instanciando o obj c1 com construtor vazio
        c1 = new Carro();

        c1.setPlaca("ABC1234");
        c1.setNumChassi(123456);

        //instanciando o obj c2 com construtor personalizado
        c2 = new Carro ("XYZ5678", 56789);

        //c2.setPlaca("XYZ5678");

        System.out.println("Placa do carro 1: " + c1.getPlaca());
        System.out.println("Placa do carro 2: " + c2.getPlaca());
        System.out.println("-----------------------------------");

        Carro c3;

        c3 = new Carro("EFG8945", 15478);
         //sem dar valor a aceleração
        System.out.println("Placa do carro 3: " + c3.getPlaca());
        System.out.println("Velocidade atual do carro 3 : " + c3.getVelocidadeAtual());
        System.out.println("-----------------------------------");

        //dando valor no caso o valor seria de um em um
        c3.acelerar();
        System.out.println("Velocidade atual do carro 3 : " + c3.getVelocidadeAtual());
        System.out.println("-----------------------------------");

        // nesse caso quero que seja 10, faço um loop
        for (int i=0; i < 9; i++) {
            c3.acelerar();
        }
        System.out.println("Velocidade atual do carro sem sobrecarga : " + c3.getVelocidadeAtual());
        System.out.println("-----------------------------------");

        c3.acelerar(50);
        System.out.println("Velocidade atual do carro com sobrecarga : " + c3.getVelocidadeAtual());

    }

}
        
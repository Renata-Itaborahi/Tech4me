import associaçao.Carro;
import associaçao.Motorista;

public class App {
    public static void main(String[] args) throws Exception {

        //instanciar
        // Este seria o Motorista acelerar o carro
        Carro c1 = new Carro("ABC1234", 123456);
        Motorista m1 = new Motorista(c1);

        System.out.println("***Velocidade atual do carro " + c1.getVelocidadeAtual());
        System.out.println("PASSAGEIRO - Motorista, acelere o carro até 100km/h");
        System.out.println("MOTORISTA - É para já.");
        m1.acelerar(100);
        System.out.println("***Velocidade atual do carro " + c1.getVelocidadeAtual());

        System.out.println("\n-------------------------------------\n");

        // Agora seria carro associado ao motorista
        //instanciar
        Motorista m2 = new Motorista("Rodrigo", 1234);
        Carro c2 = new Carro("XWZ4567", 78964, m2);

        System.out.println("***Velocidade atual do carro " + c2.getVelocidadeAtual());
        System.out.println("PASSAGEIRO - Motorista, acelere o carro até 100km/h");
        System.out.println("MOTORISTA - É para já.");
        c2.getMotorista().acelerar(100);
        System.out.println("***Velocidade atual do carro " + c2.getVelocidadeAtual());
       
    }

}


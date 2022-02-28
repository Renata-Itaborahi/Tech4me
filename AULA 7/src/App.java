import herança.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
      
        //instanciar
        Motorista m1 = new Motorista();

        m1.setMatricula(1234);
        m1.setHabilitação("AB");
        m1.setNome("Rodrigo");
        
        System.out.printf("habilitação do motorista %s é: %s", m1.getNome(), m1.getHabilitação());
    }
}

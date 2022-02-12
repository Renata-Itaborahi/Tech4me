import conta.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        //instanciar
        Conta c1 = new Conta();

        //setar nome
        c1.setNome("Renata");

        //setar saldo inicial
        c1.setSaldo(10.0);
        System.out.println ("Saldo atual é " + c1.getSaldo());
        System.out.println ("\n\n");

        //depositar um novo valor
        c1.depositar(15.0);
        System.out.println ("Saldo atual é " + c1.getSaldo());
        System.out.println ("\n\n");

        //imprimir titular da conta
        System.out.println ("O nome de titular é " + c1.getNome() );
    }
}

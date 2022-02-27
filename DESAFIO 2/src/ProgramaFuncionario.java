import java.util.Scanner;

import funcionario.Funcionario;

public class ProgramaFuncionario {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        int qtdFuncionario;
        int cont = 0;
        double somaSalario = 0;

        System.out.print ("Informe a quantidade de funcionario que deseja cadastrar? ");
        qtdFuncionario = ler.nextInt();
        ler.nextLine();

        do {
            //Desta forma seria sem o metodo construtor cadastrado, ou seja usa o construtir vazio
            /*Funcionario func = new Funcionario();

            System.out.println ("-----------FUNCIONARIO------------");
            System.out.print ("Matricula: ");
            func.setMat(ler.nextInt());
            ler.nextLine();

            System.out.print ("Nome do funcionario: ");
            func.setNome(ler.nextLine());

            System.out.print ("Valor salarial de R$ ");
            func.setSalario(ler.nextDouble());
            ler.nextLine();*/

            //este seria a forma com o metodo construtor ou seja usa o construtir c/ parametro.
            System.out.println ("-----------FUNCIONARIO------------");
            System.out.print ("Matricula: ");
            int matLida = ler.nextInt();
            ler.nextLine();

            System.out.print ("Nome do funcionario: ");
            String nomeLida = ler.nextLine();
            
            System.out.print ("Valor salarial de R$ ");
            double salarioLida = ler.nextDouble();
            ler.nextLine();

            Funcionario func = new Funcionario(matLida, nomeLida, salarioLida);

            somaSalario += func.getSalario();

            System.out.println (somaSalario);
            cont++;
        } while (cont < qtdFuncionario);

        double mediaSalario = (somaSalario/qtdFuncionario);
        System.out.println ("\n\nMedia salarial dos funcionarios foi de " + mediaSalario);

        ler.close();
    }
}

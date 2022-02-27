
import java.util.Scanner;

import fatura.Fatura;

public class Programafatura {

    public static void main(String[] args ) {

        Scanner ler = new Scanner (System.in);
        int qtdProduto;
        int cont = 0;
        int somaQuant_item = 0;
        double somaPreco_item = 0;

        System.out.print ("Informe a quantidade de produtos comprados. ");
        qtdProduto = ler.nextInt();
        ler.nextLine();
        
    do 
    {
        System.out.println ("-----------PRODUTO------------");
        System.out.print ("O numero da NF: ");
        String numero = ler.nextLine();
        
        System.out.print ("Descrição: ");
        String descricao = ler.nextLine();
    
        System.out.print ("Quantidade de produto comprado: ");
        int quant_item = ler.nextInt();
        ler.nextLine();

        System.out.print ("Valor unitario do produto é: R$ ");
        double preco_item = ler.nextDouble();
        ler.nextLine();

        Fatura prod = new Fatura(numero, descricao, quant_item, preco_item);

        somaQuant_item += prod.getQuant_item();
        somaPreco_item += prod.getPreco_item();

        System.out.println (somaQuant_item);
        System.out.println (somaPreco_item);
        cont++;
    }  while (cont < qtdProduto);
    

    double totalFatura = (somaQuant_item * somaPreco_item);
    System.out.println ("------------FATURA------------");
    System.out.print("\nValor total da fatura foi de R$ " + totalFatura );
     
    ler.close();
    }
    }



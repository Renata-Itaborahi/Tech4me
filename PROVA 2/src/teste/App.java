package teste;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import aplicativo.Produto;
import aplicativo.Venda;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        ArrayList<Produto> produto = new ArrayList<>();
        ArrayList<Venda> venda = new ArrayList<>();
        
        int opcao;

        do {
            System.out.println("---------------");
            System.out.println("\n*\nMENU\n*\n");
            System.out.println("---------------");

            System.out.println("1 - Incluir produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Listagem de produtos");
            System.out.println("4 - Vendas por período trabalhado - detalhado");
            System.out.println("5 - Realizar venda");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
                
            opcao = ler.nextInt();
            ler.nextLine();

            if (opcao == 1) {
                System.out.println("--------------------------");
                System.out.println("------INCLUIR PRODUTO-----");
                System.out.println("--------------------------");

                //Adicionar produto na lista
                System.out.print ("Nome do produto: ");
                String nome = ler.nextLine();

                System.out.print ("Codigo do produto: ");
                String codigo = ler.nextLine();
                
                System.out.print ("Valor unitario do produto é: R$ ");
                double valor = ler.nextDouble();
                ler.nextLine();

                System.out.print ("Quantidade em estoque: ");
                int qtEstoque = ler.nextInt();
                ler.nextLine();

                //criar objeto da classe
                Produto objProduto = new Produto(codigo, nome, valor, qtEstoque);

                // guarda na ArrayList
                produto.add(objProduto);

                System.out.println("\nProdutos cadastrado com sucesso.");
                voltarMenu(ler);

            } else if (opcao == 2) {
                System.out.println("-----------------------------");
                System.out.println("-----CONSULTAR PRODUTOS------");
                System.out.println("-----------------------------");
                              
                //Localizar produto pelo codigo
                boolean confirmar = false;
                System.out.println("Total de produto cadastrado na loja e: " + produto.size());
                System.out.println("-----------------------------");

                System.out.printf ("Informe o codigo do produto: ");
                String localizarCodigo = ler.nextLine();

                for (Produto pr : produto) {
                    if (pr.getCodigo().equals(localizarCodigo)) {
                        confirmar = true;
                    }
                    if (confirmar) {
                        System.out.println("\n---Produto encontrado---\n");
                        System.out.printf ("Nome do produto: %s\n", pr.getNome());
                        System.out.printf ("Codigo do produto: %s\n", pr.getCodigo());
                        System.out.printf ("Valor unitario do produto: %s\n", pr.getValor());
                        System.out.printf ("Quantidade em estoque: %s\n", pr.getQtEstoque());
                    } else {
                        System.out.println("\nProduto não localizado.");
                    }
                    voltarMenu(ler);
                }
             
            } else if (opcao == 3) {
             System.out.println("------------------------------");
             System.out.println("-----LISTAGEM DE PRODUTOS-----");
             System.out.println("------------------------------");

             for (Produto pr : produto) {
                System.out.printf ("Codigo: %s\n", pr.getCodigo());
                System.out.printf ("Nome do produto: %s\n", pr.getNome());
                System.out.printf ("Valor unitario: R$ %s\n", pr.getValor());
                System.out.printf ("Quantidade em estoque: %s\n", pr.getQtEstoque());  
             }

             IntSummaryStatistics informacao = produto.stream()
             .collect(Collectors.summarizingInt(Produto:: getQtEstoque));
             System.out.println ("\n---Sumatização dos produtos---");
             System.out.printf ("Media: %s\n", informacao.getAverage());
             System.out.printf ("Valor minimo: %s\n", informacao.getMin());
             System.out.printf ("Valor maximo: %s\n", informacao.getMax());

             voltarMenu(ler);
                
            } else if (opcao == 4) {
             System.out.println("------------------------------------");
             System.out.println("-----VENDAS PERIODO TRABALHADO------");
             System.out.println("------------------------------------");
             
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.print ("Informe a data inicial: ");
            String dtInicial= ler.nextLine();
                
            System.out.print ("Informe a data final: ");
            String dtFinal = ler.nextLine();
            

             for (Venda dtVenda : venda) {
                if (dtVenda.isAfter ((String) dtInicial) && dtVenda.isBefore(dtFinal)); 
             }

        
             Double filtroRelatorio = venda.stream()
             .filter(p -> p instanceof Venda)
             .collect(Collectors.averagingDouble(Venda::getProdVendido));
             
             List<Venda> venda1 = obterDados();
             Map<LocalDate, List<Venda>> vendasPorData;

             vendasPorData = venda1.stream()
             .collect(Collectors.groupingBy(Venda::getData));

             System.out.println(vendasPorData);
             
             vendasPorData.entrySet()
             .forEach( v -> System.out.printf ("Data: %s - Valor medio da venda: %.2f", 
              v.getKey().format(formatter), v.getValue())
             );

             Map<LocalDate, List<Venda>> mediaPorPeriodo = venda.stream()
             .collect(Collectors.groupingBy(Venda:: getData));

                 voltarMenu(ler); 
              
 
             } else if (opcao == 5){
             System.out.println("------------------------------------");
             System.out.println("-----VENDAS PERIODO TRABALHADO------");
             System.out.println("------------------------------------");

                System.out.print("Informe o codigo do produto que quer vender: ");
                String codVenda = ler.nextLine();

            if (produto.size() < 1){
                System.out.println("Produto não cadastrado.");                   
            }

            int i = -1;
            for (Produto pr : produto){
                if (pr.getCodigo().equals(codVenda)){
                    i = produto.indexOf(pr);
                }
                if (i == -1) {
                    System.out.println("Produto não encontrado");              
                }
                
                     System.out.printf("\nO codigo %s informado é do produto %s. ", pr.getCodigo(), pr.getNome());
                    
                     System.out.print("\nQuantidade que quer vender: ");
                     int qtVender = ler.nextInt();
                     ler.nextLine();

                     try {
                        System.out.print("\nData da venda foi: ");
                        int dtVender = ler.nextInt();
                        ler.nextLine();
                     } catch (InputMismatchException err) {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                     }

                     Produto pr2 = new Produto();
                     pr2 = produto.get(i);

                     if (qtVender > pr2.getQtEstoque()) {
                        System.out.println("Quanto insuficiente em estoque");
                    }

                    System.out.printf("%s %s(s) vendido(a) com sucesso! \n", qtVender, produto.get(i).getNome());

                     try {
                        produto.get(i).baixarEstoque(qtVender);
                    } catch (NullPointerException ex) {
                         System.out.println("Produto não pode ser vendido, zerado no estoque.");
                     }

                    Venda v = new Venda(qtVender, produto.get(i));
                    venda.add(v);
                }
                    
                voltarMenu(ler);
             } else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
             }
        } while (opcao != 0);

        System.out.println("Fim do programa!");
      
        ler.close();

    } 

    private static void voltarMenu(Scanner ler) throws InterruptedException, IOException 
    {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        ler.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");

        System.out.flush();

    }
    private static List<Venda> obterDados() {
        List<Venda> venda = new ArrayList<>();
            return venda;
}
}

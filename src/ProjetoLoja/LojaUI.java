package ProjetoLoja;

import Utils.AppCor;
import java.util.Scanner;

/**
 * @author glmgu on 05/10/2022
 */
public class LojaUI {
    private Loja minhaLoja;
    private Scanner entrada;


    public LojaUI(){
        minhaLoja = new Loja("Minha Loja POO" ,10);
        entrada = new Scanner(System.in);

    }

    public void menu(){
        int op;
        do{
            System.out.println("\n"+minhaLoja.getNomeLoja()+"\n");
            System.out.println(AppCor.GREEN + "1. Adicionar Produtos"+ AppCor.RESET) ;
            System.out.println("2. Consultar Produtos");
            System.out.println("3. Buscar Produtos");
            System.out.println(AppCor.GREEN_BOLD + "4. Total valor de estoque"+AppCor.RESET);
            System.out.println(AppCor.RED+"0. Sair\n"+AppCor.RESET);
            System.out.print("Informe a opção desejada (0 a 5): ");
            op = entrada.nextInt();
            entrada.nextLine();

            switch(op){
                case 1:
                adicionarProdutos();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0: break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(op!=0);

    }

    public void adicionarProdutos(){
        String nome;
        double valor;
        int quantidade;
        int tiposProdutos;

        System.out.println("Vamos adiconar seus produtos");
        System.out.println("Quanto tipo de produtos deseja adicionar?");
        tiposProdutos = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i <tiposProdutos ; i++) {
            System.out.println("Digite o nome do produto");
            nome =  entrada.nextLine();
            System.out.println("Digite a quantidade de produto");
            quantidade = entrada.nextInt();
            System.out.println("Digite o valor unitário do produto");
            valor = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Você adicionou o produto " + nome + " na quantidade "+quantidade);
            new Produto (nome,quantidade,valor);
            minhaLoja.setnProdutos(quantidade + minhaLoja.getnProdutos());
        }
        System.out.println("A quantidade de produto em estoque é: ");
        System.out.println(minhaLoja.getnProdutos());


    }

}


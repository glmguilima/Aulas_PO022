package Livraria;

import Utils.AppCor;

import java.util.Scanner;

/**
 * @author glmgu on 13/10/2022
 */
public class Menu {
    Scanner entrada = new Scanner(System.in);
    int op;
    ListaProdutos lista = new ListaProdutos();
    public void menu(){
        do{
            telaInicial();
            op = entrada.nextInt();
            entrada.nextLine();
            switch(op){
                case 1:
                    addLivro();
                    break;
                case 2:
                    addRevista();
                    break;
                case 3:
                    addDvds();
                    break;
                case 4:
                    System.out.println(lista.toString());
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0: break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println("digite uma opção correta");
            }
        }while(op!=0);

    }

    public void telaInicial(){
        System.out.println("\n"+AppCor.CYAN_UNDERLINED +"Livraria Pampa"+"\n"+AppCor.RESET);
        System.out.println(AppCor.GREEN_BRIGHT + "1. Adicionar Livros"+ AppCor.RESET) ;
        System.out.println(AppCor.GREEN_BRIGHT + "2. Adicionar Revista"+ AppCor.RESET);
        System.out.println(AppCor.GREEN_BRIGHT + "3. Adicionar DVDs"+ AppCor.RESET);
        System.out.println(AppCor.BLUE + "4. Listar todos os itens" + AppCor.RESET);
        System.out.println(AppCor.BLUE+"5. Buscar um item"+ AppCor.RESET);
        System.out.println(AppCor.RED+"6. Excluir um item"+ AppCor.RESET);
        System.out.println(AppCor.PURPLE + "0. Sair\n"+ AppCor.RESET);
        System.out.print(AppCor.WHITE_BOLD+ "Informe a opção desejada (0 a 6): "+ AppCor.RESET);
    }
    public void addLivro(){
        Livros livros;
        String nome;
        double valor;
        System.out.println("Vamos adicionar um livro.");
        System.out.println("Digite o nome do livro:");
        nome = entrada.nextLine();
        System.out.println("Digite o valor do livro:");
        valor=entrada.nextDouble();
        entrada.nextLine();
        livros = new Livros(nome,valor);
        System.out.println("Digite o Autor do livro:");
        nome=entrada.nextLine();
        livros.setAutor(nome);
        System.out.println("Digite o Editora do livro:");
        nome= entrada.nextLine();
        livros.setEditora(nome);
        lista.inserirProduto(livros);
    }

    public void addRevista(){
        Revista revista;
        String nome;
        double valor;
        System.out.println("Vamos adicionar uma Revista.");
        System.out.println("Digite o nome do Revista:");
        nome = entrada.nextLine();
        System.out.println("Digite o valor do Revista:");
        valor=entrada.nextDouble();
        entrada.nextLine();
        revista = new Revista(nome,valor);
        System.out.println("Digite o Editora do Revista:");
        nome= entrada.nextLine();
        revista.setEditora(nome);
        lista.inserirProduto(revista);

    }
    public void addDvds(){
        DVDs dvds;
        String nome;
        double valor;
        System.out.println("Vamos adicionar um DVD.");
        System.out.println("Digite o nome do DVD:");
        nome = entrada.nextLine();
        System.out.println("Digite o valor do DVD:");
        valor=entrada.nextDouble();
        entrada.nextLine();
        dvds = new DVDs(nome,valor);
        System.out.println("Digite o Autor do DVD:");
        nome=entrada.nextLine();
        dvds.setAutor(nome);
        System.out.println("Digite o Estilo do DVD:");
        nome= entrada.nextLine();
        dvds.setEstilo(nome);
        lista.inserirProduto(dvds);
    }

}

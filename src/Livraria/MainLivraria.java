package Livraria;

import Utils.AppCor;

/**
 * @author glmgu on 10/10/2022
 *
A livraria CC trabalha com a venda de livros, revistas e dvds, onde cada produto da livraria tem, no mínimo,
os seguintes atributos: código, nome e valor. Além dos atributos comuns de todos os produtos, cada tipo de
produto possui os seguintes atributos extras:
(a)Escreva uma classe abstrata que modela o comportamento de qualquer produto da livraria.
(b) Escreva as classes que modelam o tipo de produto Livro, Revista e DVD, com seus atributos,
construtores e métodos de acesso. (Use os conceitos de herança e polimorfismo quando possível)
(c) Escreva o método main que: (use os conceitos de herança e polimorfismo quando possível)
● instancia duas revistas (r1 e r2);
● modifica o atributo valor de r1 para R$ 10,00 (dez reais);
● modifica o atributo nome de r2 para “Info Exame”;
● modifica o atributo editora de r2 para “Globo”;
(d) Escreva uma interface IListaProdutos que permita incluir, consultar e remover produtos da livraria.
(e) Escreva uma classe ListaProdutos que implementa a interface IListaProdutos.
(f) Escreva o método main que: (use os conceitos de herança e polimorfismo quando possível)
● instancia diferentes tipos de produtos da livraria;
● adiciona os produtos na lista de produtos da livraria;
● lista todos os produtos da livraria;

Tipo Atributos extras
Livro Autor, editora
Revista Editora
Dvd Autor, estilo


 */
public class MainLivraria {
    public static void main(String[] args) {
        ListaProdutos lista = new ListaProdutos();
        Revista r1 = new Revista("reviNova",5);
        Revista r2 = new Revista("revNova2",5);
        Livros l1 = new Livros("LivPoo",100);
        lista.inserirProduto(r1);
        lista.inserirProduto(r2);
        lista.inserirProduto(l1);
        l1.setAutor("euMesmo");
        l1.setEditora("Pampa");
        r1.setEditora("Editora01 ");
        r1.setValor(10);
        r2.setNome("Info Exame");
        r2.setEditora("Globo");
        DVDs d1=new DVDs("dvd01",15);
        d1.setAutor("desconhecido");
        d1.setEstilo("Estudos");
        lista.inserirProduto(d1);
        System.out.println(AppCor.GREEN_BOLD+ r1.toString()+AppCor.RESET);
        System.out.println(AppCor.BLUE_BOLD+l1.toString()+AppCor.RESET);
        System.out.println(AppCor.CYAN_BOLD+d1.toString()+AppCor.RESET);
        System.out.println(lista.toString()); //formatar isso
    }
}


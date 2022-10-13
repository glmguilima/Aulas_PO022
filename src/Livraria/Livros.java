package Livraria;

/**
 * @author glmgu on 10/10/2022
 */
public class Livros extends Produto{
    private String autor,editora;

    public Livros(String nome, double valor) {
        super(nome, valor);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro: \n" + super.toString() + "Autor = " + autor + "\nEditora = " + editora+"\n";

    }
}

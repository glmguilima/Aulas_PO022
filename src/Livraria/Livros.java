package Livraria;

/**
 * @author glmgu on 10/10/2022
 */
public class Livros extends Produto{
    private String autor,editora;

    public Livros(int codigo, String nome, double valor) {
        super(codigo, nome, valor);
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
        return "Livros {" +
                "autor=" + autor +
                ", editora=" + editora +
                "} " + super.toString();
    }
}

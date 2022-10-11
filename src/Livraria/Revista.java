package Livraria;

/**
 * @author glmgu on 10/10/2022
 */
public class Revista extends Produto{
    private String editora;

    public Revista(int codigo, String nome, double valor) {
        super(codigo, nome, valor);
    }


    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }


    @Override
    public String toString() {
        return "Revista  { Editora= " + editora + "}\'" + super.toString();
    }
}

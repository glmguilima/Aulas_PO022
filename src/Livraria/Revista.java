package Livraria;

/**
 * @author glmgu on 10/10/2022
 */
public class Revista extends Produto{
    private String editora;

    public Revista(String nome, double valor) {
        super(nome, valor);
        editora = "";
    }
    public Revista(String nome, double valor, String editora) {
        super(nome, valor);
        this.editora=editora;
    }


    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }


    @Override
    public String toString() {
        return "Revista: \n" + super.toString() +  "Editora = " + editora +"\n";
    }
}

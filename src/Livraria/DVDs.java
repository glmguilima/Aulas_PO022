package Livraria;

/**
 * @author glmgu on 10/10/2022
 */
public class DVDs extends Produto{
    private String autor, estilo;

    public DVDs(String nome, double valor) {
        super(nome, valor);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "DVDs \n" +super.toString()+
                "autor = " + autor +
                "\nestilo = " + estilo ;
    }
}

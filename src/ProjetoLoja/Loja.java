package ProjetoLoja;

import java.io.Serializable;

/**
 * @author glmgu on 29/09/2022
 */
public class Loja {
   private String nomeLoja;
   private int numMaxProdutos;
    private int nProdutos = 0;

    public Loja (String nomeLoja,int numMaxProdutos){
        this.nomeLoja = nomeLoja;
        this.numMaxProdutos=numMaxProdutos;
    }



    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public int getNumMaxProdutos() {
        return numMaxProdutos;
    }

    public void setNumMaxProdutos(int numMaxProdutos) {
        this.numMaxProdutos = numMaxProdutos;
    }

    public int getnProdutos() {
        return nProdutos;
    }

    public void setnProdutos(int nProdutos) {
        this.nProdutos = nProdutos;
    }

}

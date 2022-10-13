package Livraria;

/**
 * @author glmgu on 10/10/2022
 */
public abstract class Produto {
int codigo ;
String nome;
double valor;
private static int codigoGeral=1; //utilizar para implementar codigo automatico


    public Produto (String nome,double valor){
        this.codigo=codigoGeral++;
        this.nome = nome;
        this.valor=valor;
    }

    @Override
    public String toString() {
        return  "nome = " + nome +"\n"+
                "codigo = " + codigo +"\n"+
                "valor = " + valor + "\n" ;
    }

    public int getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

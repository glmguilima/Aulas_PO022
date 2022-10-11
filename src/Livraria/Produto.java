package Livraria;

/**
 * @author glmgu on 10/10/2022
 */
public abstract class Produto {
int codigo ;
String nome;
double valor;


    public Produto (int codigo, String nome,double valor){
        this.codigo=codigo;
        this.nome = nome;
        this.valor=valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

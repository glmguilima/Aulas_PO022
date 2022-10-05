package Aula1;

/**
 * @author glmgu on 03/10/2022
 */
public class Titular {
    private String nome;
    private String cidade;
    private String estado;
    private  String CPF;

    public Titular(String nome, String CPF, String cidade, String estado) {
        this.nome = nome;
        this.CPF = CPF;
        this.cidade = cidade;
        this.estado = estado;
    }
    public Titular(String nome, String CPF){
        this(nome,CPF,"","");
    }

    public void setCPF(String CPF) { this.CPF = CPF; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", CPF=" + CPF +
                '}';
    }
}

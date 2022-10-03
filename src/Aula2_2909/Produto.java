package Aula2_2909;

/**
 * @author glmgu on 29/09/2022
 */

/*4.Crie uma classe Produto. Essa classe deve possuir três atributos: nome,
quantidade e preço unitário. Não esqueço de fornecer os métodos para
consultar e modificar os valores dos atributos.
5. Usando a classe Produto, desenvolva um programa  que Linguagem Java
um estoque com diferentes tipos de produtos. Ao usuário deve ser permitido
informar quantos produtos deseja cadastrar e, então, indicar, para cada
produto, seu nome, quantidade e preço. Ao final, o programa deve exibir todos
os produtos em estoque com suas informações correspondentes.*/

public class Produto {
    private String nome;
    private int quant;
    private double valor;


    public  Produto (String nome, int quant, double valor){
        this.nome = nome;
        this.quant = quant;
        this.valor = valor;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

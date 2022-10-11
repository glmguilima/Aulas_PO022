package Livraria;
import java.util.ArrayList;

/**
 * @author glmgu on 10/10/2022
 */
public class ListaProdutos implements IListaProdutos{
    ArrayList<Produto> lista = new ArrayList();

    @Override
    public boolean inserirProduto(Produto produto) {
        return lista.add(produto);
    }


    @Override
    public Produto consultarProduto(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getCodigo()==codigo){
                return lista.get(i);
            }
        }return null;
    }

    @Override
    public boolean excluirProduto(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo()==codigo){
                lista.remove(lista.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ListaProdutos{" +
                "lista=" + lista + "\n"+
                '}';
    }
}

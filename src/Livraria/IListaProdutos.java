package Livraria;

/**
 * @author glmgu on 10/10/2022
 */
public interface IListaProdutos {
    public boolean inserirProduto(Produto p);
    public boolean excluirProduto(int codigo);
    public Produto consultarProduto(int codigo);
}

import java.util.ArrayList;


public class ProdutoController{

    private  ArrayList<produto> ProdutosRepository = new ArrayList<>();


    public void SaveProduto(produto produto) {
        ProdutosRepository.add(produto);
    }

    public ArrayList<produto> ListaProdutos() {
        return  ProdutosRepository;
    }
}

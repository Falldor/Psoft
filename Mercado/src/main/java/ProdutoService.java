import java.util.ArrayList;
import java.util.Date;


public class ProdutoService {

    private  ProdutoRepository ProdutosRep = new ProdutoRepository();


    public void SaveProduto(int ID, String nomeP, String fabricante, double precoP) {
        produto prod = new produto(nomeP, fabricante, precoP);
        this.ProdutosRep.produtoRepository.put(ID, prod);
    }

    public void ListaProdutos() {
        for (Integer key: ProdutosRep.produtoRepository.keySet()){
            System.out.println(ProdutosRep.produtoRepository.get(key));
        }
    }
}

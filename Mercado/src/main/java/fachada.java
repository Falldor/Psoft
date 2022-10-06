import java.util.Date;

public class fachada {

    private ProdutoService produtoService;
    private LoteService loteService;

    public fachada(){
        this.produtoService = new ProdutoService();
        this.loteService = new LoteService();
    }

    public void criarProduto(int ID, String produto, String fabricante, double preco){
        this.produtoService.SaveProduto(ID,produto, fabricante, preco);
    }
    public void listaProdutos(){
       this.produtoService.ListaProdutos();
    }

    public void criarLote(int ID, String nomeP, String fabricante, double precoP, int quantidade){
        this.loteService.SaveLote(ID, nomeP,fabricante,precoP,quantidade);
    }

    public void listaLotes(){
        this.loteService.ListaLotes();
    }
}

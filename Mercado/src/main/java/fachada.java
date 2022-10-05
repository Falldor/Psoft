import java.util.Date;

public class fachada {

    private  ProdutoController produtoService;
    private  LoteController loteService;

    public void criarProduto(String produto, String fabricante, double preco){
        this.produtoService.SaveProduto();
    }
    public void listaProdutos(){
        System.out.println(this.produtoService.ListaProdutos());
    }

    public void criaLotes(String nome, String fabricante, double preco, int quantidade, Date data){
        this.loteService.SaveLote(nome,fabricante,preco,quantidade,data);
    }

    public void lisaLote(){
        System.out.println(this.loteService.ListaLote());
    }


}

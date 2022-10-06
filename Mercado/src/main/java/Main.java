import java.util.Date;

public class Main {

    public static void main(String[] args){
        fachada controller = new fachada();
        controller.criarProduto(1,"prod A","Fabrica A",10.50);
        controller.listaProdutos();
        controller.criarLote(1, "prod A", "Fabricante A", 10.50, 10);
        controller.listaLotes();
    }
}

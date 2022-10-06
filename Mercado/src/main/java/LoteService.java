import java.util.ArrayList;
import java.util.Date;

public class LoteService {

    private LoteRepository LotesRep = new LoteRepository();

    public void SaveLote(int ID, String nomeP, String fabricante, double precoP, int quantidade) {
        produto prod = new produto(nomeP, fabricante, precoP);
        Date data = new Date();
        lote newLote = new lote(quantidade, data, prod);
        this.LotesRep.loteRepository.put(ID, newLote);
    }

    public void ListaLotes() {
        for (Integer key: LotesRep.loteRepository.keySet()){
            System.out.println(LotesRep.loteRepository.get(key));
        }
    }
}

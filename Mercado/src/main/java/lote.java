import java.util.Date;

public class lote {
    private int Quant;
    private Date Validade;
    private produto Prod;

    public lote(int quant, Date validade, produto prod) {
        Quant = quant;
        Validade = validade;
        Prod = prod;
    }

    public int getQuant() {
        return Quant;
    }

    public void setQuant(int quant) {
        Quant = quant;
    }

    public Date getValidade() {
        return Validade;
    }

    public void setValidade(Date validade) {
        Validade = validade;
    }

    public produto getProd() {
        return Prod;
    }

    public void setProd(produto prod) {
        Prod = prod;
    }
}

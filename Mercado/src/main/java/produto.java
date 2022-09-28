public class produto {
    private String Nome;
    private String Frabicante;
    private double Preco;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setFrabicante(String frabicante) {
        this.Frabicante = frabicante;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }

    public String getNome() {
        return Nome;
    }

    public String getFrabicante() {
        return Frabicante;
    }

    public double getPreco() {
        return Preco;
    }

    public produto(String nome, String frabicante, double preco) {
        this.Nome = nome;
        this.Frabicante = frabicante;
        this.Preco = preco;
    }
}

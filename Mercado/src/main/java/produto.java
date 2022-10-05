public class produto {
    private String Nome;
    private String Fabricante;
    private double Preco;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setFabricante(String frabicante) {
        this.Fabricante = frabicante;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getFabricante() {
        return this.Fabricante;
    }

    public double getPreco() {
        return this.Preco;
    }

    public produto(String nome, String frabicante, double preco) {
        this.Nome = nome;
        this.Fabricante = frabicante;
        this.Preco = preco;
    }

    @Override
    public String toString() {
        String novaString = "Nome: " + this.Nome + ", Fabricante: " + this.Fabricante + ", Preço: " + this.Preco;
        return novaString;
    }
}

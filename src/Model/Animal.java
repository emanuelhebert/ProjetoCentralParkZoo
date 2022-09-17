package Model;

public class Animal {
    String tamanho;
    int quantidadeDePatas;
    String raca;
    String tipo;
    Boolean temRabo;
    public Animal(String tamanho, int quantidadeDePatas, String raca, String tipo, Boolean temRabo) {
        this.tamanho = tamanho;
        this.quantidadeDePatas = quantidadeDePatas;
        this.tipo = tipo;
        this.temRabo = temRabo;
        this.raca = raca;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getTemRabo() {
        return temRabo;
    }

    public void setTemRabo(Boolean temRabo) {
        this.temRabo = temRabo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tamanho='" + tamanho + '\'' +
                ", quantidadeDePatas=" + quantidadeDePatas +
                ", raca='" + raca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", temRabo=" + temRabo +
                '}';
    }
}
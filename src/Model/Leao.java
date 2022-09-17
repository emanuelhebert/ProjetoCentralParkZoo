package Model;

public class Leao extends Animal{
    String habitat;
    boolean temJuba;
    boolean reiDaSelva;

    public Leao(String tamanho,
                int quantidadeDePatas,
                String raca,
                String tipo,
                Boolean temRabo,
                String habitat,
                boolean temJuba,
                boolean reiDaSelva) {
        super(tamanho, quantidadeDePatas, raca, tipo, temRabo);
        this.habitat = habitat;
        this.temJuba = temJuba;
        this.reiDaSelva = reiDaSelva;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isTemJuba() {
        return temJuba;
    }

    public void setTemJuba(boolean temJuba) {
        this.temJuba = temJuba;
    }

    public boolean isReiDaSelva() {
        return reiDaSelva;
    }

    public void setReiDaSelva(boolean reiDaSelva) {
        this.reiDaSelva = reiDaSelva;
    }

    public Leao(String tamanho, int quantidadeDePatas, String raca, String tipo, Boolean temRabo) {
        super(tamanho, quantidadeDePatas, raca, tipo, temRabo);
    }

    @Override
    public int getQuantidadeDePatas() {
        return super.getQuantidadeDePatas();
    }

    @Override
    public String getRaca() {
        return super.getRaca();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public Boolean getTemRabo() {
        return super.getTemRabo();
    }

    @Override
    public String toString() {
        return "Leao{" +
                "habitat='" + habitat + '\'' +
                ", temJuba=" + temJuba +
                ", reiDaSelva=" + reiDaSelva +
                "tamanho='" + tamanho + '\'' +
                ", quantidadeDePatas=" + quantidadeDePatas +
                ", raca='" + raca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", temRabo=" + temRabo +
                '}';
    }
}

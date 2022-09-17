package Model;

public class Golfinho extends Animal{
    boolean possuiEscamas;
    boolean ehDocil;
    int quantidadeDeNadadeiras;

    public Golfinho(
            boolean possuiEscamas,
            boolean ehDocil,
            String tamanho,
            int quantidadeDeNadadeiras,
            int quantidadeDePatas,
            String raca,
            String tipo,
            Boolean temRabo){
        super(tamanho, quantidadeDePatas, raca, tipo, temRabo);
        this.possuiEscamas = possuiEscamas;
        this.ehDocil = ehDocil;
        this.quantidadeDeNadadeiras = quantidadeDeNadadeiras;
    }

    public boolean isPossuiEscamas() {
        return possuiEscamas;
    }

    public void setPossuiEscamas(boolean possuiEscamas) {
        this.possuiEscamas = possuiEscamas;
    }

    public boolean isEhDocil() {
        return ehDocil;
    }

    public void setEhDocil(boolean ehDocil) {
        this.ehDocil = ehDocil;
    }

    public int getQuantidadeDeNadadeiras() {
        return quantidadeDeNadadeiras;
    }

    public void setQuantidadeDeNadadeiras(int quantidadeDeNadadeiras) {
        this.quantidadeDeNadadeiras = quantidadeDeNadadeiras;
    }

    @Override
    public int getQuantidadeDePatas() {
        return super.getQuantidadeDePatas();
    }

    @Override
    public void setQuantidadeDePatas(int quantidadeDePatas) {
        super.setQuantidadeDePatas(quantidadeDePatas);
    }

    @Override
    public String getRaca() {
        return super.getRaca();
    }

    @Override
    public void setRaca(String raca) {
        super.setRaca(raca);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public Boolean getTemRabo() {
        return super.getTemRabo();
    }

    @Override
    public void setTemRabo(Boolean temRabo) {
        super.setTemRabo(temRabo);
    }

    @Override
    public String toString() {
        return "Golfinho{" +
                "possuiEscamas=" + possuiEscamas +
                ", ehDocil=" + ehDocil +
                ", quantidadeDeNadadeiras=" + quantidadeDeNadadeiras +
                "tamanho='" + tamanho + '\'' +
                ", quantidadeDePatas=" + quantidadeDePatas +
                ", raca='" + raca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", temRabo=" + temRabo +
                '}';
    }
}
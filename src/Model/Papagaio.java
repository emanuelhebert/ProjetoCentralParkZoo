package Model;

public class Papagaio extends Animal {
    boolean temBico;
    boolean temPenagem;

    public  Papagaio(
            boolean temBico,
            boolean temPenagem,
            String tamanho,
            int quantidadeDePatas,
            String raca,
            String tipo,
            Boolean temRabo
    ){
        super(tamanho, quantidadeDePatas, raca, tipo, temRabo);
        this.temBico = temBico;
        this.temPenagem = temPenagem;
    }

    public boolean isTemBico() {
        return temBico;
    }

    public void setTemBico(boolean temBico) {
        this.temBico = temBico;
    }

    public boolean isTemPenagem() {
        return temPenagem;
    }

    public void setTemPenagem(boolean temPenagem) {
        this.temPenagem = temPenagem;
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
        return "Papagaio{" +
                "temBico=" + temBico +
                ", temPenagem=" + temPenagem +
                "tamanho='" + tamanho + '\'' +
                ", quantidadeDePatas=" + quantidadeDePatas +
                ", raca='" + raca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", temRabo=" + temRabo +
                '}';
    }
}
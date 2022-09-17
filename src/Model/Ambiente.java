package Model;

public class Ambiente {

    Animal[] listaDeAnimais;

    public Ambiente(int capacidadeDeAnimais){
        listaDeAnimais = new Animal[capacidadeDeAnimais];
    }

    public void getListaDeAnimais() {
        for (int i = 0; i < this.listaDeAnimais.length; i++) {
            System.out.println(listaDeAnimais[i]);
        }
    }

    public void setListaDeAnimais(int posicao, Animal animal) {
        this.listaDeAnimais[posicao] = animal;
    }

    @Override
    public String toString() {
        this.getListaDeAnimais();
        return "Lista de animais";
    }
}
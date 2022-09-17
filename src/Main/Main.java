package Main;

import Model.*;
import Model.Leao;
import Model.Golfinho;
import Model.Papagaio;

public class Main {
    public static void main(String[] args) {

        Ambiente ambiente = new Ambiente(3);

        Leao leao1 = new Leao("2m",
                4,
                "felino",
                "terrestre",
                false,
                "selva",
                true,
                true);
        Golfinho golfinho1 = new Golfinho(false,
                false,
                "3m",
                3,
                0,
                "rotador",
                "aquatico",
                false);
        Papagaio papagaio1 = new Papagaio(true,
                true,
                "35cm",
                2,
                "campeiro",
                "aereo",
                true);

        ambiente.setListaDeAnimais(0, leao1);
        ambiente.setListaDeAnimais(1, golfinho1);
        ambiente.setListaDeAnimais(2, papagaio1);

        Zoologico centralParkZoo = new Zoologico(
                "Central Park Zoo",
                ambiente
        );
        System.out.println(centralParkZoo.getAmbiente());




    }
}
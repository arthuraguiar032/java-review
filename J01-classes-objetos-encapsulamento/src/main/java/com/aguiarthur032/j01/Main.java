package com.aguiarthur032.j01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Anime anime1 = new Anime("Dragon Ball", 637, "Flex");
        Anime anime2 = new Anime("Pokemon", 5, "Niantic");
        Anime anime3 = new Anime("Naruto", 2000, "Japon");

        ArrayList<Anime> listaDeANimes = new ArrayList<>();
        listaDeANimes.add(anime1);
        listaDeANimes.add(anime2);
        listaDeANimes.add(anime3);

        System.out.println(listaDeANimes);

    }
}
                                                                                                                                                                                                    
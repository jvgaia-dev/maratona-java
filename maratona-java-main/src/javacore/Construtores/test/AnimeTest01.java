package javacore.Construtores.test;

import javacore.Construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Shonem", 350, "Ação", "MAPPA");
        Anime anime2 = new Anime();
        anime.imprime();
        //anime2.imprime();
    }
}

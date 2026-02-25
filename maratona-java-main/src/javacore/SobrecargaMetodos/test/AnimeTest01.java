package javacore.SobrecargaMetodos.test;

import javacore.SobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Shonem", 350, "Drama");
        anime.imprime();
    }
}

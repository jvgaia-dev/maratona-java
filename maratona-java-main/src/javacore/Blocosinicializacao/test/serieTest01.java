package javacore.Blocosinicializacao.test;

import javacore.Blocosinicializacao.dominio.Serie;

public class serieTest01 {
    public static void main(String[] args) {
        Serie serie = new Serie("Dexter");
        System.out.println(serie.getNome());
        for (int episodio : serie.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}

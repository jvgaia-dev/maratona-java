package javacore.Blocosinicializacao.dominio;

public class Serie {
    private String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Serie(String nome) {
        this.nome = nome;
    }

    public Serie() {
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

package br.com.alura.screenmatch.modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean emProducao;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isEmProducao() {
        return emProducao;
    }

    public void setEmProducao(boolean emProducao) {
        this.emProducao = emProducao;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override// eu consigo pegar um metodo da classe pai (titulo.java) e sobrescrever ele na classe filha (serie.java) com parametros diferentes
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio /60;
    }


}

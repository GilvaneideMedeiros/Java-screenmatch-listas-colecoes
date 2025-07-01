package br.com.gilvaneide.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private int totalVisualizacoes;

    public Serie(String nome, int anoDeLancamento) {
        super();
        super.setNome(nome);
        super.setAnoDeLancamento(anoDeLancamento);
    }

    public int getTotalVisualizacoes() { return totalVisualizacoes; }

    public void setTotalVisualizacoes(int totalVisualizacoes) { this.totalVisualizacoes = totalVisualizacoes; }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) { this.episodiosPorTemporada = episodiosPorTemporada; }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getClassificacao() {
        return (int)pegaMedia() /3 ;
    }

    @Override
    public String toString() {
        return "Série: " + getNome() + " (" + getAnoDeLancamento() + ")";
    }
}

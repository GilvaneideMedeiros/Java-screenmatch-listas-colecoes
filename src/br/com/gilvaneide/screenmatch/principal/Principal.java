package br.com.gilvaneide.screenmatch.principal;

import br.com.gilvaneide.screenmatch.calculos.CalculadoraDeTempo;
import br.com.gilvaneide.screenmatch.calculos.FiltroRecomendacao;
import br.com.gilvaneide.screenmatch.modelos.Episodio;
import br.com.gilvaneide.screenmatch.modelos.Filme;
import br.com.gilvaneide.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\nTodos os filmes: \n");
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme em minutos: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Soma das avaliações: " +meuFilme.getSomaDasAvaliacoes());
        System.out.println("Total das avaliações: " +meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
        System.out.println("\n");

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(15);
        lost.setEpisodiosPorTemporada(10);
        lost.setAtiva(true);
        lost.setMinutosPorEpisodio(60);

        lost.exibeFichaTecnica();
        lost.avalia(9);
        lost.avalia(7);
        lost.avalia(10);
        System.out.println("Soma das avaliações: " +lost.getSomaDasAvaliacoes());
        System.out.println("Total das avaliações: " +lost.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " +lost.pegaMedia());
        System.out.println("Quantidade de temporadas: " +lost.getTemporadas());
        System.out.println("Quantidade de episódios por temporada: " + lost.getEpisodiosPorTemporada());
        System.out.println("A série está ativa? ");
        if (lost.isAtiva()) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        System.out.println("Quantidade de minutos por episódio: " +lost.getMinutosPorEpisodio());
        System.out.println("Duração para maratonar Lost: " +lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setDiretor("James Cameron");

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(204);
        filmeDoPaulo.setDiretor("Lars von Trier");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(filmeDoPaulo);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        System.out.println("Tamanho da lista de filmes: " + lista.size());
        System.out.println("Primeiro filme: " + lista.get(0).getNome());
        System.out.println("Ultimo filme: " + lista.get(lista.size() - 1).getNome());
        System.out.println("\n");

        ArrayList<Serie> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(lost);
        System.out.println("Tamanho da lista de séries: " + listaDeSeries.size());
        System.out.println("Primeira série da lista: " + listaDeSeries.get(0).getNome());
    }
}
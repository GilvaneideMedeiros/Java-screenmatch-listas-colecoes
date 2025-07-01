package br.com.gilvaneide.screenmatch.principal;

import br.com.gilvaneide.screenmatch.calculos.CalculadoraDeTempo;
import br.com.gilvaneide.screenmatch.calculos.FiltroRecomendacao;
import br.com.gilvaneide.screenmatch.modelos.Episodio;
import br.com.gilvaneide.screenmatch.modelos.Filme;
import br.com.gilvaneide.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(15);
        lost.setEpisodiosPorTemporada(10);
        lost.setAtiva(true);
        lost.setMinutosPorEpisodio(60);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
        System.out.println("\n");

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setDiretor("James Cameron");

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(204);
        filmeDoPaulo.setDiretor("Lars von Trier");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
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
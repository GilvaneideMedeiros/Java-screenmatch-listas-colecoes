package br.com.gilvaneide.screenmatch.principal;

import br.com.gilvaneide.screenmatch.modelos.Filme;
import br.com.gilvaneide.screenmatch.modelos.Serie;
import br.com.gilvaneide.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);
        System.out.println("\nTodos os filmes:\n");
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        if(meuFilme == outroFilme) {
            System.out.println("\nSão iguais");
        } else {
            System.out.println("Os filmes são diferentes");
            System.out.println("\n");
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println("Lista de artistas: " + buscaPorArtista);
        System.out.println("\nApós a ordenação: ");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("\n");
        System.out.println("Lista de Títulos ordenados em ordem alfabética: ");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("\n");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de filmes ordenada por ano de lançamento: ");
        System.out.println(lista);

        System.out.println("\n");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento).reversed());
        System.out.println("Lista de filmes ordenada por ano de lançamento em ordem decrescente: ");
        System.out.println(lista);
    }
}

package br.com.gilvaneide.screenmatch.principal;

import br.com.gilvaneide.screenmatch.modelos.Filme;
import br.com.gilvaneide.screenmatch.modelos.Serie;
import br.com.gilvaneide.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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
            System.out.println("\nSão diferentes");
        }

    }
}

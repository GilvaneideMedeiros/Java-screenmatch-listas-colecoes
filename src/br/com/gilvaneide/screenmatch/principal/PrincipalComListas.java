package br.com.gilvaneide.screenmatch.principal;

import br.com.gilvaneide.screenmatch.modelos.Filme;
import br.com.gilvaneide.screenmatch.modelos.Serie;
import br.com.gilvaneide.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoPaulo = new Filme("A lista de Schindler", 1993);
        Serie minhaSerie = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(minhaSerie);
        for (Titulo item : lista) {
            System.out.println(item);
        }

    }
}

package br.com.alura.screenmatch.modelo.calculos;

public class FiltroRecomendacao {

    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Recomendado!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Pode ser uma boa opção.");
        } else {
            System.out.println("Não recomendado.");
        }
    }
}

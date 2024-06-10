package br.com.alura.screenmatch.modelo;
import br.com.alura.screenmatch.modelo.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {//com EXTENDS eu puxo todos os atributos e metodos da classe Titulo para a classe Filme
    //com o IMPLEMENTS eu puxo todos os metods de uma interface para a classe que desejo
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;

    }
}

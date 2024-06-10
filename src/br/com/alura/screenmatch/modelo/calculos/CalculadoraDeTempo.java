package br.com.alura.screenmatch.modelo.calculos;
import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;
    
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // public void inclui(Filme f) {
    //     this.tempoTotal += f.getDuracaoEmMinutos();
    // }

    // public void inclui(Serie S) {
    //     this.tempoTotal += S.getDuracaoEmMinutos();
    // }
//se eu tivesse filme serie musica documentario eu teria que fazer um metodo para cada um
//repetir o mesmo codigo toda vez que eu criar uma nova classe é um problema
//resolvo com polimorfismo onde eu puxo a CLASSE pai Titulo e consigo puxar qualquer classe filha
//com isso eu consigo puxar qualquer classe filha e não preciso criar um metodo para cada uma
//classe pai Titulo.java / classe filha FILME SERIE MUSICA DOCUMENTARIO / atributos DURAÇÃO EM MINUTOS


    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}

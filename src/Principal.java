import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelo.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();//new filme puxa o objeto filme da classe Filme
        filme1.setNome("Eragon");
        filme1.setAnoDeLancamento(2006);
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(104);
        System.out.println("Duração do filme: " + filme1.getDuracaoEmMinutos());
        

        filme1.exibeFichaTecnica();//vai chamar o metodo criado filme.java que exibe a ficha tecnica
        filme1.avalia(4.5);
        filme1.avalia(0.5);
        filme1.avalia(3.0);
        

        System.out.println("Total de avaliações: " + filme1.getTotalDesomaDasAvaliacoes());
        System.out.println(filme1.pegaMedia());
        //filme1.somaDasAvaliacoes = 10;
        //filme1.totalDesomaDasAvaliacoes = 1;
        //System.out.println(filme1.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setIncluidoNoPlano(true);
        lost.setDuracaoEmMinutos(42);
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(24);
        lost.setEmProducao(false);
        lost.setMinutosPorEpisodio(42);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos() + " horas."  );

        Filme filme2 = new Filme();//new filme puxa o objeto filme da classe Filme
        filme2.setNome("Harry Potter e o Cálice de Fogo");
        filme2.setAnoDeLancamento(2005);
        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(157);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + " minutos.");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
        filtro.filtra(filme2);

        Episodio episodio = new Episodio();
        
        episodio.setSerie(lost);
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(450);
        filtro.filtra(episodio);
        
        

    }
    
}

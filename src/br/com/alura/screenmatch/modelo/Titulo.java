package br.com.alura.screenmatch.modelo;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDesomaDasAvaliacoes;//colocando private eu bloquei que no codigo principal alguem faça uma alteração direta
    private int duracaoEmMinutos;

    
    public void exibeFichaTecnica() { // void não retorna nada
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        
    }

////////////////////////////////////////////////////////////////////////////////
    public String getNome() {
        return nome;
    }//SEMPRE QUE EU QUISER ACESSAR UM ATRIBUTO PRIVADO EU PRECISO CRIAR UM METODO GET
    public void setNome(String nome) {
        this.nome = nome;//SEMPRE QUE EU QUISER ALTERAR UM ATRIBUTO PRIVADO EU PRECISO CRIAR UM METODO SET
    }

////////////////////////////////////////////////////////////////////////////////

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

////////////////////////////////////////////////////////////////////////////////

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

////////////////////////////////////////////////////////////////////////////////

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

//ao inves de no principaljava eu criar varios print na tela eu posso criar um metodo que exibe a ficha tecnica 
    

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDesomaDasAvaliacoes++;
    }

////////////////////////////////////////////////////////////////////////////////

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDesomaDasAvaliacoes;
    }

////////////////////////////////////////////////////////////////////////////////

    public int getTotalDesomaDasAvaliacoes() {// e com o get eu consigo acessar o valor que esta privado no codigo principal sem alterar o valor
        return totalDesomaDasAvaliacoes;
    }
}

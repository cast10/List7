package src.Lista7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Pais {


    private String ISO;
    private String nome;
    private double populacaoQuant;
    private double dimenssao;

    private List<String> vizinhos = new ArrayList<>(Arrays.asList("Suriname","Guiana", "Guiana Francesa", "Venezuela","Colômbia","Peru","Bolívia","Paraguai","Argentina","Uruguai"));


    public void setVizinhos(List<String> vizinhos) {
        this.vizinhos = vizinhos;


    }
    public List<String> getVizinhos(String s) {
        return vizinhos;}


    public Pais(String ISO, String nome, double dimenssao, double populacaoQuant) {
        this.ISO = ISO;
        this.nome = nome;
        this.dimenssao = dimenssao;
        this.populacaoQuant = populacaoQuant;
    }
    public double calculpDensidade(double populacaoQuant, double dimenssao) {
        return  populacaoQuant / dimenssao;

    }
    public void inserirPais (String pais){
        this.vizinhos.add(pais);


    }

    public boolean fronteiraVizinho(String nome) {
        return vizinhos.contains(nome);

    }

    public void mostraosVizinhos(){
        for (String p1: vizinhos) System.out.println("Nome: " + p1.getBytes() );

    }

    public String getISO() {
        return ISO;
    }

    public void setISO(String ISO) {
        this.ISO = ISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacaoQuant() {
        return populacaoQuant;
    }

    public void setPopulacaoQuant(double populacaoQuant) {
        this.populacaoQuant = populacaoQuant;
    }

    public double getDimenssao() {
        return dimenssao;
    }

    public void setDimenssao(double dimenssao) {
        this.dimenssao = dimenssao;
    }

}





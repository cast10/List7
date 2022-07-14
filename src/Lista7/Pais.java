package src.Lista7;
import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
public class Pais {


    private String ISO;
    private String nome;
    private double populacaoQuant;
    private double dimenssao;

    private List<Pais> vizinhos = new ArrayList<>();


    public void setVizinhos(List<Pais> vizinhos) {
        this.vizinhos = vizinhos;


    }
    public List<Pais> getVizinhos() {
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
    public void inserirPais (Pais pais){
        this.vizinhos.add(pais);


    }
    public void mostraosVizinhos(){
        for (Pais p1: vizinhos) System.out.println("Nome: " + p1.getNome() );




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





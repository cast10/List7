package src.Lista7;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;


public abstract class pais {

    private String ISO;
    private String nome;
    private  int populacaoQuant;
    private  double dimessao;

    public pais(String ISO, String nomw, int populacaoQuant, double dimesao) {
        this.ISO = ISO;
        this.nome = nome;
        this.populacaoQuant = populacaoQuant;
        this.dimessao = dimessao;
    }
    List<fronteira> fronteira = new ArrayList();

    public  void  adicionarPais(fronteira  fronteira){
        this.fronteira.add(fronteira);
    }
    public void retornaISOPais(){
        System.out.println("A dimensão do nosso pais  " + ISO );
    }
    public void  retornaNomePais(){
        System.out.println("Nome do Pais é   " + nome );

    }
    public void  retonaDimnessaoPais(){
        System.out.println("A dimessão do  Pais é   " + dimessao );

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
    public int getPopulacaoQuant() {
        return populacaoQuant;
    }
    public void setPopulacaoQuant(int populacaoQuant) {
        this.populacaoQuant = populacaoQuant;
    }
    public double getDimessao() {
        return dimessao;
    }

    public void setDimessao(double dimessao) {
        this.dimessao = dimessao;
    }
    public double getDensidadePopulacional() {
        return populacaoQuant;
    }

    public void setDensidadePopulacional(int populacaoQuant) {
        this.populacaoQuant = populacaoQuant;
    }





}

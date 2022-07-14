package src.Lista7;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
         Pais p1 = new Pais("SUR","Surimane",20000,200);

        System.out.println("A Sigla do Pais  " + p1.getISO() );
        System.out.println("Nome do Pais  " + p1.getNome() );
        System.out.println("A dimenssap Pais é   " + p1.getDimenssao() );
        System.out.println("A quantidade da população Pais é   " + p1.getPopulacaoQuant() );
        System.out.println("Densidade     " + p1.calculpDensidade(200,50000));

        Pais p2 = new Pais("ARG","Argentina",20000,200);

        System.out.println();

        System.out.println("A Sigla do Pais  " + p2.getISO() );
        System.out.println("Nome do Pais  " + p2.getNome() );
        System.out.println("A dimenssap Pais é   " + p2.getDimenssao() );
        System.out.println("A quantidade da população Pais é   " + p2.getPopulacaoQuant() );
        System.out.println("Densidade     " + p2.calculpDensidade(200,50000));

    }
}

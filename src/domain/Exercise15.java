package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Exercise15 {
   private int ano;
   private int dia;
   private int mes;

    public Exercise15(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    public void retornaData(){
        Date dataAtual = new Date();
        int mes;
        int dia;
        int ano = dataAtual.getYear()+1900 -this.ano-1;
            mes = 12-abs((dataAtual.getMonth() - this.mes));
            dia = abs(dataAtual.getDate()-this.dia);
        System.out.println(dia);
        System.out.println(ano+" anos, "+mes+" meses e "+dia+" dias de vida");
    }



}

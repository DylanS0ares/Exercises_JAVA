package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise01;

import javax.lang.model.type.ArrayType;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise01Test {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 numeros");
        for(int i=0;i<3;i++)
        {
            numeros[i] = scanner.nextInt();
        }
        Exercise01 exercicio01 = new Exercise01(numeros[0],numeros[1],numeros[2]);
        exercicio01.testeMaior();



    }
}

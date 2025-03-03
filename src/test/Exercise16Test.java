package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise16;

import java.util.Scanner;

public class Exercise16Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lados = new int[3];
        System.out.println("type three length sides to see what kind of triangule is it.");
        for(int i =0;i<lados.length;i++){
            lados[i] = scanner.nextInt();
        }
        Exercise16 exercicio16 = new Exercise16(lados);
        exercicio16.tipoTriangulo();




    }
}

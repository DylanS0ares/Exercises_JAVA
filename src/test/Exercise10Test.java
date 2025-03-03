package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise10;

import java.util.Scanner;

public class Exercise10Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        for(int i=0;i<notas.length;i++){
            notas[i] = scanner.nextInt();
        }
        Exercise10 exercicio10 = new Exercise10(notas);
        exercicio10.mediaNotas();


    }
}

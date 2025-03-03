package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;


import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise11;

import java.util.Scanner;

public class Exercise11Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do aluno?");
        String nome = scanner.nextLine();
        System.out.println("Agora as notas dos bimestres");
        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextInt();
        }
        Exercise11 exercicio11 = new Exercise11(notas,nome);
        exercicio11.mediaNotas();
    }
}

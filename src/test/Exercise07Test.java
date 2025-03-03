package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise07;

import java.util.Scanner;

public class Exercise07Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois valores booleanos");
        Exercise07 exercicio07= new Exercise07(scanner.nextBoolean(),scanner.nextBoolean());
        exercicio07.imprimeVerdadeiroFalso();

    }
}

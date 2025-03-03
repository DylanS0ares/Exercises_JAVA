package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise05;

import java.util.Scanner;

public class Exercise05Test {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário mínimo e o seu salário para ver o quão bem ou mal você ganha em relação a ele");
    Exercise05 exercicio05 = new Exercise05(scanner.nextDouble(),scanner.nextDouble());
    exercicio05.quantosSalarios();
    }
}

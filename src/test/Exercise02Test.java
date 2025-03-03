package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise02;

import java.util.Scanner;

public class Exercise02Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número por favor!");
        int entrada = scanner.nextInt();
        Exercise02 exercicio02 = new Exercise02(entrada);
        exercicio02.retornaParImpar();
    }
}

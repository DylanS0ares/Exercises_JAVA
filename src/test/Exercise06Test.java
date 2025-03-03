package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise06;

import java.util.Scanner;

public class Exercise06Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor e obtenha 5% de reajuste dele");
        Exercise06 exercicio6 = new Exercise06(scanner.nextDouble());
        exercicio6.imprime5percento();
    }
}

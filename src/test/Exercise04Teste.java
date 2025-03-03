package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise04;

import java.util.Scanner;

public class Exercise04Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver seu antecessor e sucessor");
        Exercise04 exercicio04 = new Exercise04(scanner.nextInt());
        exercicio04.antecessorSucessor();
    }
}

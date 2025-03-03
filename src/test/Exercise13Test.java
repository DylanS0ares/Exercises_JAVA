package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise13;

import java.util.Scanner;

public class Exercise13Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade");
        int idade = scanner.nextInt();
        Exercise13 exercicio13 = new Exercise13(nome,idade);
        System.out.println(exercicio13.toString());
    }
}

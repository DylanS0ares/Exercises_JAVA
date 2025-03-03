package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise08;

import java.util.Scanner;

public class Exercise08Test {
    public static void main(String[] args) {
    int[] numeros= new int[3];
    Scanner scanner = new Scanner(System.in);
    for (int i=0;i<3;i++){
        numeros[i] = scanner.nextInt();
    }
    Exercise08 exercicio8 = new Exercise08(numeros);
    exercicio8.ordemDecrescente();
    }
}

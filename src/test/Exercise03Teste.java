package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise03;

import java.util.Scanner;

public class Exercise03Teste {
    public static void main(String[] args) {
        int[] numero = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números");
            for(int i=0;i<2;i++){
                numero[i] = scanner.nextInt();
            }
            Exercise03 exercicio3 = new Exercise03(numero[0],numero[1]);
            exercicio3.ehIgual();
    }
}

package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise17;

import java.util.Scanner;

public class Exercise17Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em fahrenheit e obtenha em celsius");
        float temp = scanner.nextFloat();
        Exercise17 exercicio17 = new Exercise17(temp);
        exercicio17.tempCelsius();
    }
}

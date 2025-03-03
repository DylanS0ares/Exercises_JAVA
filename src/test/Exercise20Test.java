package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import java.util.Scanner;

public class Exercise20Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do número "+numero);
        for(int i=1;i<11;i++){
            System.out.println(numero*i);
        }

    }
}

package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.test;

import academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain.Exercise15;

import java.util.Date;
import java.util.Scanner;

public class Exercise15Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua data de nascimento: ");
        System.out.println("Digite o seu ano: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o seu mês: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o seu dia: ");
        int dia = scanner.nextInt();
        Exercise15 exercicio15 = new Exercise15(ano,mes,dia);
        exercicio15.retornaData();

}}


package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.Execicio12.test;

import java.util.Scanner;

import static academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.Execicio12.domain.TipoPagamento.*;

public class Exercise12Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Valor do produto");
        double produto = scanner.nextDouble();
        System.out.println("Digite a forma de pagamento 1- Pix ou Dinheiro, 2- Crédito , 3- Parcelamento");
        int tipo_Pagamento = scanner.nextInt();
        if(tipo_Pagamento==3){
            System.out.println("Digite a quantidade de parcelas");
            int parcelas = scanner.nextInt();
            System.out.println("Valor a ser pago " + PARCELADO.calcularDesconto(produto,parcelas));

        }else if(tipo_Pagamento==2){
            System.out.println("Valor a ser pago " + CREDITO.calcularDesconto(produto,0));
        }else if(tipo_Pagamento==1){
            System.out.println("Valor a ser pago " + DINHEIRO_PIX.calcularDesconto(produto,0));
        }

    }
}

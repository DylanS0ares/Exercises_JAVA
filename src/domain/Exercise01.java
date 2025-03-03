package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise01 {
    private int A;
    private int B;
    private int C;

    public Exercise01(int a, int b, int c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public void testeMaior(){
        if (this.A +this.B>this.C){
            System.out.println("A soma é maior que o terceiro valor");
            System.out.println("A soma é "+(this.A+this.B));
        }else{
            System.out.println("Não é maior!");
            System.out.println("A soma é "+(this.A+this.B));
        }
    }
}

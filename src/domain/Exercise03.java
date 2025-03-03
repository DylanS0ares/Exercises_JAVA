package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise03 {
    private int A,B;
    public Exercise03(int a,int b){
        this.A = a;
        this.B = b;
    }
    public void ehIgual(){
        if (this.A==this.B){
            System.out.println(this.A+this.B);
        }else{
            System.out.println("Não é igual né meu querido!");
        }
    }
}

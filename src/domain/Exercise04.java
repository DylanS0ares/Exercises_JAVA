package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise04 {
    private int A;
    public Exercise04(int a){
        this.A = a;
    }
    public void antecessorSucessor(){
        System.out.println("Antecessor: "+(this.A-1));
        System.out.println("Sucessor: "+(this.A+1));
    }
}

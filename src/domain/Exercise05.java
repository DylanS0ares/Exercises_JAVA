package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise05 {
    private double salario_minimo;
    private double salario_usuario;

    public Exercise05(double a,double b){
        this.salario_minimo=a;
        this.salario_usuario =b;
    }
    public void quantosSalarios(){
        System.out.println(this.salario_usuario/this.salario_minimo);
    }
}

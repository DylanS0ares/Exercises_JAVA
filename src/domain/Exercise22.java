package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise22 {
   private double distance;
   private double velocity;
    public Exercise22(double distance,double velocity) {
        this.distance = distance;
        this.velocity = velocity;

    }
    public void returnLitros(){
        System.out.println("distância: " + this.distance/this.velocity+ " em metros");
        System.out.println("litros usados: "+ this.distance/12000);
    }
}

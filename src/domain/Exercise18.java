package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise18 {
    private double altura1;
    private double altura2;

    public Exercise18(double altura1,double altura2) {
        this.altura1 = altura1;
        this.altura2 = (altura2);
    }
    public void maiorAnos(){
        int contador =1;
        while(true){
            if((this.altura1+0.02*contador)==(this.altura2+0.03*contador)){
                break;
            }
            contador++;
        }
        System.out.println("Levará "+contador+" Anos");
    }

}

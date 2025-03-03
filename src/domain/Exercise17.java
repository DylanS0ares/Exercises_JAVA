package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise17 {
    private float temperature;

    public Exercise17(float temperature) {
        this.temperature = temperature;
    }
    public void tempCelsius(){
        System.out.println((5*(this.temperature-32)/9)+"ºC");
    }
}

package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise10 {
    private double []notas;
    public Exercise10(double[] array) {
        this.notas = array;
    }
    public void mediaNotas(){
        int soma=0;
        for(int i=0;i<this.notas.length;i++){
            soma+=notas[i];

        }
        System.out.println(soma/this.notas.length);
    }
}

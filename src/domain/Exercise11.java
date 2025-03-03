package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise11 {
    private double []notas;
    private String nome;
    public Exercise11(double[] array, String nome) {
        this.notas = array;
        this.nome = nome;
    }
    public void mediaNotas(){
        int soma=0;
        for(int i=0;i<this.notas.length;i++){
            soma+=notas[i];

        }
        System.out.println("O aluno "+ this.nome+" foi:");
        if(soma/this.notas.length>=7){
            System.out.println("APROVADO!");
        }else{
            System.out.println("Reprovou fofa!");
        }
    }

}


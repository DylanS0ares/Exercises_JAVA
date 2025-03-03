package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;


import java.util.Arrays;

public class Exercise08 {
    private int[] numeros;
    public Exercise08(int[] array){
    this.numeros = array;;
    }

    public void ordemDecrescente(){
            Arrays.sort(this.numeros);
            for(int i =this.numeros.length-1;i>=0;i--){
                System.out.println(this.numeros[i]);
            }
            }
        }



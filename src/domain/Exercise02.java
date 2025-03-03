package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;


public class Exercise02 {
    private int numero1;

    public Exercise02(int numero1) {
        this.numero1 = numero1;
    }
    public void retornaParImpar(){
        if(this.numero1%2==0  && this.numero1!=0){
            System.out.println("O número é Par!");
            if(this.numero1>0){
                System.out.println("Número Positivo");
            }else{
                System.out.println("Número Negativo");
            }
        }else if (this.numero1==0){
            System.out.println("Zero não é par nem ímpar");
        }else{
            System.out.println("O número é Impar!");
            if(this.numero1>0){
                System.out.println("Número Positivo");
            }else{
                System.out.println("Número Negativo");
            }

        }
    }
}

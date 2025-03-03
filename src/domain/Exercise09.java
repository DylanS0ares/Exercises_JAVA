package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise09 {
    private double peso;
    private double altura;

    public Exercise09(double peso,double altura){
        this.peso = peso;
        this.altura =altura;
    }
    public void calculoIMC(){
        double IMC = this.peso/Math.pow(this.altura,2);
        if(IMC<=18.5){
            System.out.println("Abaixo do peso");
        }else if(IMC>=18.6 || IMC<24.9){
            System.out.println("Peso ideal(Parabéns)");
        }else if(IMC>=25.0|| IMC<=29.9){
            System.out.println("Levemente acima do peso");

        }else if(IMC>=30.0 || IMC<=34.9){
            System.out.println("Obesidade grau 1");

        }else if(IMC>=35.0 || IMC<=39.9){
            System.out.println("Obesidade grau 2(severa)");
        }
        else{
            System.out.println("Obesidade grau 3 (mórbida)");
        }
    }

}

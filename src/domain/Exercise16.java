package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

public class Exercise16 {
    private int[] sides;
    public Exercise16(int[] sides) {
        this.sides = sides;
    }
    public void tipoTriangulo(){
        int contador=0;
        for(int i=0;i<sides.length-1;i++){
            for(int j=i+1;j<sides.length;j++){
                if(sides[i]==sides[j]){
                    contador++;
                }
            }

        }
        if(contador==0){
            System.out.println("Triangulo Escaleno");
        }else if(contador==1){
            System.out.println("Triangulo isósceles");
        }else{
            System.out.println("Triangulo Equilatero");
        }
    }
}

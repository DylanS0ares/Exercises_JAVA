package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.Execicio12.domain;

public enum TipoPagamento {
    DINHEIRO_PIX{
        @Override
        public double calcularDesconto(double valor,int quantidade) {
            return Math.abs(valor*0.85);
        }
    },CREDITO{
        @Override
        public double calcularDesconto(double valor,int quantidade) {
            return Math.abs(valor*0.90);
        }
    },PARCELADO{
        @Override
        public double calcularDesconto(double valor,int quantidade) {
            if(quantidade==2){
                return valor;
            }else if(quantidade>=3) {
                return Math.abs(valor * 1.1);
            }
            return 0;
        }
    };

    public double calcularDesconto(double valor, int quantidade){
        return 0;
    }
}

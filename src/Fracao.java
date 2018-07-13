public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public String soma(Fracao fracao){
        Fracao resultado;
        if (this.denominador == fracao.denominador){
            resultado = new Fracao(this.numerador + fracao.numerador, this.denominador);
        }else{
            int mmc = this.mmc(this.denominador, fracao.denominador);
            int numFracao1 = (int) (mmc / this.denominador) * this.numerador;
            int numFracao2 = (int) (mmc / fracao.denominador) * fracao.numerador;
            resultado = new Fracao(numFracao1 + numFracao2, mmc);
        }

        return String.valueOf(resultado.numerador)+"/"+String.valueOf(resultado.denominador);
    }

    public String subtracao(Fracao fracao){
        Fracao resultado;
        if (this.denominador == fracao.denominador){
            resultado = new Fracao(this.numerador, this.denominador + fracao.denominador);
        }else{
            int mmc = this.mmc(this.denominador, fracao.denominador);
            int numFracao1 = (int) (mmc / this.denominador) * this.numerador;
            int numFracao2 = (int) (mmc / fracao.denominador) * fracao.numerador;
            resultado = new Fracao(numFracao1 - numFracao2, mmc);
        }

        return String.valueOf(resultado.numerador)+"/"+String.valueOf(resultado.denominador);
    }

    public String divisao(Fracao fracao){
        return this.multiplicacao(new Fracao(fracao.denominador, fracao.numerador));
    }

    public String multiplicacao(Fracao fracao){
        Fracao resultado = new Fracao(this.numerador * fracao.numerador, this.denominador*fracao.denominador);
        return String.valueOf(resultado.numerador)+"/"+String.valueOf(resultado.denominador);
    }

    public int mmc(double denominador1, double denominador2) {
        int temp = 2;
        int resultado = 1;
        while (denominador1 != 1 || denominador2 != 1) {
            while (denominador1 % temp != 0 && denominador2 % temp != 0) {
                temp++;
            }
            if (denominador1 % temp == 0) {
                denominador1 = denominador1 / temp;
            }
            if (denominador2 % temp == 0) {
                denominador2 = denominador2 / temp;
            }
            resultado *= temp;
        }
        return resultado;
    }

}

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestaFracao{

    @Test
    public void verifica_se_soma_ok(){
        Fracao fracao = new Fracao(3, 4);
        Fracao fracao2 = new Fracao(2, 3);

        assertEquals("17/12", fracao.soma(fracao2));
    }

    @Test
    public void verifica_se_subtracao_ok(){
        Fracao fracao = new Fracao(6, 5);
        Fracao fracao2 = new Fracao(2, 4);

        assertEquals("14/20", fracao.subtracao(fracao2));
    }

    @Test
    public void verifica_se_divisao_ok(){
        Fracao fracao = new Fracao(2, 3);
        Fracao fracao2 = new Fracao(3, 2);

        assertEquals("4/9", fracao.divisao(fracao2));
    }

    @Test
    public void verifica_se_multiplicacao_ok(){
        Fracao fracao = new Fracao(2, 5);
        Fracao fracao2 = new Fracao(3, 7);

        assertEquals("6/35", fracao.multiplicacao(fracao2));
    }

}

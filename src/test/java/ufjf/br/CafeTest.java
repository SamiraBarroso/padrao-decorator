package ufjf.br;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void deveRetornarValorCafeEspresso() {
        Cafe cafe = new Espresso(1.50f);

        assertEquals(1.50f, cafe.getValor());
    }

    @Test
    void deveRetornarValorCafeDescafeinado() {
        Cafe cafe = new Descafeinado(2.00f);

        assertEquals(2.00f, cafe.getValor());
    }

    @Test
    void deveRetornarValorCafeEspressoComLeite() {
        Cafe cafe = new Leite (new Espresso(1.50f));

        assertEquals(3.50f, cafe.getValor());
    }

    @Test
    void deveRetornarValorCafeDescafeinadoComLeite() {
        Cafe cafe = new Leite (new Descafeinado(2.00f));

        assertEquals(4.00f, cafe.getValor());
    }

    @Test
    void deveRetornarValorCafeDescafeinadoComCappucino() {
        Cafe cafe = new Cappucino (new Descafeinado(2.00f));

        assertEquals(5.50f, cafe.getValor());
    }
    @Test
    void deveRetornarValorCafeDescafeinadoComLeiteCappucino() {
        Cafe cafe = new Cappucino (new Leite(new Descafeinado(2.00f)));

        assertEquals(7.50f, cafe.getValor());
    }

    @Test
    void deveRetornarInformacaoCafeEspresso() {
        Cafe cafe = new Espresso(1.50f);

        assertEquals("Café Espresso.", cafe.getInformacao());
    }

    @Test
    void deveRetornarInformacaoCafeEspressoComLeite() {
        Cafe cafe = new Leite(new Espresso(1.50f));

        assertEquals("Café Espresso./Leite", cafe.getInformacao());
    }

    @Test
    void deveRetornarInformacaoCafeDescafeinadoComLeiteCappucino() {
        Cafe cafe = new Cappucino (new Leite(new Descafeinado(2.00f)));

        assertEquals("Café Descafeínado./Leite/Cappucino", cafe.getInformacao());
    }




}
package ufjf.br;

public class Espresso implements Cafe{

    public float valor;

    public Espresso() {
    }

    public Espresso(float valor) {
        this.valor = valor;
    }
    @Override
    public float getValor() {
        return valor;
    }

    @Override
    public String getInformacao() {
        return "Café Espresso.";
    }
}

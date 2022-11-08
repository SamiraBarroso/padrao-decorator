package ufjf.br;

public class Descafeinado implements Cafe {

    public float valor;

    public Descafeinado() {
    }

    public Descafeinado(float valor) {
        this.valor = valor;
    }
    @Override
    public float getValor() {
        return valor;
    }
    @Override
    public String getInformacao() {
        return "Café Descafeínado.";
    }
}

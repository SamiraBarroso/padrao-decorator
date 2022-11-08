package ufjf.br;

public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }
    @Override
    public String getInformacaoCafe() {
        return "Leite";
    }

    @Override
    public float getValorCafeAdicional() {
        return 2.00f;
    }
}

package ufjf.br;

public class Cappucino extends CafeDecorator{

    public Cappucino(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getInformacaoCafe() {
        return "Cappucino";
    }

    @Override
    public float getValorCafeAdicional() {
        return 3.50f;
    }


}

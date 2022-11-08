package ufjf.br;

public abstract class CafeDecorator implements Cafe{
    private Cafe cafe;
    public String informacao;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }
    public abstract String getInformacaoCafe();

    public String getInformacao() {
        return this.cafe.getInformacao() + "/" + this.getInformacaoCafe();
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    public abstract float getValorCafeAdicional();

    public float getValor(){
        return this.cafe.getValor() + this.getValorCafeAdicional();
    }
}

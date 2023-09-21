package generelizacao.ambiente;

public class Sala extends Ambiente{

    private boolean tv;

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "tv=" + tv +
                "} " + super.toString();
    }
}

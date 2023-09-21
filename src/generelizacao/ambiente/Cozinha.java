package generelizacao.ambiente;

public class Cozinha extends Ambiente{

    private boolean microondas;

    public boolean isMicroondas() {
        return microondas;
    }

    public void setMicroondas(boolean microondas) {
        this.microondas = microondas;
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "microondas=" + microondas +
                "} " + super.toString();
    }
}

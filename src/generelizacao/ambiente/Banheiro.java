package generelizacao.ambiente;

public class Banheiro extends Ambiente{

    private boolean banheira;

    public boolean isBanheira() {
        return banheira;
    }

    public void setBanheira(boolean banheira) {
        this.banheira = banheira;
    }

    @Override
    public String toString() {
        return "Banheiro{" +
                "banheira=" + banheira +
                "} " + super.toString();
    }
}

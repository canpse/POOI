package generelizacao.animal;

public class Animal {

    private boolean vivo;

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "vivo=" + vivo +
                '}';
    }
}

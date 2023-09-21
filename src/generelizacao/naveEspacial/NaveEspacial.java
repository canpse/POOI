package generelizacao.naveEspacial;

public class NaveEspacial {

    private double velocidadeMaxima;

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" +
                "velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}

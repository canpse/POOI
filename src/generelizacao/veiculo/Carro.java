package generelizacao.veiculo;

public class Carro extends Veiculo {

    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "portas=" + portas +
                "} " + super.toString();
    }
}

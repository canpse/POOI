package generelizacao.ambiente;

public class Quarto extends Ambiente{

    private int capacidade;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "capacidade=" + capacidade +
                "} " + super.toString();
    }
}

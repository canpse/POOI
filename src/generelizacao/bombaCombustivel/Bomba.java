package generelizacao.bombaCombustivel;

public class Bomba {

    private double totalLitros;
    private float valorLitro;

    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(double totalLitros) {
        this.totalLitros = totalLitros;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public boolean abastecerPorLitro(int litros) {
        if (getTotalLitros() >= litros) {
            setTotalLitros(getTotalLitros() - litros);
            return true;
        } else {
            return false;
        }
    }

    public boolean abastecerPorValor(double valor) {
        double litros = (double) valor / getValorLitro();
        return abastecerPorLitro((int)litros);
    }

    @Override
    public String toString() {
        return "Bomba{" +
                "totalLitros=" + totalLitros +
                ", valorLitro=" + valorLitro +
                '}';
    }
}

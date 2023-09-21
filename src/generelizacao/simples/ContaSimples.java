package generelizacao.simples;

public class ContaSimples extends Conta {

    private double saldoPoupanca;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor) {
        setSaldoPoupanca(getSaldoPoupanca() + valor);
        return true;
    }

    public boolean saquePoupanca(double valor){
        if (getSaldoPoupanca() >= valor) {
            setSaldoPoupanca(getSaldoPoupanca() - valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaSimples{" +
                "saldoPoupanca=" + saldoPoupanca +
                "} " + super.toString();
    }
}

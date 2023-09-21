package generelizacao.naveEspacial;

public class Apolo11 extends NaveEspacial{

    private String tipoCombustivel;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return "Apolo11{" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                "} " + super.toString();
    }
}

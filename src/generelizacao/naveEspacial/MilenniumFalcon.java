package generelizacao.naveEspacial;

public class MilenniumFalcon extends Apolo11 {

    private float classeHiperPropulsor;

    public float getClasseHiperPropulsor() {
        return classeHiperPropulsor;
    }

    public void setClasseHiperPropulsor(float classeHiperPropulsor) {
        this.classeHiperPropulsor = classeHiperPropulsor;
    }

    @Override
    public String toString() {
        return "MilenniumFalcon{" +
                "classeHiperPropulsor=" + classeHiperPropulsor +
                "} " + super.toString();
    }
}

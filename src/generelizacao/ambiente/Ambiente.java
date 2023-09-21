package generelizacao.ambiente;

public class Ambiente {

    private float area;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Ambiente{" +
                "area=" + area +
                '}';
    }
}

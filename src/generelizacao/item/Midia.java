package generelizacao.item;

public class Midia extends Item{

    private String gravadora;
    private float duracao;


    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Midia{" +
                "gravadora='" + gravadora + '\'' +
                ", duracao=" + duracao +
                "} " + super.toString();
    }
}

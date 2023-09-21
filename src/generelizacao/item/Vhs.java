package generelizacao.item;

public class Vhs extends Midia {

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Vhs{" +
                "titulo='" + titulo + '\'' +
                "} " + super.toString();
    }
}

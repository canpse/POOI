package generelizacao.item;

public class Cd extends Midia{

    private int faixas;
    private String artista;
    private String album;

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "faixas=" + faixas +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                "} " + super.toString();
    }
}

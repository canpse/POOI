package generelizacao.xadrez;

public class Peca {

    private int linha;
    private int coluna;
    private boolean cor;
    private int movimentos;

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public boolean isCor() {
        return cor;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(int movimentos) {
        this.movimentos = movimentos;
    }

    public boolean mover(int linha, int coluna) {
        setColuna(coluna);
        setLinha(linha);
        setMovimentos(getMovimentos()+1);
        return true;
    }

    @Override
    public String toString() {
        return "Peca{" +
                "linha=" + linha +
                ", coluna=" + coluna +
                ", cor=" + cor +
                ", movimentos=" + movimentos +
                '}';
    }
}
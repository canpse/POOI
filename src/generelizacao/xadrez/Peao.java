package generelizacao.xadrez;

public class Peao extends Peca{

    @Override
    public boolean mover(int linha, int coluna) {
        if (linha == getLinha()+2 && getMovimentos() == 0) {
            return super.mover(linha, coluna);
        }
        if (linha == getLinha()+1) {
            return super.mover(linha, coluna);
        }
        return false;
    }
}
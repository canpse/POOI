package generelizacao.xadrez;

public class Torre extends Peca{

    @Override
    public boolean mover(int linha, int coluna) {
        if (getLinha() == linha && getColuna() != coluna) {
            return super.mover(linha, coluna);
        }
        if (getLinha() != linha && getColuna() == coluna) {
            return super.mover(linha, coluna);
        }
        return false;
    }
}

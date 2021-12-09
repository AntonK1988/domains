package domains;

public class Rook extends Piece{
    public Rook(boolean isWhite) {
        super('r', isWhite);
    }

    @Override
    public boolean isMove(int preX, int preY, int x, int y, Board board) {
        // code here
        return false;
    }
}

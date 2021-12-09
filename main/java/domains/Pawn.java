package domains;

public class Pawn extends Piece{
    public Pawn(boolean isWhite) {
        super('p', isWhite);
    }

    @Override
    public boolean isMove(int preX, int preY, int x, int y, Board board) {
        // code here
        return false;
    }
}

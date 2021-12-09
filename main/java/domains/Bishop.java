package domains;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super('b', isWhite);
    }

    @Override
    public boolean isMove(int preX, int preY, int x, int y, Board board) {
        // code here
        return false;
    }
}

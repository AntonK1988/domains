package domains;

public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super('q', isWhite);
    }

    @Override
    public boolean isMove(int preX, int preY, int x, int y, Board board) {
        // code here
        return false;
    }
}

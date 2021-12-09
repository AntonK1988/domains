package domains;

public class Horse extends Piece {
    public Horse(boolean isWhite) {super('h', isWhite);
    }

    @Override
    public boolean isMove(int preX, int preY, int x, int y, Board board) {
        // code here
        return false;
    }
}

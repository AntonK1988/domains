package domains;

// Pawn
// Rook
// Bishop
// Queen
// King
// Horse
public class Piece implements Movable{
    protected char value;
    protected boolean isWhite;

    public Piece(char value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    @Override
    public boolean isMove(int preX, int preY, int x, int y, Board board) {
        return false;
    }

    @Override
    public String toString() {
        if (value != '_')
            return (isWhite?"w":"b") + value;
        else
            return "_";
    }
}

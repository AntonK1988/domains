package domains;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Piece>> board;

    public Board() {
        board = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            board.add(new ArrayList<>(8));
            for (int j = 0; j < 8; j++) {
                board.get(i).add(new Piece('_', true));
            }
        }
        initializeFigures(this);
    }

    private static void initializeFigures(Board board) {
        for (int i = 0; i < 8; i++) {
            board.setPiece(i, 1, new Pawn(true));
            board.setPiece(i, 6, new Pawn(false));
        }

        board.setPiece(7, 0, new Rook(true));
        board.setPiece(0,0, new Rook(true));
        board.setPiece(0,7, new Rook(false));
        board.setPiece(7,7, new Rook(false));

        board.setPiece(1, 0, new Horse(true));
        board.setPiece(6, 0, new Horse(true));
        board.setPiece(1, 7, new Horse(false));
        board.setPiece(6, 7, new Horse(false));

        board.setPiece(2, 0, new Bishop(true));
        board.setPiece(5, 0, new Bishop(true));
        board.setPiece(2, 7, new Bishop(false));
        board.setPiece(5, 7, new Bishop(false));

        board.setPiece(3, 0, new Queen(true));
        board.setPiece(3, 7, new Queen(false));

        board.setPiece(4, 0, new King(true));
        board.setPiece(4, 7, new King(false));
    }

    public Piece getPiece(int x, int y) {
        return board.get(y).get(x);
    }

    public void setPiece(int x, int y, Piece p) {
        board.get(y).set(x, p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            List<Piece> line = board.get(i);
            sb.append(i+1).append("\t");
            for (Piece p : line) {
                sb.append(p).append("\t");
            }
            sb.append("\n");
        }
        char[] literals = {'a','b','c','d','e','f','g','h'};
        sb.append("\t");
        for (char c : literals) {
            sb.append(c).append("\t");
        }
        return sb.toString();
    }
}

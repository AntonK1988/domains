package domains;

public class King extends Piece {
    public King(boolean isWhite) {
        super('k', isWhite);
    }

    @Override
    public boolean isMove(int preX, int preY, int x, int y, Board board) {
        if(x + preX>=-1 && x + preX<=1 && y + preY>=-1 && y + preY<=1)
            // текущая позиция фигуры на Board х и y, добовляем им значения вводимые пользователем preX и preY.
            // Король ходит не более одной клетки в любом направлении => вводимле значение <= 1, а так же >=-1.(-1 при условии,что фигура идет назад)
            // т.к. фигура двигается и горизонтально и вертекально.
            return true;
        else if (x + preX<-1 && x + preX>1 && y + preY<-1 && y + preY>1)
            System.out.println("Король, ходит и наносит удары во все стороны по вертикали и диагонали, но только на одну клетку");
       return false;

    }
}

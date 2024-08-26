package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.ArrayList;
import java.util.List;

public class Chariot extends Pieces {
    private final PieceType name = PieceType.CHARIOT;
    private Color color;

    public Chariot(Color color, PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, PieceType.CHARIOT, positionX, positionY, point, xiangQiBoard);
    }

    @Override
    public Double[][] getLegalMoves() {
        return new Double[0][];
    }

    @Override
    public Double[][] getAvailableMoves() {
        return new Double[0][];
    }

    @Override
    public String toString() {
        return getColor().toString() + super.getPieceType().toString();
    }
}

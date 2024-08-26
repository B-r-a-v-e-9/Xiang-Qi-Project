package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class Horse extends Pieces {
    private final PieceType name = PieceType.HORSE;
    private Color color;

    public Horse(Color color,PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, PieceType.HORSE, positionX, positionY, point, xiangQiBoard);
    }

    @Override
    public Double[][] getAvailableMoves() {
        return new Double[0][0];
    }

    @Override
    public Double[][] getLegalMoves() {
        return new Double[0][0];
    }
}

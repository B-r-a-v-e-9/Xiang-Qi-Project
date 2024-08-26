package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class General extends Pieces {
    private final PieceType name = PieceType.GENERAL;
    private Color color;
    private boolean crossedTheRiver;

    public General(Color color,PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, PieceType.GENERAL, positionX, positionY, point, xiangQiBoard);
    }

    @Override
    public Double[][] getLegalMoves() {
        return new Double[0][];
    }

    @Override
    public Double[][] getAvailableMoves() {
        return new Double[0][];
    }
}


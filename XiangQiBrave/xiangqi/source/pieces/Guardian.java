package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class Guardian extends Pieces {
    private final PieceType name = PieceType.GUARDIAN;
    private Color color;
    private boolean crossedTheRiver;

    public Guardian(Color color,PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, PieceType.GUARDIAN, positionX, positionY, point, xiangQiBoard);
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

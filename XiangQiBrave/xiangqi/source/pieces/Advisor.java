package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

public class Advisor extends Pieces {
    private final PieceType name = PieceType.ADVISOR;
    private Color color;
    private boolean crossedTheRiver;

    public Advisor(Color color,PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, PieceType.ADVISOR, positionX, positionY, point, xiangQiBoard);
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

package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class Elephant extends Pieces {
    private final PieceType name = PieceType.ELEPHANT;
    private Color color;
    private boolean crossedTheRiver;

    public Elephant(Color color, PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, PieceType.ELEPHANT, positionX, positionY, point, xiangQiBoard);
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

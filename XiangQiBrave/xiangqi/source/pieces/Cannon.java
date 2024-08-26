package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class Cannon extends Pieces {
    private final PieceType name = PieceType.CANNON;
    private Color color;


    public Cannon(Color color, PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, PieceType.CANNON, positionX, positionY, point, xiangQiBoard);
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

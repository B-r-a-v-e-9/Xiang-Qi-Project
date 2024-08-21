package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class Horse extends Pieces {
    private final PieceType name = PieceType.HORSE;
    private Color color;

    public Horse(Color color, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, positionX, positionY, point, xiangQiBoard);
    }

    public double getPoint() {
        if (color == Color.RED) {
            return 4;
        } else {
            return -4;
        }
    }

    public PieceType getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public Integer[][] getAvailableMoves() {
        return new Integer[0][0];
    }

    @Override
    public Integer[][] getLegalMoves() {
        return new Integer[0][0];
    }
}

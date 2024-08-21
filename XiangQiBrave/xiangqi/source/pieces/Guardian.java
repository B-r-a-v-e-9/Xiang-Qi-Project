package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class Guardian extends Pieces {
    private final PieceType name = PieceType.GUARDIAN;
    private Color color;
    private boolean crossedTheRiver;

    public Guardian(Color color, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, positionX, positionY, point, xiangQiBoard);
    }

    public double getPoint() {
        if (color == Color.RED) {
            return 2;
        } else {
            return -2;
        }
    }


    public PieceType getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public Integer[][] getLegalMoves() {
        return new Integer[0][];
    }

    @Override
    public Integer[][] getAvailableMoves() {
        return new Integer[0][];
    }
}

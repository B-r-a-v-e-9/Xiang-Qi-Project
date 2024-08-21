package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class General extends Pieces {
    private final PieceType name = PieceType.GENERAL;
    private Color color;
    private boolean crossedTheRiver;

    public General(Color color, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, positionX, positionY, point, xiangQiBoard);
    }


    public double getPoint() {
        if(getColor() == Color.RED) {
            return 100;
        } else {
            return -100;
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


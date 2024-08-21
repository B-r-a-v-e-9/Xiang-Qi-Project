package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.ArrayList;
import java.util.List;

public class Chariot extends Pieces {
    private final PieceType name = PieceType.CHARIOT;
    private Color color;

    public Chariot(Color color, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, positionX, positionY, point, xiangQiBoard);
    }


    public double getPoint() {
        if(color == Color.RED) {
            return 9;
        } else {
            return -9;
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

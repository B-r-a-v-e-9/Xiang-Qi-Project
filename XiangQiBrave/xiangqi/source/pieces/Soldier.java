package pieces;

import board.Color;
import board.PieceType;
import board.XiangQiBoard;

import java.util.List;

public class Soldier extends Pieces {
    private final PieceType name = PieceType.SOLDIER;
    private Color color;
    private boolean crossedTheRiver;

    public Soldier(Color color, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, positionX, positionY, point, xiangQiBoard);
    }


    @Override
    public double getPoint() {
        if(color == Color.RED) {
            return 1;
        } else {
            return -1;
        }
    }

    public PieceType getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }


    /* Kiểm tra xem quân tốt có thể đi ngang hay không */
    public boolean canMoveHorizontally() {
        return isSoldierCrossedTheRiver();

    }

    /* Kiểm tra xem quân Tốt đã qua sông chưa bằng cách kiểm tra màu và vị trí */
    public boolean isSoldierCrossedTheRiver() {
        return (this.color == Color.RED && positionX <= 4) ||
                (this.color == Color.BLACK && positionX >= 5);
    }

    @Override
    public Integer[][] getAvailableMoves() {
        return null;
    }

    @Override
    public Integer[][] getLegalMoves() {
        return new Integer[0][];
    }
}


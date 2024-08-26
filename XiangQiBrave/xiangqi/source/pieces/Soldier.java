package pieces;

import board.*;

import java.util.Arrays;
import java.util.List;

public class Soldier extends Pieces {
    private final PieceType name = PieceType.SOLDIER;
    private Color color;
    private boolean crossedTheRiver;

    /** Constructor của quân Tốt
     * @param color Màu của quân tốt
     * @param positionX Tọa độ x của quân tốt
     * @param positionY Tọa độ y của quân tốt
     * @param point Điểm số của quân tốt
     * @param xiangQiBoard Bàn cờ
     * */
    public Soldier(Color color,PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard xiangQiBoard) {
        super(color, PieceType.SOLDIER, positionX, positionY, point, xiangQiBoard);
    }

    /** Kiểm tra xem quân tốt có thể đi ngang hay không */
    public boolean canMoveHorizontally() {
        return isSoldierCrossedTheRiver();
    }

    /** Kiểm tra xem quân Tốt đã qua sông chưa bằng cách kiểm tra màu và vị trí */
    public boolean isSoldierCrossedTheRiver() {
        return (this.color == Color.RED && positionX <= 4) || (this.color == Color.BLACK && positionX >= 5);
    }

    @Override
    public Double[][] getAvailableMoves() {


        return null;
    }

    @Override
    public Double[][] getLegalMoves() {
        Double[][] legalMoves = new Double[10][9];
        legalMoves[0][0] = 11.0;
        return legalMoves;
    }


}

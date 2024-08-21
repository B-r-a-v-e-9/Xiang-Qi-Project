package pieces;

/* © COPYRIGHT BY BRAVE */

import board.Color;
import board.Position;
import board.XiangQiBoard;
import board.XiangQiGame;
import exception.PinnedPieceException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public abstract class Pieces {
    public XiangQiGame xiangQiGame;
    protected XiangQiBoard xiangQiBoard;
    protected Color color;
    private boolean isPinned;
    private boolean pinning;
    private final double point;
    public int positionX;
    public int positionY;


    public Pieces(Color color, int positionX, int positionY, double point, XiangQiBoard board) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
        this.point = point;
        this.xiangQiBoard = board;
        this.isPinned = false;
        this.pinning = false;
    }

    /**
     * Hàm gắn đối tượng XiangQiGame vào phương thức hiện tại.
     * @param xiangQiGame object của XiangQiGame
     */
    public void attachGame(XiangQiGame xiangQiGame) {
        this.xiangQiGame = xiangQiGame;
    }

    /**
     * Ghi đối tượng vào XiangQiBoard hiện tại
     * @param xiangQiBoard object của XiangQiBoard
     */
    public void setXiangQiBoard(XiangQiBoard xiangQiBoard) {
        this.xiangQiBoard = xiangQiBoard;
    }

    /**
    * Hàm ghi vị trí của quân cờ
    * @param positionX Tọa độ X của quân cờ
     * @param positionY Tọa độ Y của quân cờ
    */
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /**
     * Hàm ghi màu của quân cờ
     * @param color Màu của quân cờ
     * */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Hàm lấy màu của quân cờ
     * */
    public Color getColor() {
        return this.color;
    }

    /**
     * Hàm lấy điểm số của quân cờ
     * */
    public double getPoint() {
        return this.point;
    }

    /**
     * Hàm kiểm tra quân cờ có bị ghim hay không
     * */
    public boolean isPinned() {
        return this.isPinned;
    }

    /**
     * Hàm ghi quân cờ bị ghim
     * */
    public void setPinned(boolean pinned) {
        this.isPinned = pinned;
    }

    /**
     * Hàm kiểm tra quân cờ có đang bị ghim hay không
     * */
    public boolean isPinning() {
        return this.pinning;
    }

    /**
     * Hàm ghi quân cờ đang bị ghim
     * */
    public void setPinning(boolean pinning) {
        this.pinning = pinning;
    }

    /**
     * Hàm kiểm tra quân cờ có phải là đồng minh hay không
     * @param another Quân cờ ở vị trí (position) khác
     * */
    public boolean isAlly(Position another) {
        return another.isOccupied() && another.getPieces().getColor().equals(this.color); /*  EQUAL means that its ally*/
    }

    /**
     * Hàm kiểm tra quân cờ có phải là kẻ địch hay không
     * @param another Quân cờ ở vị trí (position) khác
     * */
    public boolean isEnemy(Position another) {
        return another.isOccupied() && ! (another.getPieces().getColor().equals(this.color)) /* NOT EQUAL means that its enemy */;
    }

    /**
     * Hàm lấy những nước đi được, trả về là một mảng 2 chiều
     * */
    public abstract Integer[][] getAvailableMoves();

    public abstract Integer[][] getLegalMoves();

    public boolean withinBoard(int x, int y) {
        return x >= 0 && y >= 0 && x < this.xiangQiBoard.getRowNumber() && y < this.xiangQiBoard.getColumnNumber();
    }

}


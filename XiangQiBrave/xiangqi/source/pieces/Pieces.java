package pieces;

/* © COPYRIGHT BY BRAVE */

import board.*;

public abstract class Pieces {
    protected XiangQiBoard xiangQiBoard;
    protected Color color;
    protected PieceType pieceType;
    private boolean isPinned;
    private boolean pinning;
    private final double point;
    public int positionX;
    public int positionY;


    public Pieces(Color color, PieceType pieceType, int positionX, int positionY, double point, XiangQiBoard board) {
        this.color = color;
        this.pieceType = pieceType;
        this.positionX = positionX;
        this.positionY = positionY;
        this.point = point;
        this.xiangQiBoard = board;
        this.isPinned = false;
        this.pinning = false;
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
     * Hàm lấy vị trí của quân cờ trên bàn cờ
     * */
    public Integer[][] getPosition() {
        return new Integer[][]{{positionX, positionY}};
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
     * Hàm lấy kiểu quân cờ
     * */
    public PieceType getPieceType() {
        return pieceType;
    }

    /**
     * Hàm ghi kiểu quân cờ
     * */
    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
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
    public boolean isAlly(Pieces another) {
        return another.getColor() == this.color;
    }

    /**
     * Hàm kiểm tra quân cờ có phải là kẻ địch hay không
     * @param another Quân cờ ở vị trí (position) khác
     * */
    public boolean isEnemy(Pieces another) {
        return another.getColor() != this.color;
    }

    public Pieces getPiece() {
        return this;
    }

    /**
     * Hàm lấy những nước đi được, trả về là một mảng 2 chiều
     * */
    public abstract Double[][] getAvailableMoves();

    /**
     * Hàm lấy những nước đi hợp lệ, trả về là một mảng 2 chiều
     * */
    public abstract Double[][] getLegalMoves();


    @Override
    public String toString() {
        return getColor().toString() + getPieceType();
    }
}


package pieces;

import board.BoardCreator;

public class Soldier extends Pieces {
    private String name;
    private boolean color;
    private int x;
    private int y;
    private final static String imagePathForBlack = "images/BlackTeam/Black_Soldier_1.png";
    private final static String imagePathForRed = "images/RedTeam/Red_Soldier_1.png";

    public Soldier() {

    }

    public Soldier(String name, boolean color, int x, int y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getValueAndPiece(String name, boolean color) {
        return super.getValueAndPiece(name, color);
    }

    @Override
    public void move(int ToDestinationX, int ToDestinationY) {

        if (isValidMove(this.x, this.y, ToDestinationX, ToDestinationY, BoardCreator.getInstance().getXiangQiBoard())) {

            Pieces[][] XiangQiBoard = BoardCreator.getInstance().getXiangQiBoard();

            int OldDestinationX = this.x;
            int OldDestinationY = this.y;

            XiangQiBoard[ToDestinationX][ToDestinationY] = this;

            XiangQiBoard[OldDestinationX][OldDestinationY] = null;

        } else {
            // Nếu nước đi không hợp lệ, có thể thông báo lỗi hoặc xử lý logic khác
            System.out.println("Invalid move for Soldier");
        }
    }

    @Override
    public boolean isValidMove(int startedAtX,int startedAtY,int movedToX, int movedToY, Pieces[][] board) {

        int deltaX = movedToX - startedAtX;
        int deltaY = movedToY - startedAtY;

        if (color) { // Quân đỏ
            if (startedAtY <= 4) { // Chưa qua sông
                return deltaY == 1 && deltaX == 0;
            } else { // Đã qua sông
                return (deltaY == 1 && deltaX == 0) || (deltaY == 0 && Math.abs(deltaX) == 1);
            }
        } else { // Quân đen
            if (startedAtY >= 5) { // Chưa qua sông
                return deltaY == -1 && deltaX == 0;
            } else { // Đã qua sông
                return (deltaY == -1 && deltaX == 0) || (deltaY == 0 && Math.abs(deltaX) == 1);
            }
        }
    }

    @Override
    public String getImagePathForRed() {
        return imagePathForRed;
    }

    public String getImagePathForBlack() {
        return imagePathForBlack;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

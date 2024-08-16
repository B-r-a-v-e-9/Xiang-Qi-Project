package pieces;

public class General extends Pieces {
    private String name;
    private boolean color;
    private int x;
    private int y;
    private final static String imagePathForBlack = "images/BlackTeam/Black_General_1.png";
    private final static String imagePathForRed = "images/RedTeam/Red_General_1.png";

    public General() {

    }

    public General(String name, boolean color, int x, int y) {
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
        this.x = ToDestinationX;
        this.y = ToDestinationY;
    }

    @Override
    public boolean isValidMove(int startedAtX,int startedAtY,int movedToX, int movedToY, Pieces[][] board) {
        return true;
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

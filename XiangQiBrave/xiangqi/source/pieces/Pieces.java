package pieces;

public abstract class Pieces {



    public Pieces() {
        /* CONSTRUCTOR */
    }

    public double getValueAndPiece(String name, boolean color) {
        if (color) { /* True means red, False means black */

            return switch (name) {
                case "General" -> 50;
                case "Chariot" -> 9;
                case "Cannon" -> 4.5;
                case "Horse" -> 4;
                case "Elephant" -> 3;
                case "Guardian" -> 2;
                case "Soldier" -> 1;
                default -> 0;
            };
        } else {
            return switch (name) {
                case "General" -> -50;
                case "Chariot" -> -9;
                case "Cannon" -> -4.5;
                case "Horse" -> -4;
                case "Elephant" -> -3;
                case "Guardian" -> -2;
                case "Soldier" -> -1;
                default -> 0;
            };
        }
    }

    public abstract boolean isValidMove(int startedAtX,int startedAtY,int movedToX, int movedToY, Pieces[][] board);

    public abstract void move(int x, int y);

    public abstract String getImagePathForRed();

    public abstract String getImagePathForBlack();

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getX();

    public abstract void setX(int x);

    public abstract int getY();

    public abstract void setY(int y);

    public abstract boolean isColor();

    public abstract void setColor(boolean color);

}


package board;

import pieces.Pieces;

public class Position {
    private Pieces pieces;
    private String shade;
    protected int positionX;
    protected int positionY;

    public Position() {
        /* CONSTRUCTOR */
    }

    public Position(Pieces pieces, String shade){
        this.pieces = pieces;
        this.shade = shade;
    }

    public void setPosition(int setX, int setY) {
        this.positionX = setX;
        this.positionY = setY;
    }

    public Integer[] getPosition(){
        return new Integer[] {positionX, positionY};
    }

    public String getShade() {
        return this.shade;
    }

    public Pieces getPieces() {
        return this.pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    /*
    * Thay thế quân cờ này bằng quân cờ khác. Nghĩa là quân cờ đã di chuyển
    * @param another
    *  */
    public void replacePieces(Pieces another){
        this.pieces = another;
    }

    public boolean isOccupied() {
        return this.pieces != null;
    }

    public boolean isSamePosition(Position another) {
        if (!this.isOccupied() && !another.isOccupied()) {
            return true;
        } else if (!this.isOccupied() && another.isOccupied()) {
            return false;
        } else if (this.isOccupied() && !another.isOccupied()) {
            return false;
        } else {
            Pieces thisPiece = this.getPieces();
            Pieces anotherPiece = another.getPieces();
            return thisPiece.toString().equals(anotherPiece.toString());
        }
    }
}

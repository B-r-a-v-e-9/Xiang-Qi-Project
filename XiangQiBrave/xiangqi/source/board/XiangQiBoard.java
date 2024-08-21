/* © COPYRIGHT BY BRAVE */

package board;

import pieces.*;

import java.security.Guard;
import java.util.Arrays;


public class XiangQiBoard implements BoardInterface {

    protected static final int DEFAULT_NUM_ROW = 10;

    protected static final int DEFAULT_NUM_COL = 9;

    public static final Color RED = Color.RED;

    public static final Color BLACK = Color.BLACK;

    public static final int NO_LIMIT = 10000;

    private XiangQiGame game;

    private Position[][] positions = new Position[DEFAULT_NUM_ROW][DEFAULT_NUM_COL];

    public boolean soldierCrossedTheRiver;

    public String capturedToString;


    public XiangQiBoard() {
        this.initializeDefaultPieces();
    }

    public void attachAndInitializeDefaultPieces(XiangQiGame game) {
        this.game = game;
        this.initializeDefaultPieces();
    }

    public Position getPositionAt(int x, int y) {
        return this.positions[x][y];
    }

    public Position[][] getPosition() {
        return this.positions;
    }

    public Position[] getAllPosition() {
        Position[] positionArray = new Position[90];
        int COUNT = 0;

        for(int ROW = 0; ROW < DEFAULT_NUM_ROW ; ++ROW) {
            for(int COLUMN = 0; COLUMN < DEFAULT_NUM_COL; ++COLUMN) {
                positionArray[COUNT++] = this.positions[ROW][COLUMN];
            }
        }

        return positionArray;
    }

    public void setPositions(Position[][] positions) {
        for (Color color : new Color[]{RED, BLACK}) {
            for (Pieces piece : this.getAllPiecesOfColor(color)) {
                piece.setXiangQiBoard(this);
            }
        }
        this.positions = positions;
    }

    public int getRowNumber() {
        return DEFAULT_NUM_ROW;
    }

    public int getColumnNumber() {
        return DEFAULT_NUM_COL;
    }

    public void initializeDefaultPieces() {
        this.positions[0][0].setPieces(new Chariot(Color.BLACK, 0, 0, -9, this));
        this.positions[0][1].setPieces(new Horse(Color.BLACK, 0, 1, -4, this));
        this.positions[0][2].setPieces(new Elephant(Color.BLACK, 0, 2, -3, this));
        this.positions[0][3].setPieces(new Guardian(Color.BLACK, 0, 4, -2, this));
        this.positions[0][4].setPieces(new General(Color.BLACK, 0, 4, -100, this));
        this.positions[0][5].setPieces(new Guardian(Color.BLACK, 0, 5, -2, this));
        this.positions[0][6].setPieces(new Elephant(Color.BLACK, 0, 6, -3, this));
        this.positions[0][7].setPieces(new Horse(Color.BLACK, 0, 7, -4, this));
        this.positions[0][8].setPieces(new Chariot(Color.BLACK, 0, 8, -9, this));
        /* CREATING 2 CANNONS FOR BLACK */
        this.positions[2][1].setPieces(new Cannon(Color.BLACK, 2, 1, -4.5, this));
        this.positions[2][7].setPieces(new Chariot(Color.BLACK, 0, 0, -4.5, this));

        /* CREATING 5 SOLDIERS FOR BLACK */

        for (int i = 0; i < 9 ; i = i + 2){
            this.positions[3][i].setPieces(new Soldier(Color.BLACK, 3, i, -1, this));
        }

        /* RED PIECES CREATING */

        this.positions[9][0].setPieces(new Chariot(Color.RED, 9, 0, 9, this));
        this.positions[9][1].setPieces(new Horse(Color.RED, 9, 1, 4, this));
        this.positions[9][2].setPieces(new Elephant(Color.RED, 9, 2, 2, this));
        this.positions[9][3].setPieces(new Guardian(Color.RED, 9, 3, 2, this));
        this.positions[9][4].setPieces(new General(Color.RED, 9, 4, 100, this));
        this.positions[9][5].setPieces(new Guardian(Color.RED, 9, 5, 2, this));
        this.positions[9][6].setPieces(new Elephant(Color.RED, 9, 6, 2, this));
        this.positions[9][7].setPieces(new Horse(Color.RED, 9, 7, 4, this));
        this.positions[9][8].setPieces(new Chariot(Color.RED, 9, 8, 9, this));

        /* CREATING 2 CANNONS FOR RED */
        this.positions[7][1].setPieces(new Cannon(Color.RED, 7, 1, 4.5, this));
        this.positions[7][7].setPieces(new Cannon(Color.RED, 7, 7, 4.5, this));

        /* CREATING 5 SOLDIERS FOR RED */
        for (int i = 0; i < 9 ; i = i + 2){
            this.positions[6][i].setPieces(new Soldier(Color.RED, 6, i, 1, this));
        }
    }

    private void attachGameAllPieces() {
        Pieces[] var1 = this.getAllPieces();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Pieces piece = var1[var3];
            piece.attachGame(this.game);
        }
    }

    public Pieces[] getAllPieces() {
        Pieces[] redPieces = this.getAllPiecesOfColor(Color.RED);
        Pieces[] blackPieces = this.getAllPiecesOfColor(Color.BLACK);
        Pieces[] allPieces = new Pieces[blackPieces.length + redPieces.length];
        System.arraycopy(blackPieces, 0, allPieces, 0, blackPieces.length);
        System.arraycopy(redPieces, 0, allPieces, redPieces.length, redPieces.length);
        return allPieces;
    }

    public Pieces[] getAllPiecesOfColor(Color color) {
        int count = 0;
        Pieces[] pieces = new Pieces[16];

        for(int ROW = 0; ROW < DEFAULT_NUM_ROW; ++ROW) {
            for(int COLUMN = 0; COLUMN < DEFAULT_NUM_COL; ++COLUMN) {
                if (this.positions[ROW][COLUMN].isOccupied() && this.positions[ROW][COLUMN].getPieces().getColor() == (color)) {
                    pieces[count++] = this.positions[ROW][COLUMN].getPieces();
                }
            }
        }

        return (Pieces[]) Arrays.copyOf(pieces, count);
    }

    public Position getPieces(int positionX, int positionY){
        if (positionX < 0 || positionX >= 10 || positionY < 0 || positionY >= 9) return null;
        return positions[positionX][positionY];
    }
}

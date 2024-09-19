/* © COPYRIGHT BY BRAVE */

package board;

import pieces.*;
import utility.XiangQiUtility;
import java.util.Arrays;


public class XiangQiBoard implements BoardInterface {

    protected static final int DEFAULT_NUM_ROW = 10;

    protected static final int DEFAULT_NUM_COL = 9;

    protected final Pieces[][] board = new Pieces[DEFAULT_NUM_ROW][DEFAULT_NUM_COL];

    public XiangQiBoard() {
        this.initializeDefaultPieces();
    }

    public int getRowNumber() {
        return DEFAULT_NUM_ROW;
    }

    public int getColumnNumber() {
        return DEFAULT_NUM_COL;
    }


    public void initializeDefaultPieces() {
        this.board[0][0] = new Chariot(Color.BLACK, PieceType.CHARIOT, 0, 0, -9, this);
        this.board[0][1] = new Horse(Color.BLACK, PieceType.HORSE,0, 1, -4, this);
        this.board[0][2] = new Elephant(Color.BLACK, PieceType.ELEPHANT,0, 2, -3, this);
        this.board[0][3] = new Advisor(Color.BLACK, PieceType.ADVISOR,0, 4, -2, this);
        this.board[0][4] = new General(Color.BLACK, PieceType.GENERAL,0, 4, -100, this);
        this.board[0][5] = new Advisor(Color.BLACK, PieceType.ADVISOR,0, 5, -2, this);
        this.board[0][6] = new Elephant(Color.BLACK, PieceType.ELEPHANT,0, 6, -3, this);
        this.board[0][7] = new Horse(Color.BLACK, PieceType.HORSE,0, 7, -4, this);
        this.board[0][8] = new Chariot(Color.BLACK, PieceType.CHARIOT,0, 8, -9, this);
        /* CREATING 2 CANNONS FOR BLACK */
        this.board[2][1] = new Cannon(Color.BLACK,PieceType.CANNON, 2, 1, -4.5, this);
        this.board[2][7] = new Chariot(Color.BLACK, PieceType.CANNON,0, 0, -4.5, this);

        /* CREATING 5 SOLDIERS FOR BLACK */

        for (int i = 0; i < 9 ; i = i + 2){
            this.board[3][i] = new Soldier(Color.BLACK, PieceType.SOLDIER,3, i, -1, this);
        }

        /* RED PIECES CREATING */

        this.board[9][0] = new Chariot(Color.RED, PieceType.CHARIOT,9, 0, 9, this);
        this.board[9][1] = new Horse(Color.RED, PieceType.HORSE,9, 1, 4, this);
        this.board[9][2] = new Elephant(Color.RED, PieceType.ELEPHANT,9, 2, 2, this);
        this.board[9][3] = new Advisor(Color.RED, PieceType.ADVISOR,9, 3, 2, this);
        this.board[9][4] = new General(Color.RED,PieceType.GENERAL, 9, 4, 100, this);
        this.board[9][5] = new Advisor(Color.RED, PieceType.ADVISOR,9, 5, 2, this);
        this.board[9][6] = new Elephant(Color.RED,PieceType.ELEPHANT, 9, 6, 2, this);
        this.board[9][7] = new Horse(Color.RED,PieceType.HORSE, 9, 7, 4, this);
        this.board[9][8] = new Chariot(Color.RED, PieceType.CHARIOT,9, 8, 9, this);

        /* CREATING 2 CANNONS FOR RED */
        this.board[7][1] = new Cannon(Color.RED, PieceType.CANNON,7, 1, 4.5, this);
        this.board[7][7] = new Cannon(Color.RED, PieceType.CANNON,7, 7, 4.5, this);

        /* CREATING 5 SOLDIERS FOR RED */
        for (int i = 0; i < 9 ; i = i + 2){
            this.board[6][i] = new Soldier(Color.RED, PieceType.SOLDIER, 6, i, 1, this);
        }
    }


}

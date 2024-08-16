package board;

import pieces.*;


public class BoardCreator implements BoardInterface {

    protected static final int DEFAULT_NUM_ROW = 10;
    protected static final int DEFAULT_NUM_COL = 9;

    protected Pieces[][] XiangQiBoard = new Pieces[DEFAULT_NUM_ROW][DEFAULT_NUM_COL];

    private static BoardCreator creator;

    public BoardCreator() {
        createBoard();
    }

    public static BoardCreator getInstance(){
        if(creator == null){
            creator = new BoardCreator();
        }

        return creator;
    }

    @Override
    public Pieces[][] createBoard() {

        /* BLACK PIECES CREATING */

        XiangQiBoard[0][0] = new Chariot("Chariot", false, 0,0 );
        XiangQiBoard[0][1] = new Horse("Horse", false, 0,1);
        XiangQiBoard[0][2] = new Elephant("Elephant", false, 0,2);
        XiangQiBoard[0][3] = new Guardian("Guardian", false, 0,3);
        XiangQiBoard[0][4] = new General("General", false, 0,4);
        XiangQiBoard[0][5] = new Guardian("Guardian", false, 0,5);
        XiangQiBoard[0][6] = new Elephant("Elephant", false, 0,6);
        XiangQiBoard[0][7] = new Horse("Horse", false, 0,7);
        XiangQiBoard[0][8] = new Chariot("Chariot", false, 0,8 );

        /* CREATING 2 CANNONS FOR BLACK */
        XiangQiBoard[2][1] = new Cannon("Cannon", false, 2,1);
        XiangQiBoard[2][7] = new Cannon("Cannon", false, 2,7);

        /* CREATING 5 SOLDIERS FOR BLACK */

        for (int i = 0; i < 9 ; i = i + 2){
            XiangQiBoard[3][i] = new Soldier("Soldier", false, 3, i);
        }

        /* RED PIECES CREATING */

        XiangQiBoard[9][0] = new Chariot("Chariot", true, 9,0 );
        XiangQiBoard[9][1] = new Horse("Horse", true, 9,1);
        XiangQiBoard[9][2] = new Elephant("Elephant", true, 9,2);
        XiangQiBoard[9][3] = new Guardian("Guardian", true, 9,3);
        XiangQiBoard[9][4] = new General("General", true, 9,4);
        XiangQiBoard[9][5] = new Guardian("Guardian", true, 9,5);
        XiangQiBoard[9][6] = new Elephant("Elephant", true, 9,6);
        XiangQiBoard[9][7] = new Horse("Horse", true, 9,7);
        XiangQiBoard[9][8] = new Chariot("Chariot", true, 9,8 );

        /* CREATING 2 CANNONS FOR RED */
        XiangQiBoard[7][1] = new Cannon("Cannon", true, 7,1);
        XiangQiBoard[7][7] = new Cannon("Cannon", true, 7,7);

        /* CREATING 5 SOLDIERS FOR RED */
        for (int i = 0; i < 9 ; i = i + 2){
            XiangQiBoard[6][i] = new Soldier("Soldier", true, 6, i);
        }

        return XiangQiBoard;
    }

    public Pieces[][] getXiangQiBoard() {
        return XiangQiBoard;
    }
}

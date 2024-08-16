import pieces.Pieces;
import board.BoardCreator;

public class XiangQi {
    public static void main(String[] args)  {
        BoardCreator creator1 = new BoardCreator();
        Pieces[][] board = creator1.createBoard();
        System.out.println(board[0][1].getName());
        System.out.println(board[0][1].hashCode());
        System.out.println(board[0][2].hashCode());
        System.out.println(board[0][3].hashCode());
        System.out.println(board[0][4].hashCode());
        System.out.println(board[0][5].hashCode());
        System.out.println(board[0][6].hashCode());
        System.out.println(board[0][7].hashCode());
        System.out.println(board[0][8].hashCode());
        board[3][0].move(4,0);
        System.out.println(board[3][0].getName());
        System.out.println(board[4][0].getName());


    }
}

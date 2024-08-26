import board.Position;
import board.XiangQiGame;
import pieces.Pieces;
import board.XiangQiBoard;

public class XiangQi {
    public static void main(String[] args) {
        XiangQiBoard board = new XiangQiBoard();
        XiangQiGame game = new XiangQiGame();
        board.initializeDefaultPieces();

        Position[][] a = board.getAllPosition();
        System.out.println(a[0][0].getPieces().toString());


    }
}

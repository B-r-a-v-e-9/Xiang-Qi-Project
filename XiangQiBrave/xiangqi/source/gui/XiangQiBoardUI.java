//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class XiangQiBoardUI extends JPanel {
    private final Image[][] boardImages = new Image[10][9];

    public XiangQiBoardUI() {
        this.loadImages();
        this.setPreferredSize(new Dimension(1400, 800));
    }

    private void loadImages() {
        String blackPath = "B:\\Bravecoder\\XiangqiProject\\XiangQiBrave\\xiangqi\\source\\asset\\BlackTeam\\";
        String redPath = "B:\\Bravecoder\\XiangqiProject\\XiangQiBrave\\xiangqi\\source\\asset\\RedTeam\\";
        this.boardImages[0][0] = (new ImageIcon(blackPath + "Black_Chariot_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[0][1] = (new ImageIcon(blackPath + "Black_Horse_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[0][2] = (new ImageIcon(blackPath + "Black_Elephant_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[0][3] = (new ImageIcon(blackPath + "Black_Advisor_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[0][4] = (new ImageIcon(blackPath + "Black_General_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[0][5] = (new ImageIcon(blackPath + "Black_Advisor_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[0][6] = (new ImageIcon(blackPath + "Black_Elephant_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[0][7] = (new ImageIcon(blackPath + "Black_Horse_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[0][8] = (new ImageIcon(blackPath + "Black_Chariot_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[2][1] = (new ImageIcon(blackPath + "Black_Cannon_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[2][7] = (new ImageIcon(blackPath + "Black_Cannon_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[3][0] = (new ImageIcon(blackPath + "Black_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[3][2] = (new ImageIcon(blackPath + "Black_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[3][4] = (new ImageIcon(blackPath + "Black_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[3][6] = (new ImageIcon(blackPath + "Black_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[3][8] = (new ImageIcon(blackPath + "Black_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][0] = (new ImageIcon(redPath + "Red_Chariot_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][1] = (new ImageIcon(redPath + "Red_Horse_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][2] = (new ImageIcon(redPath + "Red_Elephant_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][3] = (new ImageIcon(redPath + "Red_Advisor_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][4] = (new ImageIcon(redPath + "Red_General_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][5] = (new ImageIcon(redPath + "Red_Advisor_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][6] = (new ImageIcon(redPath + "Red_Elephant_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][7] = (new ImageIcon(redPath + "Red_Horse_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[9][8] = (new ImageIcon(redPath + "Red_Chariot_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[7][1] = (new ImageIcon(redPath + "Red_Cannon_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[7][7] = (new ImageIcon(redPath + "Red_Cannon_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[6][0] = (new ImageIcon(redPath + "Red_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[6][2] = (new ImageIcon(redPath + "Red_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[6][4] = (new ImageIcon(redPath + "Red_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[6][6] = (new ImageIcon(redPath + "Red_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
        this.boardImages[6][8] = (new ImageIcon(redPath + "Red_Soldier_1.png")).getImage().getScaledInstance(50, 50, 4);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.drawBoard(g);
    }

    private void drawBoard(Graphics g) {
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 9; ++j) {
                g.drawRect(j * 50, i * 50, 50, 50);
                if (this.boardImages[i][j] != null) {
                    g.drawImage(this.boardImages[i][j], j * 50, i * 50, 50, 50, this);
                }
            }
        }

    }

}

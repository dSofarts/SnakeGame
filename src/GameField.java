import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    private final int SIZE = 720;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 2025;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;


    public GameField() {

    }
}

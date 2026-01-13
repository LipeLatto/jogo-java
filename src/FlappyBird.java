import javax.swing.*;
import java.awt.*;

public class FlappyBird extends JPanel {

    Image bird;
    Image bg;

    public FlappyBird() {
        bird = new ImageIcon("assets/flappybird.png").getImage();
        bg = new ImageIcon("assets/flappybirdbg.png").getImage();

        this.setPreferredSize(new Dimension(360, 640));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(bg, 0, 0, 360, 640, null);
        g.drawImage(bird, 150, 300, 34, 24, null);
    }
}

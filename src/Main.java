import javax.swing.JFrame;
import java.awt.EventQueue;


public class Main extends JFrame {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var puzzle = new Puzzle();
            puzzle.setVisible(true);
        });
    }
}
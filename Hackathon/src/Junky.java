import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Junky extends JFrame {

    public Junky() {
       setTitle("Simple example");
       setSize(300, 200);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       Junky ex = new Junky();
       ex.setVisible(true);
    }
}
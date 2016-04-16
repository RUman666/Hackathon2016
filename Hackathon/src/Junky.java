import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
public class Junky extends JFrame {

    public Junky() {
       initUI();
    }
    public final void initUI() {
    	
    	JPanel panel = new JPanel();
    	getContentPane().add(panel);
    	
    	panel.setLayout(null);
    	
        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(0, 0, 70, 50);
        panel.setToolTipText("This is a button");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
           }
        });
        JButton otherButton = new JButton("I'm a button!");
        otherButton.setBounds(70, 0, 70, 50);
        panel.setToolTipText("My Name Jeff");
        panel.add(quitButton);
        panel.add(otherButton);
        
        setTitle("ButtonTest");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
       Junky ex = new Junky();
       ex.setVisible(true); 
    }
}


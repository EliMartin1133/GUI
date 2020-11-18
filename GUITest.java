import java.awt.*;
import javax.swing.*;

public class GUITest {

	private static final int HEIGHT = 400;
	private static final int WIDTH = 300;

	public static void main(String[] args) {
		// so far, all our program were sequential
		// they reached the END
		
		JFrame window = new JFrame("Dark Wave");
		window.setSize(WIDTH, HEIGHT);
		window.setLocationRelativeTo(null);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		window.setLayout(layout);
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b52 = new JButton("at code monkeys");
		JButton doNotPushMe = new JButton("my finger is on the button");
		
		window.add(b1);
		window.add(b2);
		window.add(b52);
		window.add(doNotPushMe);
		
		
		window.pack();
		window.setVisible(true);
		
	}

}

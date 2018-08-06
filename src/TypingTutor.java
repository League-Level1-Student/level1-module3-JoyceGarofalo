import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter = generateRandomLetter();
	
	public static void main(String[] args) {
		
	}
	
	public char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	     
	}
	public void CreateUI(){
		frame.setVisible(true);
		frame.add(panel);
		frame.add(label);
		label.setText(Character.toString(currentLetter));
	}
	
}

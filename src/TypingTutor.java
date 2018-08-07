import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter = generateRandomLetter();
	
	public static void main(String[] args) {
		TypingTutor typing = new TypingTutor();
		typing.CreateUI();
	}
	
	public char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	     
	}
	public void CreateUI(){
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		frame.add(label);
		label.setText(Character.toString(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		frame.setSize(200, 200);
		System.out.println("you typed: " + e.getKeyChar());
		if(e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			frame.getContentPane().setBackground(Color.GREEN);	
			frame.setVisible(true);
		}
		else {

			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		frame.setSize(200, 200);
		currentLetter = generateRandomLetter();
		label.setText(Character.toString(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
	}
	
	
}

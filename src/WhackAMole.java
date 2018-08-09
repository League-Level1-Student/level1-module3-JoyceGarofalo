import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.MalformedInputException;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	JFrame frame;
	JPanel panel;
	Date d = new Date();

	public static void main(String[] args) {
		WhackAMole mole = new WhackAMole();
		mole.CreateUI();
		
	}

	public void CreateUI() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setTitle("Whack A Button");
		Random random = new Random();
		int ran = random.nextInt(24);
		drawButtons(ran);
		//frame.pack();
		frame.setSize(250, 400);
		frame.setVisible(true);
		
	}

	public void drawButtons(int ran) {
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if(i == ran) {
				button.setText("mole!");
			}
			
		}
	}
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	        
	     }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton mole = (JButton) e.getSource();
		if(mole.getText().equals("mole!")) {
			frame.dispose();
			CreateUI();
		}
		else {
			endGame(d, 10);
		}
		
	}

	
}

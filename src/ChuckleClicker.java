import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();
	
	public static void main(String[] args) {
		ChuckleClicker chuckleclicker = new ChuckleClicker();
		chuckleclicker.makeButtons();
		
	}
	
	public void makeButtons(){
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.setText("joke");
		punchline.setText("punchline");
		frame.setSize(200, 200);
		frame.setVisible(true);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(joke)) {
			System.out.println("Why aren't koalas actal bears?");
		}
		if(buttonPressed.equals(punchline)) {
			System.out.println("They don't meet the koalafications");
			System.exit(0);
		}
		
	
	}
}

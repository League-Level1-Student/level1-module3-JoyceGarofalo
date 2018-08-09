import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel cherry = new JLabel();
	JLabel orange = new JLabel();
	JLabel lime = new JLabel();
	JButton spin = new JButton();
	
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
		slot.CreateUI();
	}
	
	public void CreateUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(700, 400);
		frame.add(spin);
	}
	
	public void Image() {
		Random random = new Random();
		int rand = random.nextInt(2);
		if(rand == 0) {
		cherry.setIcon(new ImageIcon("cherry.png"));
		}
		else if(rand == 1) {
			orange.setIcon(new ImageIcon("orange.png"));
		}
		else {
			lime.setIcon(new ImageIcon("lime.png"));
		}
		
		
	}
}

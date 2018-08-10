import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
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
		frame.setSize(1000, 400);
		panel.add(cherry);
		panel.add(orange);
		panel.add(lime);
		panel.add(spin);
		spin.setText("SPIN");
		spin.addActionListener(this);
		
	}

	public void CherrySlot() {
		Random random = new Random();
		int rand = random.nextInt(3);
		if (rand == 0) {
			cherry.setIcon(new ImageIcon("cherry.png"));
			cherry.setVisible(true);
		} else if (rand == 1) {
			cherry.setIcon(new ImageIcon("orange.png"));
			cherry.setVisible(true);
		} else {
			cherry.setIcon(new ImageIcon("lime.png"));
			cherry.setVisible(true);
		}
	}

	public void OrangeSlot() {
		Random random = new Random();
		int rand = random.nextInt(3);
		if (rand == 0) {
			orange.setIcon(new ImageIcon("cherry.png"));
			orange.setVisible(true);
		} else if (rand == 1) {
			orange.setIcon(new ImageIcon("orange.png"));
			orange.setVisible(true);
		} else {
			orange.setIcon(new ImageIcon("lime.png"));
			orange.setVisible(true);
		}
	}

	public void LimeSlot() {
		Random random = new Random();
		int rand = random.nextInt(3);
		if (rand == 0) {
			lime.setIcon(new ImageIcon("cherry.png"));
			lime.setVisible(true);
		} else if (rand == 1) {
			lime.setIcon(new ImageIcon("orange.png"));
			lime.setVisible(true);
		} else {
			lime.setIcon(new ImageIcon("lime.png"));
			lime.setVisible(true);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(spin)) {
			OrangeSlot();
			CherrySlot();
			LimeSlot();
		}
	}
}

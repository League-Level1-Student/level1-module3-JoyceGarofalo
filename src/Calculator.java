import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JLabel label = new JLabel();
	JTextField left = new JTextField();
	JTextField right = new JTextField();
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.CreateUI();
	}
	public void CreateUI() {
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		frame.setVisible(true);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}
	
	public void add() {
		label = (left.getText())+(right.getText());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

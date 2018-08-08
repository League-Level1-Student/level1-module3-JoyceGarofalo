import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JLabel label = new JLabel("answer");
	JTextField left = new JTextField("num1");
	JTextField right = new JTextField("num2");

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.CreateUI();
	}

	public void CreateUI() {
		frame.setSize(400, 400);
		frame.add(panel);
		panel.add(left);
		panel.add(right);
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
		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");
		frame.pack();
	}

	public void add() {
		double l = Integer.parseInt(left.getText());
		double r = Integer.parseInt(right.getText());
		label.setText("" + (l + r));
	}

	public void sub() {
		double l = Integer.parseInt(left.getText());
		double r = Integer.parseInt(right.getText());
		label.setText("" + (l - r));
	}

	public void mul() {
		double l = Integer.parseInt(left.getText());
		double r = Integer.parseInt(right.getText());
		label.setText("" + (l * r));
	}

	public void div() {
		double l = Integer.parseInt(left.getText());
		double r = Integer.parseInt(right.getText());
		label.setText("" + (l / r));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			add();
		}
		if (e.getSource().equals(sub)) {
			sub();
		}
		if (e.getSource().equals(mul)) {
			mul();
		}
		if (e.getSource().equals(div)) {
			div();
		}
	}
}

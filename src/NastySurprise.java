import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	public void CreateUI() {
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		trick.setText("Trick");
		treat.setText("Treat");
		panel.setVisible(true);
		trick.setVisible(true);
		trick.addActionListener(this);
		treat.addActionListener(this);
	
	}
	public static void main(String[] args) {
		 NastySurprise surprise = new NastySurprise();
		 surprise.CreateUI();
			}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		if(button.equals(treat)) {
			showPictureFromTheInternet("https://i.ytimg.com/vi/V08WRasGLG8/hqdefault.jpg");
		}
		else {
			showPictureFromTheInternet("https://s.abcnews.com/images/Lifestyle/puppy-ht-3-er-170907_4x3_992.jpg");
		}
		
	}
	
}

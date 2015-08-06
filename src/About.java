import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class About extends JPanel
{
	JLabel label1 = new JLabel("This software is created by Mahmudul Hasan Shauqi and Sharif"
			+ " Khan KUET CSE 2k13",new ImageIcon(getClass().getResource("Shauqi.jpg")),10);
	JTextArea txt = new JTextArea();
	private Image image;
	public About() {
		// TODO Auto-generated constructor stub
		super();
		setLayout(new BorderLayout());
		add(label1,BorderLayout.NORTH);
		label1.setForeground(Color.RED);
		this.image = new ImageIcon(getClass().getResource("background.jpg")).getImage();
	}
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(null), image.getHeight(null), null);
    }

}

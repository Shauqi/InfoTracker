import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel3 extends JPanel
{
	JButton Bollywood = new JButton("Bollywood News",new ImageIcon("bollywood.png"));
	JButton top10Movie = new JButton("Hollywood Top 10",new ImageIcon("TopMovie.png"));
	JButton Hollywood = new JButton("Hollywood",new ImageIcon("Movie.png"));
	JButton about = new JButton("About Us",new ImageIcon("About.png"));
	public Panel3() 
	{
		setLayout(new GridLayout(2,2));
		Bollywood.setBackground(Color.WHITE);
		top10Movie.setBackground(Color.WHITE);
		Hollywood.setBackground(Color.WHITE);
		about.setBackground(Color.WHITE);
		add(Bollywood);
		add(top10Movie);
		add(Hollywood);
		add(about);
	}
}

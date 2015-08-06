import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel3 extends JPanel
{
	JButton Bollywood;
	JButton top10Movie;
	JButton Hollywood;
	JButton about;
	public Panel3(ImageIcon a,ImageIcon b,ImageIcon c,ImageIcon d) 
	{
		super();
		Bollywood = new JButton("Bollywood News",a);
		top10Movie = new JButton("Hollywood Top 10",b);
		Hollywood = new JButton("Hollywood",c);
		about = new JButton("About Us",d);
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

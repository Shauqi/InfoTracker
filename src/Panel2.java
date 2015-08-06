import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel2 extends JPanel
{
	JButton bdnews;
	JButton technews;
	JButton entrepreneur;
	JButton science;
	JButton sports;
	JButton about;
	public Panel2(ImageIcon a,ImageIcon b,ImageIcon c,ImageIcon d,ImageIcon e,ImageIcon f) 
	{
		super();
		bdnews = new JButton("BD News",a);
		technews = new JButton("Technology",b);
		entrepreneur = new JButton("Entrepreneur",c);
		science = new JButton("Science",d);
		sports = new JButton("Sports",e);
		about = new JButton("About us",f);
		bdnews.setBackground(Color.WHITE);
		technews.setBackground(Color.WHITE);
		entrepreneur.setBackground(Color.WHITE);
		science.setBackground(Color.WHITE);
		sports.setBackground(Color.WHITE);
		about.setBackground(Color.WHITE);
		setLayout(new GridLayout(2,2));
		add(bdnews);
		add(technews);
		add(entrepreneur);
		add(science);
		add(sports);
		add(about);
	}
}

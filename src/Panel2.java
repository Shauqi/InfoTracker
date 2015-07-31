import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel2 extends JPanel
{
	JButton bdnews = new JButton("BD News",new ImageIcon("bdnews.png"));
	JButton technews = new JButton("Technology",new ImageIcon("TechNews.png"));
	JButton entrepreneur = new JButton("Entrepreneur",new ImageIcon("Entrepreneur.jpg"));
	JButton science = new JButton("Science",new ImageIcon("science.jpg"));
	JButton sports = new JButton("Sports",new ImageIcon("sports.png"));
	JButton about = new JButton("About us",new ImageIcon("About.png"));
	public Panel2() 
	{
		super();
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

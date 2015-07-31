import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class panel1 extends JPanel
{
	JButton news;
	JButton entertainment;
	JButton footballTransfer;
	JButton headlines;
	JButton islamicReviews;
	JButton about;
	panel1()
	{
		super();
		setLayout(new GridLayout(2,2));
		news=new JButton("News",new ImageIcon("News.png"));
		entertainment = new JButton("Entertainment",new ImageIcon("Entertainment.png"));
		footballTransfer = new JButton("Football Transfer Rumours",new ImageIcon("FootballTransfers.png"));
		headlines = new JButton("News Headlines",new ImageIcon("headlines.png"));
		islamicReviews = new JButton("Islamic reviews",new ImageIcon("islamic.jpg"));
		about = new JButton("About Us",new ImageIcon("About.png"));
		news.setBackground(Color.WHITE);
		entertainment.setBackground(Color.WHITE);
		footballTransfer.setBackground(Color.WHITE);
		headlines.setBackground(Color.WHITE);
		islamicReviews.setBackground(Color.WHITE);
		about.setBackground(Color.WHITE);
		add(headlines);
		add(news);
		add(entertainment);
		add(footballTransfer);
		add(islamicReviews);
		add(about);
	}
}

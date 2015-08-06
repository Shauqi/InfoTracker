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
	panel1(ImageIcon a,ImageIcon b,ImageIcon c,ImageIcon d,ImageIcon e,ImageIcon f)
	{
		super();
		setLayout(new GridLayout(2,2));
		news=new JButton("News",a);
		entertainment = new JButton("Entertainment",b);
		footballTransfer = new JButton("Football Transfer Rumours",c);
		headlines = new JButton("News Headlines",d);
		islamicReviews = new JButton("Islamic reviews",e);
		about = new JButton("About Us",f);
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

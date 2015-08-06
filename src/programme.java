import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.ImageGraphicAttribute;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;


public class programme extends JFrame
{
	MovieClass movie;
	BangladeshiNews bnews;
	BollywoodNews bonews;
	Enterpreuner enterpreuner;
	HollywoodCelebrityNews hollywoodCelebrityNews;
	IslamicViews islamicViews;
	NewsHeadLines newsHeadLines;
	ScienceNews scienceNews;
	SportsNewsClass sportsNewsClass;
	TechNews techNews;
	FootballTransfer footballTransfer;
	panel1 p1;
	Panel2 p2;
	Panel3 p3;
	About about;
	ImageIcon news = new ImageIcon(getClass().getResource("News.png"));
	ImageIcon entertainment = new ImageIcon(getClass().getResource("Entertainment.png"));
	ImageIcon footballTran=new ImageIcon(getClass().getResource("FootballTransfers.png"));
	ImageIcon headlines=new ImageIcon(getClass().getResource("headlines.png"));
	ImageIcon islam=new ImageIcon(getClass().getResource("Islamic.jpg"));
	ImageIcon bdnews=new ImageIcon(getClass().getResource("bdnews.png"));
	ImageIcon technews=new ImageIcon(getClass().getResource("TechNews.png"));
	ImageIcon entrep=new ImageIcon(getClass().getResource("Entrepreneur.jpg"));
	ImageIcon science=new ImageIcon(getClass().getResource("science.jpg"));
	ImageIcon sports=new ImageIcon(getClass().getResource("sports.png"));
	ImageIcon abou=new ImageIcon(getClass().getResource("About.png"));
	ImageIcon bolly=new ImageIcon(getClass().getResource("bollywood.png"));
	ImageIcon top=new ImageIcon(getClass().getResource("TopMovie.png"));
	ImageIcon holly=new ImageIcon(getClass().getResource("Movie.png"));
	
	CardLayout cardLayout = new CardLayout();
	JMenuBar menuBar = new JMenuBar();
	String parent = null;
	public programme() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
	{
		super("InfoTracker");
		setLayout(cardLayout);
		setJMenuBar(menuBar);
		String className = getLookAndFeelClassName("Nimbus");
		UIManager.setLookAndFeel(className);
		JButton Home = new JButton("Home",new ImageIcon(getClass().getResource("HomeButton.png")));
		JButton Exit = new JButton("Exit",new ImageIcon(getClass().getResource("Exit.png")));
		JButton Back = new JButton("Back",new ImageIcon(getClass().getResource("Back.png")));
		Home.setBackground(Color.WHITE);
		Exit.setBackground(Color.WHITE);
		Back.setBackground(Color.WHITE);
		menuBar.add(Home);
		menuBar.add(Back);
		menuBar.add(Exit);
		movie = new MovieClass();
		bnews = new BangladeshiNews();
		bonews = new BollywoodNews();
		enterpreuner = new Enterpreuner();
		hollywoodCelebrityNews = new HollywoodCelebrityNews();
		islamicViews = new IslamicViews();
		newsHeadLines = new NewsHeadLines();
		scienceNews = new ScienceNews();
		sportsNewsClass = new SportsNewsClass();
		techNews = new TechNews();
		footballTransfer = new FootballTransfer();
		p1 = new panel1(news,entertainment,footballTran,headlines,islam,abou);
		p2 = new Panel2(bdnews,technews,entrep,science,sports,abou);
		p3 = new Panel3(bolly,top,holly,abou);
		about = new About();
		add(p1,"panel1");
		add(p2,"panel2");
		add(p3,"panel3");
		add(movie,"movie");
		add(bnews,"BanNews");
		add(enterpreuner,"Entrepreneur");
		add(hollywoodCelebrityNews,"hollywood");
		add(islamicViews,"IslamicViews");
		add(newsHeadLines,"newsHeadlines");
		add(scienceNews,"scienceNews");
		add(sportsNewsClass,"sportsNews");
		add(techNews,"TechNews");
		add(footballTransfer,"FootballTransfer");
		add(bonews,"Bollywood");
		add(about,"About");
		Home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "panel1");
			}
		});
		Exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		Back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(parent=="panel1")
				{
					cardLayout.show(getContentPane(), "panel1");
					parent=null;
				}
				else if(parent=="panel2")
				{
					cardLayout.show(getContentPane(), "panel2");
					parent="panel1";
				}
				else if(parent=="panel3")
				{
					cardLayout.show(getContentPane(), "panel3");
					parent="panel1";
				}
			}
		});
		p1.news.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				cardLayout.show(getContentPane(), "panel2");
				parent = "panel1";
			}
		});
		p1.entertainment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "panel3");
				parent = "panel1";
			}
		});
		p1.headlines.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "newsHeadlines");
				parent="panel1";
			}
		});
		p1.footballTransfer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "FootballTransfer");
				parent="panel1";
			}
		});
		p1.islamicReviews.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "IslamicViews");
				parent="panel1";
			}
		});
		p1.about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "About");
				parent="panel1";
			}
		});
		p2.bdnews.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "BanNews");
				parent="panel2";
			}
		});
		p2.entrepreneur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "Entrepreneur");
				parent="panel2";
			}
		});
		p2.science.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "scienceNews");
				parent="panel2";
			}
		});
		p2.sports.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "sportsNews");
				parent="panel2";
			}
		});
		p2.technews.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "TechNews");
				parent="panel2";
			}
		});
		p2.about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "About");
				parent="panel2";
			}
		});
		p3.Bollywood.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "Bollywood");
				parent="panel3";
			}
		});
		p3.Hollywood.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "hollywood");
				parent="panel3";
			}
		});
		p3.top10Movie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "movie");
				parent="panel3";
			}
		});
		p3.about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(getContentPane(), "About");
				parent="panel3";
			}
		});
	}
	public static String getLookAndFeelClassName(String nameSnippet) {
	    LookAndFeelInfo[] plafs = UIManager.getInstalledLookAndFeels();
	    for (LookAndFeelInfo info : plafs) {
	        if (info.getName().contains(nameSnippet)) {
	            return info.getClassName();
	        }
	    }
	    return null;
	}
}

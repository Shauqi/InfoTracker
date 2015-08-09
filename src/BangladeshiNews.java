import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class BangladeshiNews extends JPanel
{
    MovieFeedParser parser = new MovieFeedParser("http://www.thedailystar.net/top-news/rss.xml");
	JLabel label = new JLabel("<html><span style='font-size:20px'>Click here to see the full news</span><html>");
	MovieFeed feed = parser.readFeed();
	
	String data="";
	
	JTextArea t;
	BorderLayout f = new BorderLayout();
	JScrollPane scroll;
	public BangladeshiNews()
	{
	super();
	for(MovieFeedMessage message : feed.getMessages())
	{
		data+="Title:"+message+"\n\n";
	}
	label.setForeground(Color.BLUE);
	setLayout(f);
	setBorder(new TitledBorder(new EtchedBorder(),"Bangla News"));
	t =new JTextArea(data);
	t.setEditable(false);
	t.setForeground(Color.DARK_GRAY);
	t.setFont(new Font("Serif", Font.BOLD, 15));
	scroll = new JScrollPane(t);
	scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	add(scroll,f.CENTER);
	add(label,f.NORTH);
	label.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e)
		{
			if(Desktop.isDesktopSupported())
			{
			  try {
				Desktop.getDesktop().browse(new URL("http://www.thedailystar.net/").toURI());
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
	});
	
	}
}

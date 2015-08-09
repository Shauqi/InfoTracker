import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class BollywoodNews extends JPanel
{
    MovieFeedParser parser = new MovieFeedParser("http://www.nowrunning.com/cgi-bin/rss/main_hindi.xml");
	
	MovieFeed feed = parser.readFeed();
	JLabel label = new JLabel("<html><span style='font-size:20px'>Click on here to see the full news.</span><html>");
	String data = "";
	JTextArea t;
	BorderLayout f = new BorderLayout();
	JScrollPane scroll;
	public BollywoodNews()
	{
	super();
	for(MovieFeedMessage message : feed.getMessages())
	{
		data+="Title:"+message+"\n\n";
	}
	label.setForeground(Color.BLUE);
	setLayout(f);
	setBorder(new TitledBorder(new EtchedBorder(),"Bollywood News"));
	t =new JTextArea(data);
	t.setForeground(Color.DARK_GRAY);
	t.setFont(new Font("Serif", Font.BOLD, 15));
	t.setEditable(false);
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
				Desktop.getDesktop().browse(new URL("http://www.nowrunning.com/bollywoodevents/").toURI());
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
	});
	
	}
}

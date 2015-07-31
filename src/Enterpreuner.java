import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class Enterpreuner extends JPanel 
{
    RSSFeedParser parser = new RSSFeedParser("http://www.forbes.com/entrepreneurs/feed/");
	
	Feed feed = parser.readFeed();
	String data = "";
	JTextArea t;
	BorderLayout f = new BorderLayout();
	JScrollPane scroll;
	public Enterpreuner()
	{
	super();
	for(FeedMessage message : feed.getMessages())
	{
		data+=message+"\n";
	}
	setLayout(f);
	setBorder(new TitledBorder(new EtchedBorder(),"Entrepreneur News"));
	t =new JTextArea(data);
	t.setEditable(false);
	scroll = new JScrollPane(t);
	scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	add(scroll);
	t.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e)
		{
			if(Desktop.isDesktopSupported())
			{
			  try {
				Desktop.getDesktop().browse(new URL("http://www.forbes.com/entrepreneurs/").toURI());
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
	});
	
	}

}
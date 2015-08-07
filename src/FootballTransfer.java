import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
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


public class FootballTransfer extends JPanel
{
	MovieFeedParser parser = new MovieFeedParser("http://talksport.com/rss/sports-news/transfer-rumours/feed");
	
	MovieFeed feed = parser.readFeed();
	String data = "";
	JTextArea t;
	JLabel label = new JLabel("Click here to see the full news.");
	BorderLayout f = new BorderLayout();
	JScrollPane scroll;
	public FootballTransfer()
	{
	super();
	for(MovieFeedMessage message : feed.getMessages())
	{
		data+="Title:"+message+"\n\n";
	}
	setLayout(f);
	setBorder(new TitledBorder(new EtchedBorder(),"Football Transfer Rumours"));
	t =new JTextArea(data);
	t.setEditable(false);
	label.setForeground(Color.BLUE);
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
				Desktop.getDesktop().browse(new URL("http://talksport.com/football/transfer-rumours").toURI());
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
	});
	}
}

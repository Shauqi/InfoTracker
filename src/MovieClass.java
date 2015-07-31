import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class MovieClass extends JPanel
{
	String data = "";
    
	MovieFeedParser parser = new MovieFeedParser("http://www.fandango.com/rss/top10boxoffice.rss");
	
	MovieFeed movieFeed = parser.readFeed();
	JTextArea t;
	public MovieClass()
	{
	super();
	setLayout(new BorderLayout());
	int cnt=0;
	for(MovieFeedMessage message : movieFeed.getMessages())
	{
		if(cnt>0&&cnt<10)
		data+=message+"\n";
		cnt++;
	}
	setBorder(new TitledBorder(new EtchedBorder(),"Top 10 Movies"));
	t =new JTextArea(data);
	t.setEditable(false);
	add(t);
	t.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e)
		{
			if(Desktop.isDesktopSupported())
			{
			  try {
				Desktop.getDesktop().browse(new URL("http://www.fandango.com/boxoffice").toURI());
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
	});
	}
}

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
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class Songs extends JPanel
{
	String data = "";
    JLabel label = new JLabel("<html><span style='font-size:20px'>Click here to see the full news.</span><html>");
	MovieFeedParser parser = new MovieFeedParser("http://www.rollingstone.com/music/songreviews.rss");
	
	MovieFeed movieFeed = parser.readFeed();
	JTextArea t;
	public Songs()
	{
	super();
	label.setForeground(Color.BLUE);
	setLayout(new BorderLayout());
	int cnt=0;
	for(MovieFeedMessage message : movieFeed.getMessages())
	{
		if(cnt>0&&cnt<10)
		data+="Title:"+message+"\n\n";
		cnt++;
	}
	setBorder(new TitledBorder(new EtchedBorder(),"Songs Reviews"));
	t =new JTextArea(data);
	t.setEditable(false);
	t.setForeground(Color.DARK_GRAY);
	t.setFont(new Font("Serif", Font.BOLD, 15));
	label.setBackground(Color.WHITE);
	add(t,BorderLayout.CENTER);
	add(label,BorderLayout.NORTH);
	label.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e)
		{
			if(Desktop.isDesktopSupported())
			{
			  try {
				Desktop.getDesktop().browse(new URL("http://www.rollingstone.com/music/songreviews").toURI());
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
	});
	}
}

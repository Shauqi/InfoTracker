import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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


public class NewsHeadLines extends JPanel
{
    public NewsHeadLines()
    {
		// TODO Auto-generated constructor stub
    	super();
    	setLayout(new GridLayout());
    	forbesNews forb = new forbesNews();
    	SkyNews skyNews = new SkyNews();
    	ABCNews abcNews = new ABCNews();
    	Aljazeera aljazeera = new Aljazeera();
    	setBorder(new TitledBorder(new EtchedBorder(),"NewsHeadlines"));
    	add(forb);
    	add(skyNews);
    	add(abcNews);
    	add(aljazeera);
	}
}

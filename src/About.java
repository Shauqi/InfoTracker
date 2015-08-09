import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class About extends JPanel
{
	JLabel shauqi = new JLabel(new ImageIcon(getClass().getResource("Shauqi.jpg")));
	JLabel str = new JLabel("<html><span style='font-size:20px'>      This software is created by<br>Mahmudul Hasan Shauqi and Sharif</span><html>"
			+ "<html><span style='font-size:20px'> Khan KUET CSE 2k13</span><html>");
	JLabel Sharif = new JLabel(new ImageIcon(getClass().getResource("Sharif.jpg")));
	JLabel strSharif = new JLabel("<html><span style='font-size:20px'>        Click here to view profile of Sharif Khan</span><html>");
	JLabel strShauqi = new JLabel("<html><span style='font-size:20px'>        Click here to view profile of Mahmudul Hasan Shauqi</span><html>");
	JLabel n = new JLabel(""); 
	private Image image;
	public About() {
		// TODO Auto-generated constructor stub
		super();
		setLayout(new GridLayout(2,2));
		add(shauqi);
		add(n);
		add(Sharif);
		add(strShauqi);
		add(str);
		add(strSharif);
		str.setForeground(Color.RED);
		strSharif.setForeground(Color.BLUE);
		strShauqi.setForeground(Color.BLUE);
		this.image = new ImageIcon(getClass().getResource("background.jpg")).getImage();
		strSharif.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				if(Desktop.isDesktopSupported())
				{
				  try {
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/profile.php?id=100003899018767&fref=ts").toURI());
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
		});
		strShauqi.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				if(Desktop.isDesktopSupported())
				{
				  try {
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/SymbioShauqi?fref=ts").toURI());
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
		});
	}
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(null), image.getHeight(null), null);
    }

}

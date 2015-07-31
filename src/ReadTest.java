import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

public class ReadTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException 
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width =(int) screenSize.getWidth();
		int height =(int) screenSize.getHeight();
		programme p = new programme();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(width, height);
		p.setVisible(true);
	}

}

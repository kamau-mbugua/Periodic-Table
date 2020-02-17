

import java.awt.*;
import javax.swing.*;

public class SplashScreen extends JWindow {
  private int duration;
  public SplashScreen(int d) {
    duration = d;
  }

  
  public void showSplash() {
    JPanel content = (JPanel)getContentPane();
    content.setBackground(Color.white);

   
    int width = 650;
    int hieght =170;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	//to make the splasscreen position in the middle
    int x = (screen.width-width)/2;
    int y = (screen.height-hieght)/2;
    setBounds(x,y,width,hieght);

    //to display the image
    JLabel label = new JLabel(new ImageIcon("picture/MyFunStudio.com-The-Modern-Periodic-Table.png"));
    content.add(label, BorderLayout.CENTER);
	
	//gives color to the border
    Color warna = new Color(110, 200, 10,  200);
    content.setBorder(BorderFactory.createLineBorder(warna, 5));

    
    setVisible(true);

   
    try { Thread.sleep(duration); } catch (Exception e) {}

    setVisible(false);
  }

  public void showSplashAndExit() {
    showSplash();
  
  }

}

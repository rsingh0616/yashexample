import javax.swing.*;
import java.awt.*;
//My name is yash, hello everyone

public class MyImage
{
   public static void main(String[] args)
   {
      ImageFrame frame = new ImageFrame();
      frame.setDefaultLookAndFeelDecorated(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    } // end main
}

class ImageFrame extends JFrame  
{

   JPanel mainPanel = new JPanel();
   JLabel picLabel = new JLabel();
   JTextArea greetings = new JTextArea("Hello, my name is Ripunjay Singh");
   ImageIcon me = new ImageIcon("open.jpg");
   public ImageFrame()
   {
      super ();
      setSize (400, 300);
      setTitle("Introduce Myself");
      getContentPane().add(mainPanel, BorderLayout.CENTER);
      getContentPane().add(greetings, BorderLayout.SOUTH);
      picLabel.setIcon(me);
      mainPanel.add(picLabel);
    }
}
// Ripunjay Singh  

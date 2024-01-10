
package university.management.system;


import java.awt.Image;
import javax.swing.*;


public class Splash extends JFrame implements Runnable 
{
    
       Thread t;
      Splash ()
      {  // add image in the frame
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
         add(image);
         
         
         t = new Thread(this);
        t.start();
        //to visible the frame
        setVisible(true);
        // to random change the size and location of frame
        int x = 1;
        for (int i = 2; i <= 600; i+=4, x+=1) 
        {
            setLocation(600 - ((i + x)/2), 350 - (i/2));
            setSize(i + 3*x, i + x/2);
            
            try {
                
                Thread.sleep(10);
            } catch (Exception e) {}
        } 
    }  
       
        public void run() 
        {
        try {
            // to sleep the splash in 7 seconds
            Thread.sleep(7000);
            setVisible(false);
            
            // Next Frame
            // to open login after 7 seconds
            // call login 
            new Login();
        } catch (Exception e) {
            
        }
        }
                
    public static void main(String[] args)
    
    {
        new Splash();
    }
}
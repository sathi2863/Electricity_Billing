package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {
    splash(){


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash/splash.jpg.png"));
        Image imageOne = imageIcon.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(imageOne);
        JLabel imageLavel = new JLabel(imageIcon2);
        add(imageLavel);



       setSize(600,400);
       setLocation(500,200);
       setVisible(true);

       try{
          Thread.sleep(3000);
          setVisible(false);

          new Login();

       }catch(Exception e){
           e.printStackTrace();

       }



    }

    public static void main(String[] args) {
        new splash();

    }
}

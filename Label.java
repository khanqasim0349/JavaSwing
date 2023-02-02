package Swing;
import java.awt.Color;
import java.net.InetAddress;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Label {
    public static void main(String[] args) {
            JLabel label=new JLabel();
            label.setText("This is label");
            label.setBackground(Color.green);
            label.setOpaque(true);
            label.setBounds(50,50,400,250);
            
            
            JFrame frame=new JFrame();
            frame.setSize(400,400);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Color change
            frame.getContentPane().setBackground(Color.green);
            //title change
            frame.setTitle("My frame");


         
        
    }
}

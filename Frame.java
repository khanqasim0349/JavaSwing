package Swing;
import java.awt.Color;
import javax.swing.JFrame;
public class Frame {
    public static void main(String[] args) {
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

package Swing;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JFrame;
public class Panel {
    public static void main(String[] args) {
        JPanel grenPanel=new JPanel();
        grenPanel.setBackground(Color.red);
        grenPanel.setBounds(0,0,100,100);

        //Another panel
        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        grenPanel.setBounds(150,150,200,200);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("My frame");
        // frame.add(grenPanel);
        frame.add(bluePanel);
    }
}

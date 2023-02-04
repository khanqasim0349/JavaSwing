package Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
public class Blayout extends JFrame {
    //Borderlayout

    Blayout()
    {
        //Panels
        JPanel redJPanel=new JPanel();
        JPanel bluePanel=new JPanel();
        JPanel blackPanel=new JPanel();
        JPanel yellowPanel=new JPanel();
        JPanel greenPanel=new JPanel();
        
        ///Colors
        redJPanel.setBackground(Color.red);
        bluePanel.setBackground(Color.blue);
        blackPanel.setBackground(Color.black);
        yellowPanel.setBackground(Color.yellow);
        greenPanel.setBackground(Color.green);

        //size
        redJPanel.setPreferredSize(new Dimension(100,100));
        bluePanel.setPreferredSize(new Dimension(100,100));
        blackPanel.setPreferredSize(new Dimension(100,100));
        yellowPanel.setPreferredSize(new Dimension(100,100));
        greenPanel.setPreferredSize(new Dimension(100,100));
        // redJPanel.setPreferredSize(new Dimension(100,100));


        //Frame 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(new BorderLayout());
        this.add(redJPanel,BorderLayout.NORTH);
        this.add(bluePanel,BorderLayout.SOUTH);
        this.add(yellowPanel,BorderLayout.WEST);
        this.add(greenPanel,BorderLayout.CENTER);
        this.add(blackPanel,BorderLayout.EAST);
        

    }


    
}

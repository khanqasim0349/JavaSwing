package Swing;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class buttons extends JFrame implements ActionListener{
    JButton button; 
    JPanel panel;
    buttons()
    {
        //Panel
        panel=new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(200,200,100,100);
        panel.setVisible(false);

        button=new JButton("Button");
        button.setBounds(50,50,100,50);
        button.setFocusable(false);
        button.addActionListener(this);


        //Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(panel);
    }
   @Override
   public void actionPerformed(ActionEvent e) {
       if (e.getSource()==button) {
        System.out.println("hello button");
        panel.setVisible(true);
        dispose();
       }
   }
}

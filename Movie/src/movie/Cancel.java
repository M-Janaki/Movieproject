
package movie;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cancel extends JFrame {
     JPanel top=new JPanel();
      JPanel bottom=new JPanel();
      JLabel l=new JLabel();
    JLabel v=new JLabel();
    JLabel bgimg=new JLabel();
    
    
     public void run(){
         setVisible(true);
        setSize(1368,750);
        
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Top Panel
        top.setBackground(new Color(55, 0, 102));
       //top.setLayout(null);
       add(top);
        top.setBounds(270,100,900,70);
        top.setBorder(BorderFactory.createLineBorder(Color.PINK));
        
        //Bottom Panel
        bottom.setBackground(new Color(175,119,158));
       // bottom.setLayout(null);
       add(bottom);
        bottom.setBounds(430,300,500,70);
         bottom.setBorder(BorderFactory.createLineBorder(Color.yellow));
        
        //label1
        l.setText("YOUR BOOKING IS CANCELLD");
        l.setFont(new Font("Bell MT",1,48));
        //l.setLayout(null);
       l.setForeground(new Color(255,250,0));
        top.add(l);
        
        //label2
        v.setText("PLEASE VISIT AGAIN");
        v.setFont(new Font("Algerian",1,38));
       v.setForeground(new Color(204, 153, 255));
        bottom.add(v);
       // v.setBounds(280,300,200,20);
         //Background
          bgimg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\java\\Movie\\img\\34.jpg"));
        
        add(bgimg);
        bgimg.setBounds(0,0,1360,750);
                
}
}

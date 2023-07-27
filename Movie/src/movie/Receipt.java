
package movie;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Receipt  extends JFrame{
    JPanel top=new JPanel();
    JPanel bottom=new JPanel();
    JLabel title=new JLabel();
    JLabel last=new JLabel();
    JLabel movie=new JLabel();
    JLabel theater=new JLabel();
    JLabel date=new JLabel();
    JLabel time=new JLabel();
    JLabel t=new JLabel();
     JLabel fare=new JLabel();
      JLabel t1=new JLabel();
       JLabel t2=new JLabel();
        JLabel t3=new JLabel();
         JLabel t4=new JLabel();
          JLabel t5=new JLabel();
           JLabel t6=new JLabel();
    
    JButton b1=new JButton();
    JButton b2=new JButton();
    JLabel bgimg=new JLabel();
    JLabel au=new JLabel();
      String a;String b;String sh;String d;String f;
            int N1;
  public Receipt(String p1,String p2,String p3,String p4,int p5,String p6){
    
    this.a=p1;
    this.b=p2;
    this.d=p3;
    this.sh=p4;
    this.f=p6;
    this.N1=p5;
    t1.setText(p1);
    t2.setText(p2);
    t3.setText(p6);
   t4.setText(p3);
   t6.setText(String.valueOf(p5));
 t5.setText(p4);
 run();
    }

    Receipt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


   
    public void run(){
         setVisible(true);
        setSize(1368,750);
        
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Top Panel
        top.setBackground(new Color(0,0,0,1));
       add(top);
        top.setBounds(270,30,800,70);
        
        //title
        title.setText("RECEIPT");
        title.setFont(new Font("Bell MT",1,48));
        title.setForeground(new Color(255,255,0));
        top.add(title);
        //label1
        movie.setBounds(300,180,300,30);
        movie.setText(" MOVIE");
        movie.setFont(new Font("Calisto MT",3,28));
        movie.setForeground(new Color(15,0,0));
        add(movie);
        
         //label2
        theater.setBounds(300,260,300,30);
        theater.setText(" THEATER");
        theater.setFont(new Font("Calisto MT",3,28));
        theater.setForeground(new Color(15,0,0));
        add(theater);
         //label3
        date.setBounds(300,320,300,30);
        date.setText(" DATE");
        date.setFont(new Font("Calisto MT",3,28));
        date.setForeground(new Color(15,0,0));
        add(date);
         //label4
        time.setBounds(300,400,300,30);
        time.setText(" TIME");
        time.setFont(new Font("Calisto MT",3,28));
        time.setForeground(new Color(15,0,0));
        add(time);
         //label5
        t.setBounds(300,460,400,30);
        t.setText("NUMBER OF TICKETS");
        t.setFont(new Font("Calisto MT",3,28));
        t.setForeground(new Color(15,0,0));
        add(t);
         //label6
        fare.setBounds(300,530,400,30);
        fare.setText("FARE");
        fare.setFont(new Font("Calisto MT",3,28));
        fare.setForeground(new Color(15,0,0));
        add(fare);
        //text label
         t1.setBounds(700,180,300,30);
//         t1.setText("hello");
          t1.setFont(new Font("Calisto MT",3,28));
         t1.setBackground(new Color(15,0,0));
        add(t1);
         
          //text label2
         t2.setBounds(700,260,300,30);
//         t2.setText("hello");
          t2.setFont(new Font("Calisto MT",3,28));
         t2.setBackground(new Color(15,0,0));
        add(t2);
          //text labe3
         t3.setBounds(700,320,300,30);
//         t1.setText("hello");
          t3.setFont(new Font("Calisto MT",3,28));
         t3.setBackground(new Color(15,0,0));
        add(t3);
          //text labe4
         t4.setBounds(700,400,300,30);
//         t1.setText("hello");
          t4.setFont(new Font("Calisto MT",3,28));
         t4.setBackground(new Color(15,0,0));
        add(t4);
        //text label 5
        t5.setBounds(700,460,300,30);
//         t1.setText("hello");
          t5.setFont(new Font("Calisto MT",3,28));
         t5.setBackground(new Color(15,0,0));
        add(t5);
          //text label 6
        t6.setBounds(700,530,300,30);
//         t1.setText("hello");
          t6.setFont(new Font("Calisto MT",3,28));
         t6.setBackground(new Color(15,0,0));
        add(t6);
        //bottom
         bottom.setBackground(new Color(0,0,0,1));
       add(bottom);
        bottom.setBounds(190,580,800,70);
        
        // bottomtitle
        last.setText("THANKS FOR BOOKING");
        last.setFont(new Font("Bell MT",1,48));
        last.setForeground(new Color(128,255,0));
        bottom.add(last);
         //Background
          bgimg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\java\\Movie\\img\\41.jpg"));
        
        add(bgimg);
        bgimg.setBounds(0,0,1360,750);
}
}

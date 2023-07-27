
package movie;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class payment extends JFrame {
    JPanel p3=new JPanel();
    JPanel p4=new JPanel();
    JLabel h=new JLabel();
     JLabel h1=new JLabel();
      JLabel h2=new JLabel();
      JLabel h3=new JLabel();
       JLabel h4=new JLabel();
      JTextField t01=new JTextField();
       JTextField t02=new JTextField();
        JPasswordField tpa=new JPasswordField();
     JButton b1=new JButton();
     JLabel bgimg=new JLabel();
     JComboBox c1=new JComboBox();
      JComboBox c2=new JComboBox();
      
     JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JLabel head=new JLabel();
    JLabel head2=new JLabel();
    JLabel tic=new JLabel();
    JLabel mov=new JLabel();
    JLabel fare=new JLabel();
    JLabel the=new JLabel();
    JLabel date=new JLabel();
    JLabel time=new JLabel();
    JLabel t1=new JLabel();
    JLabel t2=new JLabel();
    JLabel t3=new JLabel();
    JLabel t4=new JLabel();
    JLabel t5=new JLabel();
    JLabel t6=new JLabel();
           
    
      String a;String b;String sh;String d;String f;
            int N1;
  public payment(String p1,String p2,String p3,String p4,int p5,String p6){
    
    this.a=p1;
    this.b=p2;
    this.d=p3;
    this.sh=p4;
    this.f=p6;
    this.N1=p5;
    t2.setText(p1);
    t4.setText(p2);
    t5.setText(p6);
   t1.setText(p3);
   t3.setText(String.valueOf(p5));
 t6.setText(p4);
 run();
    }

    payment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public void run(){
          setVisible(true);
        setSize(1368,750);
        
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          //Top Panel
        p1.setBackground(new Color(211,220,237));
       p1.setLayout(null);
       add(p1);
        p1.setBounds(100,20,1100,320);
        p1.setBorder(BorderFactory.createLineBorder(Color.RED));
        
//           //bottom Panel
//        p2.setBackground(new Color(255, 255,255));
//       p2.setLayout(null);
//       add(p2);
//        p2.setBounds(100,380,1100,300);
//        p2.setBorder(BorderFactory.createLineBorder(Color.RED));
//        
        //label1 heading
        head.setText("CONFIRM DETAILS");
        //l.setLayout(null);
       head.setForeground(new Color(128,0,64));
        p1.add(head);
        head.setBounds(350,10,300,30);
        head.setFont(new Font("Bell MT",1,28));
        //label ticket
    
        tic.setText("NO OF TICKETS");
        tic.setFont(new Font("Calisto MT",3,23));
        tic.setForeground(new Color(15,0,0));
        p1.add(tic);
         tic.setBounds(90,100,200,30);
        //label movie
     
        mov.setText("MOVIE");
        mov.setFont(new Font("Calisto MT",3,23));
        mov.setForeground(new Color(15,0,0));
        p1.add(mov);
        mov.setBounds(90,160,200,30);
        //label fare
    
        fare.setText("FARE");
        fare.setFont(new Font("Calisto MT",3,23));
        fare.setForeground(new Color(15,0,0));
        p1.add(fare);
         fare.setBounds(90,220,200,30);
         //label theater
    
        the.setText("THEATER");
        the.setFont(new Font("Calisto MT",3,23));
        the.setForeground(new Color(15,0,0));
        p1.add(the);
         the.setBounds(600,100,200,30);
         //label date
    
        date.setText("DATE");
        date.setFont(new Font("Calisto MT",3,23));
        date.setForeground(new Color(15,0,0));
        p1.add(date);
         date.setBounds(600,160,200,30);
         //label time
     
        time.setText("TIME");
        time.setFont(new Font("Calisto MT",3,23));
        time.setForeground(new Color(15,0,0));
        p1.add(time);
        time.setBounds(600,220,200,30);
         //label ticket d
    t1.setFont(new Font("Calisto MT",3,20));
        t1.setForeground(new Color(63,72,204));
        p1.add(t1);
         t1.setBounds(400,100,200,30);
          //label movie a
    t2.setFont(new Font("Calisto MT",3,20));
        t2.setForeground(new Color(63,72,204));
        p1.add(t2);
         t2.setBounds(400,160,200,30);
          //label fare N1
    t3.setFont(new Font("Calisto MT",3,20));
        t3.setForeground(new Color(63,72,204));
        p1.add(t3);
         t3.setBounds(400,220,200,30);
          //label theater b
        t4.setFont(new Font("Calisto MT",3,20));
        t4.setForeground(new Color(63,72,204));
        p1.add(t4);
         t4.setBounds(800,100,200,30);
          //label date f
        t5.setFont(new Font("Calisto MT",3,20));
        t5.setForeground(new Color(63,72,204));
        p1.add(t5);
         t5.setBounds(800,160,200,30);
          //label time sh
        t6.setFont(new Font("Calisto MT",3,20));
        t6.setForeground(new Color(63,72,204));
        p1.add(t6);
         t6.setBounds(800,220,200,30);
         
      
        
        
//        //Top Panel
//        p3.setBackground(new Color(183,202,204,0));
//       add(p1);
//        p3.setBounds(500,360,800,50);
        
        //title
        h.setText("CARD DETAILS");
        h.setFont(new Font("Bookman Old Style",1,20));
        h.setForeground(new Color(0,0,0));
        p4.add(h);
        h.setBounds(500,10,400,30);
        //panel
//         p2.setBackground(new Color(255, 255,255));
//       p2.setLayout(null);
//       add(p2);
//        p2.setBounds(100,380,1100,300);
//        p2.setBorder(BorderFactory.createLineBorder(Color.RED));
//        
         p4.setBackground(new Color(211,220,237));
         p4.setLayout(null);
       add(p4);
        p4.setBorder(BorderFactory.createLineBorder(Color.yellow));
        p4.setBounds(100,360,1100,320);
        //label
        h1.setText("Card number");
        p4.add(h1);
        h1.setBounds(200,50,200,30);
        h1.setFont(new Font("Bell MT", 1, 28));
        //text1
         p4.add(t01);
        t01.setBounds(201,100,400,30);
        t01.setFont(new Font("Bell MT", 1, 28));
         //label2
        h2.setText("Card holder name");
        p4.add(h2);
        h2.setBounds(200,150,400,30);
        h2.setFont(new Font("Bell MT", 1, 28));
        //text2
         p4.add(t02);
        t02.setBounds(201,200,400,30);
        t02.setFont(new Font("Bell MT", 1, 28));
         //label3
        h3.setText("CVV");
        p4.add(h3);
        h3.setBounds(190,270,100,30);
        h3.setFont(new Font("Bell MT", 1, 28));
        //password
          p4.add(tpa);
        tpa.setBounds(260,270,40,30);
        tpa.setFont(new Font("Bell MT", 1, 28));
         //label4
        h4.setText("EXP");
        p4.add(h4);
        h4.setBounds(340,270,100,30);
        h4.setFont(new Font("Bell MT", 1, 28));
        //combo1
         p4.add(c1);
        c1.setBounds(420,270,50,30);
        c1.setFont(new Font("Bell MT", 1, 18));
         for(int i=1;i<=12;i++){
             c1.addItem(i);
         }
         //combo2
          p4.add(c2);
        c2.setBounds(480,270,100,30);
        c2.setFont(new Font("Bell MT", 1, 18));
        c2.addItem(2023);
        c2.addItem(2024);
        c2.addItem(2025);
        c2.addItem(2026);
        c2.addItem(2027);
        //button
        b1.setText("Proceed");
         b1.setBounds(800,200,100,30);
        b1.setFont(new Font("Bell MT", 1, 18));
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //setVisible(false);
             setVisible(false);
                    new Receipt(a,b,d,sh,N1,f).setVisible(true); 
       
            }
            
        });
        p4.add(b1);
        //background
        bgimg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\java\\Movie\\img\\42.jpg"));

        add(bgimg);
        bgimg.setBounds(0, 0, 1360, 750);
      }
}

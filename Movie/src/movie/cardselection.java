
package movie;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class cardselection extends JFrame {
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
    JRadioButton r1=new JRadioButton();    
JRadioButton r2=new JRadioButton();    
JRadioButton r3=new JRadioButton();    
JRadioButton r4=new JRadioButton();
ButtonGroup bg=new ButtonGroup();
JButton b1=new JButton();
JButton b2=new JButton();
JLabel bgimg=new JLabel();
 String a;String b;String sh;String d;String f;
            int N1;
  public cardselection(String p1,String p2,String p3,String p4,int p5,String p6){
    
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

    cardselection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
      public void run(){
          bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);
         setVisible(true);
        setSize(1368,750);
        
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Top Panel
        p1.setBackground(new Color(255,255,255));
       p1.setLayout(null);
       add(p1);
        p1.setBounds(100,40,1100,320);
        p1.setBorder(BorderFactory.createLineBorder(Color.RED));
        
           //bottom Panel
        p2.setBackground(new Color(255, 255,255));
       p2.setLayout(null);
       add(p2);
        p2.setBounds(100,380,1100,300);
        p2.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        //label1 heading
        head.setText("CONFIRM DETAILS");
        //l.setLayout(null);
       head.setForeground(new Color(128,0,64));
        p1.add(head);
        head.setBounds(350,20,300,30);
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
         
        //label2 heading2
        head2.setText("PAYMENT TYPE");
        //l.setLayout(null);
       head2.setForeground(new Color(128,0,64));
        p2.add(head2);
        head2.setBounds(350,40,300,30);
        head2.setFont(new Font("Bell MT",1,28));
        //Radiobutton
        r1.setBounds(400,100,250,30);
        r1.setText("Credit card");
        p2.add(r1);
        
         r2.setBounds(400,140,250,30);
        r2.setText("Debit card");
        p2.add(r2);
        
         r3.setBounds(400,180,250,30);
        r3.setText("NET BANKING");
        p2.add(r3);
        
         r4.setBounds(400,220,250,30);
        r4.setText("PAYTM WALLET");
        p2.add(r4);
        //button
         
         b1.setText("Make Payment");
        b1.setFont(new Font("TIMES NEW ROMAN",1,18));
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    setVisible(false);      
                      new payment(a,b,d,sh,N1,f).setVisible(true);
            }
            
        });
        p2.add(b1);
         b1.setBounds(750,200,200,30);
          b1.setBackground(new Color(15,0,0));
           b1.setForeground(new Color(255,255,0));
           
             b2.setText("Go Back");
        b2.setFont(new Font("TIMES NEW ROMAN",1,18));
         b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //setVisible(false);
                     // new Book().setVisible(true);
                      new Book(a,b,sh,d,N1,f).setVisible(true); 
                  //new Book().setVisible(true); 
            }
            
        });
        p2.add(b2);
         b2.setBounds(750,250,200,30);
          b2.setBackground(new Color(15,0,0));
           b2.setForeground(new Color(255,255,0));
            //background
        bgimg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\java\\Movie\\img\\26.jpg"));

        add(bgimg);
        bgimg.setBounds(0, 0, 1360, 750);
      }  
}

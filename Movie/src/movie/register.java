
package movie;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class register extends JFrame{
    JPanel top=new JPanel();
    JLabel title=new JLabel();
    JLabel name=new JLabel();
    JLabel email=new JLabel();
    JLabel pass=new JLabel();
    JLabel phno=new JLabel();
    JTextField tna=new JTextField();
    JTextField tem=new JTextField();
    JTextField tph=new JTextField();
    JTextField tpa=new JTextField();
    JButton b1=new JButton();
    JLabel bgimg=new JLabel();
    JLabel au=new JLabel();
    
    public register(){
       run();
       connect();
   }  
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   public void connect(){
              String url,uname,pwd;
              try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  url="jdbc:mysql://localhost:3306/movie";
                  uname="Janaki";
                  pwd="1234";
                  con=DriverManager.getConnection(url,uname,pwd);
              }catch (Exception ex) {
                  System.out.println("Error"+ex);
              }
   } 
    public void run(){
         setVisible(true);
        setSize(1368,750);
        
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Top Panel
        top.setBackground(new Color(0,0,0,1));
       add(top);
        top.setBounds(270,20,800,70);
        
        //title
        title.setText("NEW REGISTER");
        title.setFont(new Font("Bell MT",1,48));
        title.setForeground(new Color(255,255,255));
        top.add(title);
        //label1
        name.setBounds(430,160,150,30);
        name.setText("NAME");
        name.setFont(new Font("Calisto MT",3,28));
        name.setForeground(new Color(0, 102, 255));
        add(name);
        
         //label2
        email.setBounds(430,260,200,30);
        email.setText("EMAIL ID");
        email.setFont(new Font("Calisto MT",3,28));
        email.setForeground(new Color(0, 102, 255));
        add(email);
         //label3
        phno.setBounds(400,360,250,30);
        phno.setText("PHONE NUMBER");
        phno.setFont(new Font("Calisto MT",3,28));
        phno.setForeground(new Color(0, 102, 255));
        add(phno);
         //label4
        pass.setBounds(400,460,200,30);
        pass.setText("PASSWORD");
        pass.setFont(new Font("Calisto MT",3,28));
        pass.setForeground(new Color(0, 102, 255));
        add(pass);
        //text1
         tna.setFont(new Font("TIMES NEW ROMAN",2,18));
        tna.setBounds(750,160,250,35);
        add(tna);
         //text2
         tem.setFont(new Font("TIMES NEW ROMAN",2,18));
        tem.setBounds(750,260,250,35);
        add(tem);
         //text3
         tph.setFont(new Font("TIMES NEW ROMAN",2,18));
        tph.setBounds(750,360,250,35);
        add(tph);
         //text4
         tpa.setFont(new Font("TIMES NEW ROMAN",2,18));
         tpa.setBounds(750,460,250,35);
        add(tpa);
        //Button
        
        b1.setText("SUBMIT"); 
          b1.addActionListener(new ActionListener(){                             
      
             @Override
             public void actionPerformed(ActionEvent e) {
       String a=tna.getText();
       String c=tem.getText();
       String d=tph.getText();
       String b=tpa.getText();
//       if("".equals(a) && "".equals(b) && "".equals(c) && "".equals(d))
//       {
//           JOptionPane.showMessageDialog(null,"please enter valid details");
//       }
//       else {
       try{
        String qry="insert into register(name,password,email,phno) values(?,?,?,?);";
        ps =con.prepareStatement(qry);
           ps.setString(1,a);
           ps.setString(2, b);
           ps.setString(3, c);
           ps.setString(4, d);
          System.out.println("success");
          ps.execute();
           setVisible(false);   new Home().setVisible(true);
        con.close();
          
       }
       catch(Exception ex)
       {
           System.out.println("Error"+ex);
       }
      // setVisible(false);   new Home().setVisible(true);
         
       }
           // }

       });
        add(b1); 
        b1.setFont(new Font("TIMES NEW ROMAN",1,18));
        b1.setBounds(600,570,180,45);
        b1.setBackground(new Color(19,22,29));
        b1.setForeground(new Color(0, 102, 255));
        //already user label
        au.setText("Already have an account ?");
        au.setForeground(Color.red);
        au.setCursor(new Cursor(Cursor.HAND_CURSOR));
        au.addMouseListener(new MouseAdapter(){
             @Override
             public void mouseClicked(MouseEvent e) {
                Home h=new Home();
              h.setVisible(true);
             }
            
        });
        add(au);
         au.setFont(new Font("TIMES NEW ROMAN",2,28));
        au.setBounds(550,630,350,45);
        
          
        //background
        bgimg.setSize(1360,750);
        bgimg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\java\\Movie\\img\\9.jpg"));
        add(bgimg);
    }
    
}

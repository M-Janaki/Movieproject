
package movie;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class Home extends JFrame {
    JPanel top=new JPanel();
    JLabel title=new JLabel();
    JLabel username=new JLabel();
    JLabel pass=new JLabel();
    JTextField tna=new JTextField();
     JPasswordField tpa=new JPasswordField();
     JButton login=new JButton();
     JButton reg=new JButton();
     JLabel bgimg=new JLabel();
   public Home(){
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
   

    public void run() {
        setVisible(true);
        setSize(1368,750);
        
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Top Panel
        top.setBackground(new Color(0,0,0,1));
       add(top);
        top.setBounds(300,0,800,70);
        
        //title
        title.setText("MOVIE TICKET BOOKING");
        title.setFont(new Font("Bell MT",1,48));
        title.setForeground(new Color(255,255,204));
        top.add(title);
        
//        //Background Image
//        bgimg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\java\\Movie\\img\\1.jpg"));
//        bgimg.setBounds(0,0,1360,750);
//        add(bgimg);
        //label 1
        username.setFont(new Font("TIMES NEW ROMAN",1,28));
        username.setText("USERNAME");
        username.setBounds(750,100,500,200);
        username.setForeground(new Color(255,0,0));
        add(username);
         //label 2
        pass.setFont(new Font("TIMES NEW ROMAN",1,28));
        pass.setText("PASSWORD");
        pass.setBounds(750,200,500,200);
        pass.setForeground(new Color(255,0,0));
        add(pass);
        //textfield 1
        tna.setFont(new Font("TIMES NEW ROMAN",2,18));
        tna.setBounds(950,180,250,35);
        add(tna);
         //textfield 2
        tpa.setFont(new Font("TIMES NEW ROMAN",2,18));
        tpa.setBounds(950,280,250,35);
        add(tpa);
        //button1
        login.setText("LOGIN");
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              try{
                  ps=con.prepareStatement("select*from register where name=? and password=?;");
                  ps.setString(1,tna.getText());
                  ps.setString(2, tpa.getText());
                  rs=ps.executeQuery();
                  if("".equals(tna.getText())&&"".equals(tpa.getText())){
                       JOptionPane.showMessageDialog(null,"please enter valid details");
                  }
                  else if(rs.next()){
//                      Home h=new Home();
//                      h.run();
                    // JOptionPane.showMessageDialog(null,"Success");
//                       setVisible(false);
                      Mdetail b=new Mdetail();
                      b.run();
                      //b.setVisible(true);
                     
                      
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"Username and password does not match");
                      tna.setText("");
                      tpa.setText("");
                      tna.requestFocus();
                  }
                  
              } catch (Exception ex) {
                  System.out.println("Error"+ex);
              }
            }
        });
        
        reg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //setVisible(false);
                 register a=new register();
        a.run();
            }
            
        });
   
            
        
        add(login);
        login.setFont(new Font("TIMES NEW ROMAN",1,18));
        login.setBounds(900,400,100,35);
        //button2
         reg.setText("NEW REGISTER");
        add(reg);
        reg.setFont(new Font("TIMES NEW ROMAN",1,18));
        reg.setBounds(1050,400,170,35);
        
       bgimg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\java\\Movie\\img\\13.jpg"));
        
        add(bgimg);
        bgimg.setBounds(0,0,1360,750);
    }
    
}

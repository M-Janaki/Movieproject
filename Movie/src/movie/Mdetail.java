package movie;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class Mdetail extends JFrame {

    JPanel top = new JPanel();
    JLabel title = new JLabel();
    JLabel movie = new JLabel();
    JLabel theater = new JLabel();
    JLabel date = new JLabel();
    JLabel time = new JLabel();
    JLabel t = new JLabel();
    JComboBox cmo = new JComboBox();
    JComboBox cth = new JComboBox();
    JComboBox cda = new JComboBox();
    JComboBox cti = new JComboBox();
    JTextField tic = new JTextField();
    JButton b1 = new JButton();
    JLabel bgimg = new JLabel();
    JLabel au = new JLabel();

    public Mdetail() {
        run();
        connect();
        ctheater();
        cshow();
    }
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Statement s;

    public void connect() {
        String url, uname, pwd;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/movie";
            uname = "Janaki";
            pwd = "1234";
            con = DriverManager.getConnection(url, uname, pwd);
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public void ctheater() {
        try {
            s = con.createStatement();
            String sql = "Select theater from table3";
            rs = s.executeQuery(sql);
            cth.removeAllItems();
            while (rs.next()) {
                cth.addItem(rs.getString("theater"));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void cshow() {
        try {
            s = con.createStatement();
            String sql = "Select * from table3";
            rs = s.executeQuery(sql);
            cti.removeAllItems();
            while (rs.next()) {
                cti.addItem(rs.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void run() {
        setVisible(true);
        setSize(1368, 750);

        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Top Panel
        top.setBackground(new Color(0, 0, 0, 1));
        add(top);
        top.setBounds(270, 30, 800, 70);

        //title
        title.setText("MOVIE  DETAILS");
        title.setFont(new Font("Bell MT", 1, 48));
        title.setForeground(new Color(255, 255, 0));
        top.add(title);
        //label1
        movie.setBounds(300, 180, 300, 30);
        movie.setText("SELECT MOVIE");
        movie.setFont(new Font("Calisto MT", 3, 28));
        movie.setForeground(new Color(15, 0, 0));
        add(movie);

        //label2
        theater.setBounds(300, 260, 300, 30);
        theater.setText("SELECT THEATER");
        theater.setFont(new Font("Calisto MT", 3, 28));
        theater.setForeground(new Color(15, 0, 0));
        add(theater);
        //label3
        date.setBounds(300, 320, 300, 30);
        date.setText("SELECT DATE");
        date.setFont(new Font("Calisto MT", 3, 28));
        date.setForeground(new Color(15, 0, 0));
        add(date);
        //label4
        time.setBounds(300, 400, 300, 30);
        time.setText("SELECT TIME");
        time.setFont(new Font("Calisto MT", 3, 28));
        time.setForeground(new Color(15, 0, 0));
        add(time);
        //label5
        t.setBounds(300, 460, 400, 30);
        t.setText("NUMBER OF TICKETS");
        t.setFont(new Font("Calisto MT", 3, 28));
        t.setForeground(new Color(15, 0, 0));
        add(t);
        //combo1
        cmo.setBounds(700, 180, 250, 30);
        cmo.addItem("Avengers");
        cmo.addItem("Spiderman");
        cmo.addItem("Mersal");
        cmo.addItem("Asvins");
        add(cmo);
        //combo2
        cth.setBounds(700, 260, 250, 30);
        add(cth);
        //combo3
        cda.setBounds(700, 320, 250, 30);
        cda.addItem("20-07-2002");
        cda.addItem("26-07-2002");
        cda.addItem("30-07-2002");
        cda.addItem("12-08-2002");
        cda.addItem("29-08-2002");
        add(cda);
        //combo4
        cti.setBounds(700, 400, 250, 30);
        add(cti);
        //text
        tic.setFont(new Font("TIMES NEW ROMAN", 2, 18));
        tic.setBounds(700, 460, 50, 35);
        add(tic);

        //Button
        b1.setText("SUBMIT");
        b1.setBackground(new Color(81, 70, 132));

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a = (String) cmo.getSelectedItem();
                String b = (String) cth.getSelectedItem();
                String sh = (String) cti.getSelectedItem();
                String f = (String) cda.getSelectedItem();
                String d = tic.getText();

                //if(!.equals(""))
                String N = tic.getText();
                int N1 = Integer.parseInt(N);
                int N2 = N1;
                N1 *= 100;
                //new Book(a,b,sh,d,N1,f).setVisible(true);
                if (N2 < 10 && N2 > 0) {
                    setVisible(false);
                    new Book(a,b,sh,d,N1,f).setVisible(true); 
                    try {
                        s = con.createStatement();
                       String th =  cth.getSelectedItem().toString();
                        String ti =  cti.getSelectedItem().toString();
                        
                        String q1 = th;
                        String q2 = ti;
//                        ps=con.prepareStatement("select tickets from table3 ; ");
//                        ps.setString(1,th);
//                         ps.setString(2,ti);
//                         rs=ps.executeQuery();
//                         if(rs.next()){
//                           //  cth.setText(rs.getString(1));
//                             tic.setText(rs.getString(3));
//                            // cti.setText(rs.getString(2));
//                            
//                         }

//                    // rs=s.executeQuery("select tickets from table3 where theater="+"'"+q1+"'"+" and show="+"'"+q2+"'");
                        rs=ps.executeQuery("select tickets from table3 where theater="+"'"+q1+"'"+" and show="+"'"+q2+"';");
                        String bid = tic.getText();
                        int id = Integer.parseInt(bid);
                       // rs = s.executeQuery("select tickets from table3 where theater=" + "'" + q1 + "'" + " and show=" + "'" + q2 + "';");
                        while (rs.next()) {
                            String id1 = rs.getString("tickets");
                            int id2 = Integer.parseInt(id1);

                            id2 = id2 - N2;

                         ps.executeUpdate("Update table3 set tickets=" + id2 + " where theater=" + "'" + q1 + "'" + " show=" + "'" + q2 + "'");
                           
                        }
                        //new Book(a,b,sh,d,N1,f).setVisible(true); 
                        while (rs.next()) {
                            String tickets1 = rs.getString("tickets");
                            String q3 = tickets1;

                            //jLabel5 = new javax.swing.JLabel("tickets available:"+"  "+q3);
                        }
//
                        rs.close();
                        s.close();
                        con.close();
                    } catch (Exception ex) {
                        System.out.println(ex);
                  }
               }

// TODO add your handling code here:
            }
        });

//        b1.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //setVisible(false);
//                 Book a=new Book();
//        a.run();
//            }
//            
//        });
        add(b1);
        b1.setFont(new Font("TIMES NEW ROMAN", 1, 18));
        b1.setBounds(500, 550, 200, 30);
        //background
        bgimg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\java\\Movie\\img\\38.jpg"));

        add(bgimg);
        bgimg.setBounds(0, 0, 1360, 750);
    }
}

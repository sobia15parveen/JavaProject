import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class NewUser extends JFrame implements ActionListener
{
  JLabel lbl1=new JLabel("Admin Password");
  JPasswordField t1=new JPasswordField();
  JLabel lbl2=new JLabel("New User Name");
  JTextField t2=new JTextField();
  JLabel lbl3 =new JLabel("Password");
  JPasswordField t3 =new JPasswordField();
 
  JButton btn1=new JButton("Save");
  JButton btn2=new JButton("Exit");
  

  
 NewUser()
   {
     setLayout(null);
     this.add(lbl1);
     this.add(lbl2);
     this.add(lbl3);
     this.add(t1);
     this.add(t2);
     this.add(t3);  
     this.add(btn1);
     this.add(btn2);
     lbl1.setBounds(40,90,100,50);
     lbl2.setBounds(40,115,100,50);
     lbl3.setBounds(40,145,100,50);
     t1.setBounds(150,100,100,20);
     t2.setBounds(150,130,100,20);
     t3.setBounds(150,160,100,20);
     btn1.setBounds(50,200,70,20);
     btn2.setBounds(200,200,70,20);
     setSize(600,300);
     setVisible(true);
     setTitle("Create new user");
     btn1.addActionListener(this);
     btn2.addActionListener(this);
     
   }

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn2)
{
dispose();
}

if(e.getSource()==btn1)
{
String adminpass=String.valueOf(t1.getText());

if(adminpass.equals("abc123"))
{
String usernm = String.valueOf(t2.getText());
String pass = String.valueOf(t3.getText());

 

try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String sql="insert into useraccount values('"+usernm+"','"+pass+"')";
int res=stat.executeUpdate(sql);

if(res==1)
JOptionPane.showMessageDialog(this,"saved successfully");
else
JOptionPane.showMessageDialog(this,"Problem in insertion");

}catch(Exception e1)
		{
                      System.out.println(e1);
		}

}
else {
    JOptionPane.showMessageDialog(this,"Administrator Password is incorrect");
     }
}

}


public static void main(String args[])
{
new NewUser();
}                                               

}

    
     
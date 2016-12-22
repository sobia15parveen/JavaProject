import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class LoginFrame extends JFrame implements ActionListener 
{
  JButton btn1=new JButton("Login");
  JButton btn2=new JButton("Exit");
  JButton btn3=new JButton("Create");
  JPanel panel = new JPanel();
  JComboBox cmb = new JComboBox();
  JLabel lbl1=new JLabel("User Id");
  JLabel lbl2=new JLabel("Password");
  JPasswordField t2=new JPasswordField();
  
  
  LoginFrame()
   {
  
     add(panel);
     lbl1.setBounds(40,90,100,50);
     lbl2.setBounds(40,115,100,50);
     t2.setBounds(150,130,100,20);
     cmb.setBounds(150,95,100,20);
     btn1.setBounds(50,200,70,20);
     btn2.setBounds(200,200,70,20);
     btn3.setBounds(350,200,73,20); 
     
    
	try                       
		{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());      
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");  
		Statement stat=con.createStatement();
		String sql="select * from useraccount"; 
		ResultSet rs=stat.executeQuery(sql);

		  while(rs.next())    
                  {
                   cmb.addItem(rs.getString(1));  
		  }
		}catch(Exception e1){}
               
     btn1.addActionListener(this);
     btn2.addActionListener(this);
     btn3.addActionListener(this);  
     panel.add(btn1);
     panel.add(btn2);
     panel.add(btn3);
     panel.setLayout(null);
     panel.add(lbl1);
     panel.add(lbl2);
     panel.add(t2);
     panel.add(cmb); 
     setSize(600,300);
     setResizable(false);
     setLocation(370,200);
     setVisible(true);
     setTitle("Login Frame");      
   
     }


  
public void actionPerformed(ActionEvent e)
{
 
if(e.getSource()== btn3) 
{
new NewUser();
}

if(e.getSource()==btn1)
{
      
String user = (String)cmb.getSelectedItem();
String passwrd = t2.getText();
String s1="";
String s2="";

 try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());      
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");  
		Statement stat=con.createStatement();
                               String sql="select * from useraccount where usernm='"+user+"'";
		ResultSet rs=stat.executeQuery(sql);
		
		while(rs.next())
		{

		s2=rs.getString(2);
                s1=rs.getString(1);
			
		if(user.equals(s1) &&passwrd.equals(s2))
		{
		new MenuFrame();
		
		}
		else
		{
		JOptionPane.showMessageDialog(this,"Password is incorrect");
		}
		}		
					
			

	 }catch(Exception e1)
		{System.out.println(e1);
		}





}
		
               



if(e.getSource()==btn2)
{
System.exit(0);
}
}
public static void main(String[]args)
{
new LoginFrame();
}
}
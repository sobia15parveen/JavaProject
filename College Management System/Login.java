import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener 
{

		public static void main(String[] args) 
		{
		Login frameTabel = new Login();
		}

		JLabel lf=new JLabel("Hotel Management System Login Form");

		JButton blogin = new JButton("Login");
		JButton bcreate = new JButton("Create");
		JButton bexit = new JButton("Exit");
		JPanel panel = new JPanel();
		JComboBox txuser = new JComboBox();
		JPasswordField pass = new JPasswordField(15);
		JLabel luser=new JLabel("Username");
		JLabel lpass=new JLabel("Password");
		JLabel imagelabel=new JLabel(new ImageIcon("E:/My Stuffzzzzzzzzzzz/Java Coding/Project/login.png"));
		

		Login()
		{
		super("Login Authentification");
		setSize(500,300);
		setLocation(370,200);
		panel.setLayout (null);
                                    lf.setBounds(150,40,250,20);

		luser.setBounds(210,70,70,20);
		lpass.setBounds(210,120,70,20);
		txuser.setBounds(290,70,150,20);
		pass.setBounds(290,120,150,20);
		bexit.setBounds(290,170,80,20);
		blogin.setBounds(290,200,80,20);
		bcreate.setBounds(290,230,80,20);
		txuser.addItem("Select");
		try
		{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
		Statement stat=con.createStatement();
		String sql="select * from useracc";
		ResultSet rs=stat.executeQuery(sql);

		while(rs.next())
		{		
		txuser.addItem(rs.getString(1));	
		}
		}catch(Exception e)
		{
		}

		bcreate.addActionListener(this);                 
		blogin.addActionListener(this);
		bexit.addActionListener(this);
		imagelabel.setBounds(30,40,130,130);
                                   panel.add(lf);
		panel.add(blogin);
		panel.add(txuser);
		panel.add(pass);
		panel.add(luser);
		panel.add(lpass);
		panel.add(imagelabel);
		panel.add(bcreate);
		panel.add(bexit);
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		}
		
		 
		
                public void actionPerformed(ActionEvent e)
		{

		if(e.getSource()==bcreate){new NewUser();}
//--------------------------------------------------------------------------------------------------------------------------------------------
		if(e.getSource()==blogin)
		{
		String user=(String)txuser.getSelectedItem();
		String pwd=pass.getText();
		String s1="";
		
		String s2="";
		


		try
		{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
		Statement stat=con.createStatement();
		String sql="select * from useracc where userid='"+user+"'";
		ResultSet rs=stat.executeQuery(sql);
		
		while(rs.next())
		{

		s2=rs.getString(2);
                s1=rs.getString(1);
			
		if(user.equals(s1) && pwd.equals(s2))
		{
		new Admin();
		
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
		









//---------------------------------------------------------------------------------------------------------------------------------------------

		if(e.getSource()==bexit){System.exit(0);}

		}
		


}
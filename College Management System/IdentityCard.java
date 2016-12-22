import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class IdentityCard extends JFrame implements ActionListener
{
JPanel panel2=new JPanel();
JPanel panel1=new JPanel();
JLabel id=new JLabel("IDENTITY CARD");
Font fnt=new Font("Monotype Simple",Font.BOLD,17);
JLabel sen=new JLabel("Session");
JLabel roll=new JLabel("Roll No.");
JLabel cls=new JLabel("Class");
JLabel name=new JLabel("Name");
JLabel dob=new JLabel("Date Of Birth");
JLabel fname=new JLabel("Father Name");
JLabel add=new JLabel("Address");
JLabel date=new JLabel("Date");



JTextField tsen=new JTextField();
JTextField troll=new JTextField();
JComboBox cmb=new JComboBox();
JTextField tname=new JTextField();
JTextField tdob=new JTextField();
JTextField tfname=new JTextField();
JTextArea tadd=new JTextArea(20,30);
JTextField tdate=new JTextField();

JButton b1=new JButton("Save");
JButton b2=new JButton("Exit");
JButton b3=new JButton("Refresh");
JButton b4=new JButton("Delete");
JButton b5=new JButton("Search");

IdentityCard()
{
setLayout(null);
setVisible(true);
setSize(790,590);

this.add(id);
this.add(dob);
this.add(sen);
this.add(roll);
this.add(cls);
this.add(name);
this.add(fname);
this.add(add);

this.add(tdob);
this.add(tsen);
this.add(troll);
this.add(cmb);
this.add(tname);
this.add(tfname);
this.add(tadd);
this.add(date);
this.add(tdate);



this.add(panel2);
panel2.add(b1);
panel2.add(b2);
panel2.add(b3);
panel2.add(b4);
panel2.add(b5);

panel2.setBounds(100,380,500,45);


this.add(panel1);
panel1.add(id);
panel1.setBounds(300,25,150,35);
id.setFont(fnt);
panel1.setBackground(Color.yellow);
id.setForeground(Color.blue);

roll.setBounds(40,70,150,50);
cls.setBounds(40,105,150,50);
name.setBounds(40,140,150,50);
dob.setBounds(40,175,150,50);
fname.setBounds(40,210,150,50);
add.setBounds(40,245,150,50);

troll.setBounds(145,80,150,23);
cmb.setBounds(145,115,150,23);
tname.setBounds(145,150,150,23);
tdob.setBounds(145,185,150,23);
tfname.setBounds(145,220,150,23);
tadd.setBounds(145,260,150,60);


date.setBounds(390,70,150,50);
sen.setBounds(390,105,150,50);
tdate.setBounds(495,80,150,23);
tsen.setBounds(495,115,150,23);
  
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);







String s[]={"Select Program","BA","MA","BBA","MBA","BE","ME","B.TECH","M.TECH"};
for(int i=0;i<9;i++)
{
cmb.addItem(s[i]);
}
}


public void actionPerformed(ActionEvent e)
{
int f=0;
if(e.getSource()==b2)
{
dispose();
}
if(e.getSource()==b1)
{

String scmb =String.valueOf(cmb.getSelectedItem());
String sroll=String.valueOf(troll.getText());
String sname=String.valueOf(tname.getText());
String sfname=String.valueOf(tfname.getText());
String sdob=String.valueOf(tdob.getText());
String sadd=String.valueOf(tadd.getText());
String sesn=String.valueOf(tsen.getText());
String sdate=String.valueOf(tdate.getText());


try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String sql="insert into identitycard values('"+scmb+"','"+sroll+"','"+sname+"','"+sfname+"','"+sdob+"','"+sadd+"','"+sesn+"','"+sdate+"')";
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

if(e.getSource()==b3)
{
troll.setText("");
tname.setText("");
tfname.setText("");
tdob.setText("");
tadd.setText("");
tdate.setText("");
tsen.setText("");

}

if(e.getSource()==b4)
{


String roll=String.valueOf(JOptionPane.showInputDialog(this,"Enter Admission.No"));
try
		{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String sroll=String.valueOf(troll.getText());
String sql="delete from identitycard where sroll='"+roll+"'";
ResultSet rs=stat.executeQuery(sql);
JOptionPane.showMessageDialog(this,"record deleted");
		}catch(Exception e1)
		{
	JOptionPane.showMessageDialog(this,"record not found");
		}

}

if(e.getSource()==b5)
	{

         
          String roll=String.valueOf(JOptionPane.showInputDialog(this,"Enter Admission.No"));
	try
	{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String sroll=String.valueOf(troll.getText());
String sql="select * from identitycard where sroll='"+roll+"'";
ResultSet rs=stat.executeQuery(sql);

while(rs.next())
	{
			
f=1;			
				
troll.setText(rs.getString(2));
tname.setText(rs.getString(3));
tfname.setText(rs.getString(4));
tdob.setText(rs.getString(5));
tdate.setText(rs.getString(6));
tsen.setText(rs.getString(7));
tadd.setText(rs.getString(8));
			
			
	}

	}
	catch(Exception e1)
	{
	JOptionPane.showMessageDialog(this,"Problem"+e1);
	}
if(f==0)
JOptionPane.showMessageDialog(this,"record not found");


}



}


public static void main(String[]args)
{
new IdentityCard();
}

}

















import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
 class StudentAttendence extends JFrame implements ActionListener
{
Font fnt=new Font("Monotype Simple",Font.BOLD,15);
JPanel panel1=new JPanel();
JPanel panel2=new JPanel();
JPanel panel3=new JPanel();
JLabel lbl=new JLabel("STUDENT DAILY ATTENDENCE WINDOW");
JLabel lcmb=new JLabel("Class");
JLabel lroll=new JLabel("Roll No.");
JLabel ldate=new JLabel("Date");
JLabel lstat=new JLabel("Status");
JLabel lrec=new JLabel("Record");

JTextField troll=new JTextField();
JTextField tdate=new JTextField();
JComboBox cmbc=new JComboBox();

JButton b1=new JButton("Save");
JButton b2=new JButton("Change");
JButton b3=new JButton("Exit");




JRadioButton ab=new JRadioButton("Absent",true);
JRadioButton pr=new JRadioButton("Present",true);
ButtonGroup bg=new ButtonGroup();

StudentAttendence()
{

setLayout(null);
setSize(600,600); 
setVisible(true);
setLocation(410,100);
setTitle("Student Attendence");  
this.add(lbl);
this.add(panel2);
this.add(panel1);
this.add(lcmb);
this.add(cmbc);
this.add(troll);
this.add(tdate);
this.add(lroll);
this.add(ldate);
this.add(lrec);
this.add(lstat);
this.add(panel3);
lbl.setFont(fnt);
panel3.setBackground(Color.blue);
lbl.setForeground(Color.yellow);


bg.add(ab);
bg.add(pr);
panel1.add(ab);
panel1.add(pr);
this.add(panel2);
panel2.add(b1);
panel2.add(b2);
panel2.add(b3);
panel3.add(lbl);
panel3.setBounds(150,25,310,35);
panel1.setBounds(150,290,200,45);
panel2.setBounds(30,400,500,200);
lstat.setBounds(40,240,150,50);
lrec.setBounds(40,350,150,50);
lroll.setBounds(80,105,150,50);
lcmb.setBounds(80,140,150,50);
ldate.setBounds(80,175,150,50);
cmbc.setBounds(185,155,150,23);
troll.setBounds(185,120,150,23);
tdate.setBounds(185,190,150,23);

  b1.addActionListener(this); 
  b2.addActionListener(this);
  b3.addActionListener(this); 
  ab.addActionListener(this);
  pr.addActionListener(this);
 b1.setBackground(Color.YELLOW);
String s[]={"Select Program","BA","MA","BBA","MBA","BE","ME","B.TECH","M.TECH"};
for(int i=0;i<9;i++)
{
cmbc.addItem(s[i]);
}
}


public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b3)
{
dispose();
}
if(e.getSource()==b1)
{
 b1.setBackground(Color.RED);
String status=e.getActionCommand();
if(pr.isSelected())
{
status=String.valueOf(pr.getActionCommand());
}
else
{
status=String.valueOf(ab.getActionCommand());
}
String srollno=String.valueOf(troll.getText());
String sdate=String.valueOf(tdate.getText());
String sclass=String.valueOf(cmbc.getSelectedItem());


try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String sql="insert into studentattendence values('"+srollno+"','"+sdate+"','"+sclass+"','"+status+"')";
int res=stat.executeUpdate(sql);
if(res==1)

JOptionPane.showMessageDialog(this,"save successfully");
else
JOptionPane.showMessageDialog(this,"Problem in insertion");
}catch(Exception e1)
                               {
                           System.out.println(e1);
                              }

}




if(e.getSource()==b2)//change
{
int roll=Integer.parseInt(JOptionPane.showInputDialog(this,"enter roll"));
String date=JOptionPane.showInputDialog(this,"enter date for update");
String sta=JOptionPane.showInputDialog(this,"enter status for update");
String clas=JOptionPane.showInputDialog(this,"enter class for update");


try
		{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String sql="update studentattendence SET sdate='"+date+"',status='"+sta+"',sclass='"+clas+"' where srollno='"+roll+"'";
		ResultSet rs=stat.executeQuery(sql);
		JOptionPane.showMessageDialog(this,"successfully updated");
		}catch(Exception e1)
		{
	JOptionPane.showMessageDialog(this,e1);
		}

}


}
public static void main(String[]args)
{
    new StudentAttendence();
}


}
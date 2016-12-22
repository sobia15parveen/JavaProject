import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FeeStruct extends JFrame implements ActionListener
{
Font fnt=new Font("Monotype Simple",Font.BOLD,15);
JPanel p1=new JPanel();
JPanel p2=new JPanel();
JPanel p3=new JPanel();
JPanel p4=new JPanel();
JLabel lbl=new JLabel("FEE STRUCTURE/STUDENT FEE");
JLabel scls=new JLabel("Select Class Name");
JLabel  fee=new JLabel("Fee");
JLabel cname=new JLabel("Class Name");
JLabel clsfee=new JLabel("Enter Class Fee For Update"); 

JTextField tscls=new JTextField();
JTextField tcname=new JTextField();
JTextField tfee=new JTextField();

JComboBox cmb=new JComboBox();

JButton bok=new JButton("Ok");
JButton bup=new JButton("Update");
JButton be1=new JButton("Exit");
JButton bc=new JButton("Change");
JButton be2=new JButton("Exit");
FeeStruct()
{
setTitle("Fee Structure");
setVisible(true);
setSize(700,680);
lbl.setFont(fnt);
this.add(p1);
this.add(p2);
p2.add(p3);
p1.add(scls);
p1.add(tscls);
p1.add(cmb);
p1.add(be1);
p1.add(bup);
p1.add(bok);
p2.add(clsfee);
p3.add(cname);
p3.add(fee);
p3.add(bc);
p3.add(be2);
p3.add(tcname);
p3.add(tfee);
p2.add(lbl);
lbl.setBounds(180,10,280,50);
lbl.setForeground(Color.red);
lbl.setBackground(Color.blue);

p1.setLayout(null);
p2.setLayout(null);
p3.setLayout(null);
p1.setBounds(50,80,600,140);
p2.setBounds(50,210,600,160);
p3.setBounds(50,250,600,230);
cmb.setBounds(160,10,170,25);
scls.setBounds(10,10,170,23);
tscls.setBounds(340,10,170,25);
bok.setBounds(170,60,80,25);
clsfee.setBounds(40,200,400,23);
bup.setBounds(255,60,80,25);
be1.setBounds(340,60,80,25);
clsfee.setBounds(20,220,180,23);
cname.setBounds(10,10,170,23);
tcname.setBounds(150,10,170,23);
fee.setBounds(10,40,170,23);
tfee.setBounds(150,40,170,23);
bc.setBounds(160,90,80,25);
be2.setBounds(245,90,80,25);

}
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==bc)//change
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
if(e.getSource()==bok)
{

String scname=String.valueOf(cmb.getText());
String sclas=String.valueOf(tscls.getText());



try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String sql="insert into studentfee values('"+scname+"','"+sclas+"')";
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










}
public static void main(String[]args)
{
new FeeStruct();
}




}
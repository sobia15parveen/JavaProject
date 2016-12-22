import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
cdcd


public class StudentRecord extends JFrame implements ActionListener
{      
        JLabel lbl = new JLabel("Customer Details Filling Form");
       Font fnt=new Font("Monotype Simple",Font.BOLD,15);
       
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
      	JLabel ladm=new JLabel("Admission No.");
	JLabel ldoadm=new JLabel("Date of Admission");
	JLabel lname=new JLabel("Name");
	JLabel lfname=new JLabel("Father's Name");
	JLabel lmname=new JLabel("Mother's Name");
	JLabel ldob=new JLabel("Date Of Birth");
	JLabel lcont=new JLabel("Contact No.");
	JLabel lcadd=new JLabel("Correspondence Address");
	JLabel lpadd=new JLabel("Permanent Address");
	JLabel lnat=new JLabel("Nationality");
	JLabel lrlgn=new JLabel("Religion");
	JLabel lcls=new JLabel("Class");
        JLabel lroll = new JLabel("Roll no.");
        JLabel lclgn=new JLabel("College Name");
        JLabel lldo=new JLabel("Last Degree Obtain");
              
	
	JTextField tadm=new JTextField(20);
        JTextField tdoadm=new JTextField(20);
	JComboBox cmbdob= new JComboBox();
     
        JTextField tname=new JTextField(20);
	JTextField tfname=new JTextField(20);
	JTextField tmname=new JTextField(20);
        JComboBox cmbd = new JComboBox();
        JComboBox cmbdoa = new JComboBox();
        JRadioButton bm = new JRadioButton("Male");
        JRadioButton bf = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
	JTextField tnat=new JTextField(20);
	JTextField trlgn=new JTextField(20);
	JTextArea tpadd=new JTextArea(10,20);
        JTextArea tcadd=new JTextArea(10,20);        	
	JTextField tcont=new JTextField(20);        
        JComboBox cmbc = new JComboBox(); 
        JTextField troll=new JTextField(20);
        JTextField tldo=new JTextField(20);    
        JTextField tclgn = new JTextField(20);
      
      
       JButton b1 = new JButton("Save");
       JButton b2 = new JButton("Search");
       JButton b3 = new JButton("Refresh");
       JButton b4= new JButton("Delete");
       JButton b5 = new JButton("Exit");
  StudentRecord()
      {
       

    
        setLayout(null);
        lbl.setFont(fnt);
         
        lbl.setForeground(Color.yellow);
        panel2.setBackground(Color.blue);
        String[] s1 = {"Select Admission",
         "dd MMMMM yyyy",
         "dd.MM.yy",
         "MM/dd/yy",
         
};

JComboBox cmbdoa = new JComboBox(s1);
cmbdoa.setEditable(true);
cmbdoa.addActionListener(this);
   String[] s2 = {"Select Date",
         "dd MMMMM yyyy",
         "dd.MM.yy",
         "MM/dd/yy",
         
};

JComboBox cmbdob = new JComboBox(s2);
cmbdob.setEditable(true);
cmbdob.addActionListener(this); 






       this.add(ladm);
        this.add(ldoadm);
        this.add(tadm);
        this.add(tdoadm);
        this.add(cmbdob);
        this.add(lname);
        this.add(lfname);
        this.add(lmname);
        this.add(ldob);
        this.add(lnat);   
        this.add(lrlgn);
        this.add(lpadd);
        this.add(cmbdoa);
        this.add(panel2);

        group.add(bm);
        group.add(bf);  
        this.add(panel);
        panel.add(bm);
        panel.add(bf);
        this.add(b1);
        this.add(b2);
        this.add(panel1);
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel2.add(lbl);
        this.add(tname); 
        this.add(tfname);
        this.add(tmname);
        this.add(cmbdob);
        this.add(tnat); 
        this.add(trlgn);      
        this.add(tpadd);
        this.add(lcadd);
        this.add(tcadd);
        this.add(lcont);
        this.add(tcont);
        this.add(lcls);
        this.add(cmbc);
        this.add(lroll);
        this.add(troll);
        this.add(lldo);
        this.add(lldo);
        this.add(tldo);
        this.add(lclgn);
        this.add(tclgn);
       b1.addActionListener(this); 
       b2.addActionListener(this);
       b3.addActionListener(this); 
       b4.addActionListener(this); 
       b5.addActionListener(this);
     
        

       

     lbl.setBackground(Color.green);
      panel2.setBounds(267,35,200,35);
      ladm.setBounds(40,80,150,45);     
      ldoadm.setBounds(40,115,150,45);
      tadm.setBounds(190,90,123,23);
      cmbdoa.setBounds(190,125,123,23);
      lname.setBounds(40,150,150,45);
      lfname.setBounds(40,185,150,45);
      lmname.setBounds(40,220,150,45);
      ldob.setBounds(40,255,150,45);
      panel.setBounds(5,310,200,50);    
      lrlgn.setBounds(40,355,150,45);
      lpadd.setBounds(40,385,150,45);     
      panel1.setBounds(45,500,600,40);
      tname.setBounds(190,165,123,23);
      tfname.setBounds(190,195,123,23);
      tmname.setBounds(190,230,123,23);
      cmbdob.setBounds(190,265,123,23);
      trlgn.setBounds(190,365,123,23);
      tpadd.setBounds(190,405,123,60);
     lcadd.setBounds(360,80,150,50);
     tcadd.setBounds(515,90,150,50); 
      lcont.setBounds(360,147,150,23);
      tcont.setBounds(515,150,150,23);
      lcls.setBounds(360,185,150,23);
      cmbc.setBounds(515,180,150,23);
      lroll.setBounds(360,215,150,23);
      lldo.setBounds(360,245,150,23);
      lclgn.setBounds(360,275,150,23);
      lnat.setBounds(360,310,150,23);
      troll.setBounds(515,210,150,23);
      tldo.setBounds(515,240,150,23);
      tclgn.setBounds(515,270,150,23);
      tnat.setBounds(515,305,150,23);

      setSize(800,600);
      setResizable(false);
      setLocation(330,110);
      setVisible(true);
      setTitle("Student Record");   

String s[]={"Select Program","BA","MA","BBA","MBA","BE","ME","B.TECH","M.TECH"};
for(int i=0;i<9;i++)
{
cmbc.addItem(s[i]);
}
}






public void actionPerformed(ActionEvent e)
{
int f=0;
if(e.getSource()==b5)
{
dispose();
}
if(e.getSource()==b3)
{
tadm.setText("");
tfname.setText("");
tmname.setText("");
troll.setText("");
tname.setText("");



}




if(e.getSource()==b1)
{


String admno=String.valueOf(tadm.getText());
String s2=String.valueOf(tdoadm.getText());
String s3=String.valueOf(cmbdob.getSelectedItem());
String s4=String.valueOf(cmbdoa.getSelectedItem());
String s5=String.valueOf(tname.getText());
String s6=String.valueOf(tfname.getText());
String s7=String.valueOf(tmname.getText());
String s8=String.valueOf(cmbd.getSelectedItem());
String s9=String.valueOf(tnat.getText());
String s10=String.valueOf(trlgn.getText());
String s11=String.valueOf(tpadd.getText());
String s12=String.valueOf(tcadd.getText());
String s13=String.valueOf(troll.getText());
String s14=String.valueOf(tldo.getText());
String s15=String.valueOf(tclgn.getText());
String s16=String.valueOf(tcont.getText());
String s17=String.valueOf(cmbc.getSelectedItem());
String s18=String.valueOf(cmbdob.getSelectedItem());

try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String sql="insert into studentrecord values('"+admno+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"','"+s14+"','"+s15+"','"+s16+"','"+s17+"','"+s18+"')";
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
if(e.getSource()==b2)
	{

         
          String adm=String.valueOf(JOptionPane.showInputDialog(this,"Enter Admission.No"));
	try
	{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String admno=String.valueOf(tadm.getText());
String sql="select * from studentrecord where admno='"+adm+"'";
ResultSet rs=stat.executeQuery(sql);

while(rs.next())
	{
			
f=1;			
				
tadm.setText(rs.getString(1));
tname.setText(rs.getString(5));
tfname.setText(rs.getString(6));
tmname.setText(rs.getString(7));
troll.setText(rs.getString(13));

				
			
	}

	}
	catch(Exception e1)
	{
	JOptionPane.showMessageDialog(this,"Problem"+e1);
	}
if(f==0)
JOptionPane.showMessageDialog(this,"record not found");


}
if(e.getSource()==b4)
{

String adm=String.valueOf(JOptionPane.showInputDialog(this,"Enter Admission.No"));
try
		{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
Statement stat=con.createStatement();
String admno=String.valueOf(tadm.getText());
String sql="delete from studentrecord where admno='"+adm+"'";
ResultSet rs=stat.executeQuery(sql);
JOptionPane.showMessageDialog(this,"record deleted");
		}catch(Exception e1)
		{System.out.print(e1);
		}



}






}



public static void main(String[]args)
{
new StudentRecord();
}
}







	
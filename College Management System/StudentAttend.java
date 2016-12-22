import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class StudentAttend extends JFrame implements ActionListener
{
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	

	JLabel lclass=new JLabel("Class");
	JLabel lroll=new JLabel("Roll No.");
	JLabel ldate=new JLabel("Date");
	JLabel ltitle=new JLabel("STUDENT DAILY ATTENDANCE");

	JRadioButton rd1=new JRadioButton("Absent",false);
	JRadioButton rd2=new JRadioButton("Present",false);


	JButton btn1=new JButton("Save");	
	JButton btn2=new JButton("Change");
	JButton btn3=new JButton("Exit");

        JTextField troll=new JTextField(20);
	

	JComboBox cclass=new JComboBox();
	JComboBox date1=new JComboBox();
	JComboBox date2=new JComboBox();
	JComboBox date3=new JComboBox();
	
	ButtonGroup btngroup=new ButtonGroup();
	Font fnt=new Font("Times New Roman",Font.BOLD,25);

	StudentAttend()
	{
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);

	panel1.setBounds(50,130,585,400);	
	panel2.setBounds(50,170,490,70);
	panel2.setBorder(BorderFactory.createTitledBorder("Status"));


	panel3.setBounds(50,300,490,70);
	panel3.setBorder(BorderFactory.createTitledBorder("Record"));

	this.add(panel1);
	panel1.add(panel2);
	panel1.add(panel3);
	
	panel1.add(lclass);lclass.setBounds(160,60,80,20);
	panel1.add(cclass);cclass.setBounds(240,60,100,20);
	panel1.add(ldate);ldate.setBounds(160,30,80,20);
	panel1.add(date1);panel1.add(date2);panel1.add(date3);date1.setBounds(240,30,100,20);date2.setBounds(340,30,50,20);date3.setBounds(390,30,70,20);
	panel1.add(lroll);lroll.setBounds(160,90,80,20);
	panel1.add(troll);troll.setBounds(240,90,100,20);
	panel1.setLayout(null);

	btngroup.add(rd1); btngroup.add(rd2);

	panel3.add(btn1);
	panel3.add(btn2);
	panel3.add(btn3);
	cclass.addItem("Select");date3.addItem("Year");	

		String s1[]={"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0;i<=12;i++)	
		{
			date1.addItem(s1[i]);
			

		}
		
		for(int i=1;i<=31;i++)	
		{
			date2.addItem(i);
			

		}
		
		for(int j=2013;j>=1901;j--)	
		{
			date3.addItem(j);
			

		}
	String s2[]={"L.A","L.Sc.","L.Com","B.A","B.Sc","B.Com","BCA","BBA","DCA"};
		for(int k=0;k<=8;k++)
		{
			cclass.addItem(s2[k]);
		}


		

	add(ltitle);ltitle.setFont(fnt);
	ltitle.setBounds(160,50,500,40);


	panel2.add(rd1);
	panel2.add(rd2);

	setTitle("STUDENT DAILY ATTENDANCE");
	setLayout(null);
	setVisible(true);
	setSize(700,600);
	setLocation(270,0);
	}

	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==btn3) {dispose();}

			if(e.getSource()==btn1)
			{
			String d1=String.valueOf(date1.getSelectedItem());
			String d2=String.valueOf(date2.getSelectedItem());
			String d3=String.valueOf(date3.getSelectedItem());

			String prog=String.valueOf(cclass.getSelectedItem());
			String roll=String.valueOf(troll.getText());
			
			String status=e.getActionCommand();
			if(rd1.isSelected())
			{status=String.valueOf(rd1.getActionCommand());}

			if(rd2.isSelected())
			{status=String.valueOf(rd2.getActionCommand());}


	

			try
			{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
			Statement stat=con.createStatement();
			String sql="insert into studentattendance values('"+d1+"','"+d2+"','"+d3+"','"+prog+"','"+roll+"','"+status+"')";
			int res=stat.executeUpdate(sql);
		
			if(res==1)
			JOptionPane.showMessageDialog(this,"Saved successfully");
			else
			JOptionPane.showMessageDialog(this,"Problem in insertion");
			}
			catch(Exception e1)
			{
			System.out.println(e1);
			}
			}

			if(e.getSource()==btn2)
			{	
			String d1=String.valueOf(date1.getSelectedItem());
			String d2=String.valueOf(date2.getSelectedItem());
			String d3=String.valueOf(date3.getSelectedItem());

			String prog=String.valueOf(cclass.getSelectedItem());
			String roll=String.valueOf(troll.getText());

			String status=e.getActionCommand();
			if(rd1.isSelected())
			status=String.valueOf(rd1.getActionCommand());

			if(rd2.isSelected())
			status=String.valueOf(rd2.getActionCommand());
			


			
			try
			{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
			Statement stat=con.createStatement();
			String sql="update studentattendance set status='"+status+"' where month='"+d1+"' and dat='"+d2+"'and year='"+d3+"'and class='"+prog+"'and roll='"+roll+"'";
			ResultSet rs=stat.executeQuery(sql);
			JOptionPane.showMessageDialog(this,"successfully updated");
			}catch(Exception e1)
			{
			JOptionPane.showMessageDialog(this,e1);
			}




			}	
			
			
	}


	public static void main(String[] args)
	{
	new StudentAttend();
	}

}	
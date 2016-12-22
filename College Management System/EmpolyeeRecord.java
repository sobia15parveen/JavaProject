import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmpolyeeRecord extends JFrame implements ActionListener
{  

   JLabel lbl = new JLabel("EMPOLYEE RECORDS");
   Font fnt=new Font("Monotype Simple",Font.BOLD,15);
          
   JPanel panel1 = new JPanel();
   JPanel panel2 = new JPanel();
   JPanel panel3 = new JPanel();  
   JPanel panel4 = new JPanel();  


   JLabel id=new JLabel("Empolyee ID");
   JLabel doj=new JLabel("Date Of Joining");
   JLabel name=new JLabel("Empolyee Name");
   JLabel fname=new JLabel("Father's Name");
   JLabel mname=new JLabel("Mother's Name");
   JLabel dob=new JLabel("Date Of Birth");
   JLabel gender=new JLabel("Gender");
   JLabel nat=new JLabel("Nationality");
   JLabel rlgn=new JLabel("Religion");
   JLabel lpadd=new JLabel("Permanent Address");
   JLabel lcadd=new JLabel("Corresponding Address");
   JLabel no=new JLabel("Contact No");
   JLabel des=new JLabel("Designation");
   JLabel qual=new JLabel("Qualification");
   JLabel sal=new JLabel("Salary");
  
   JTextField tid=new JTextField(20);
   JTextField tadm=new JTextField(20);
   JTextField tname=new JTextField(20);
   JTextField tfname=new JTextField(20);
   JTextField tmname=new JTextField(20);
   JTextField tnat=new JTextField(20);
   JTextField tno=new JTextField(20);
   JTextField tdes=new JTextField(20);
   JTextField tqual=new JTextField(20);
   JTextField tsal=new JTextField(20);
    JTextField trlgn=new JTextField(20);

   


   JTextArea tpadd=new JTextArea(10,20);
   JTextArea tcadd=new JTextArea(10,20);
   
   JComboBox cmbdob= new JComboBox();
   JComboBox date1=new JComboBox();
   JComboBox date2=new JComboBox();
   JComboBox date3=new JComboBox();  
   
   JRadioButton bm = new JRadioButton("Male");
   JRadioButton bf = new JRadioButton("Female");
   ButtonGroup group = new ButtonGroup();
	

   




  JButton bsave=new JButton("Save");
  JButton bsearch=new JButton("Search");
  JButton bref=new JButton("Refresh");
  JButton bdel=new JButton("Delete");
  JButton bexit=new JButton("Exit");
  
EmpolyeeRecord()
{


   setLayout(null);
    String[] s1 = {"Select Date",
         "dd MMMMM yyyy",
         "dd.MM.yy",
         "MM/dd/yy",
};
JComboBox cmbdob = new JComboBox(s1);
String s2[]={"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0;i<=12;i++)	
		{
			date1.addItem(s2[i]);
			

		}
		
		for(int i=1;i<=31;i++)	
		{
			date2.addItem(i);
			

		}
		
		for(int j=2013;j>=1901;j--)	
		{
			date3.addItem(j);
			

		}

        
        this.add(lbl);
        this.add(id);
        this.add(dob);
        this.add(doj);
        this.add(tadm);
        this.add(name);
        this.add(fname);
        this.add(mname);
        this.add(gender);
        this.add(nat);
        this.add(lpadd);
        this.add(lcadd);   
        this.add(rlgn);
        this.add(no);
        this.add(des);      
        this.add(qual);
        this.add(sal);
         this.add(tnat);
         this.add(tid);
        this.add(cmbdob);
        this.add(tname);
        this.add(tfname);
        this.add(tmname);
        this.add(gender);
        this.add(tsal);
        this.add(tpadd);
        this.add(tcadd);   
        this.add(trlgn);
        this.add(tno);
        this.add(tdes);
        this.add(tqual);
        this.add(tsal);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);  
        this.add(panel4);      
        panel1.add(lbl);
       
   lbl.setFont(fnt);
   lbl.setForeground(Color.yellow);
   panel1.setBackground(Color.blue);
       
         panel2.add(bsave);
         panel2.add(bsearch); 
         panel2.add(bdel);
         panel2.add(bref);
         panel2.add(bexit);
         this.add(date1);
         this.add(date2);     
         this.add(date3);
         panel4.add(bm);
         panel4.add(bf);
        group.add(bm);
        group.add(bf);  
        
        
      panel1.setBounds(267,35,200,35);   
      panel2.setBounds(45,500,600,40);
      panel4.setBounds(5,310,200,50);
     

  
      id.setBounds(40,80,150,45);     
      dob.setBounds(40,115,150,45);
      tid.setBounds(190,90,150,23);
      cmbdob.setBounds(190,125,150,23);
      name.setBounds(40,150,150,45);
      fname.setBounds(40,185,150,45);
      mname.setBounds(40,220,150,45);
      nat.setBounds(40,255,150,45);
      
       
      rlgn.setBounds(40,355,150,45);
      lpadd.setBounds(40,385,150,45);     
     
      
      tname.setBounds(190,165,150,23);
      tfname.setBounds(190,195,150,23);
      tmname.setBounds(190,230,150,23);
      tnat.setBounds(190,265,150,23);
      trlgn.setBounds(190,365,150,23);
      tpadd.setBounds(190,405,150,60);
      lcadd.setBounds(360,80,150,50);
      tcadd.setBounds(515,90,150,50); 
      no.setBounds(360,147,150,23);
      des.setBounds(360,182,150,23);
      qual.setBounds(360,217,150,23);
      sal.setBounds(360,252,150,23);
      doj.setBounds(360,290,150,23);
      tno.setBounds(515,150,150,23);
      tdes.setBounds(515,185,150,23);     
      tqual.setBounds(515,220,150,23);      
      tsal.setBounds(515,255,150,23);
      date1.setBounds(515,290,50,23);
      date2.setBounds(570,290,50,23); 
      date3.setBounds(625,290,50,23);
        setSize(800,600);
        setResizable(false);
        setLocation(300,90);
        setVisible(true);
        setTitle("Empolyee Record");   


	bexit.addActionListener(this);
	bsave.addActionListener(this);	
	bref.addActionListener(this);	
	bsearch.addActionListener(this);	
	bdel.addActionListener(this);	
}


public void actionPerformed(ActionEvent e)
{	
	if(e.getSource()==bexit) {dispose();}

        if(e.getSource()==bsave)
	{
		
			String id=String.valueOf(tid.getText());
			String doj=String.valueOf(date1.getSelectedItem())+String.valueOf(date2.getSelectedItem())+String.valueOf(date3.getSelectedItem());
			String name=String.valueOf(tname.getText());
			String fname=String.valueOf(tfname.getText());
			String mname=String.valueOf(tmname.getText());
			String dob=String.valueOf(cmbdob.getSelectedItem());
			String no=String.valueOf(tno.getText());
			String cadd=String.valueOf(tcadd.getText());
			String padd=String.valueOf(tpadd.getText());
			String des=String.valueOf(tdes.getText());
			String nat=String.valueOf(tnat.getText());
			String rlgn=String.valueOf(trlgn.getText());				String qual=String.valueOf(tqual.getText());
			String sal=String.valueOf(tsal.getText());
			

			String gen=e.getActionCommand();
			if(bm.isSelected())
			{gen=String.valueOf(bm.getActionCommand());}

			if(bf.isSelected())
			{gen=String.valueOf(bf.getActionCommand());}
			try
			{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
			Statement stat=con.createStatement();
			String sql="insert into emprecord values('"+id+"','"+dob+"','"+name+"','"+fname+"','"+mname+"','"+nat+"','"+gen+"','"+rlgn+"','"+padd+"','"+cadd+"','"+no+"','"+des+"','"+qual+"','"+sal+"','"+doj+"')";
			int res=stat.executeUpdate(sql);
		
			if(res==1)
			JOptionPane.showMessageDialog(this,"Saved successfully");
			else
			JOptionPane.showMessageDialog(this,"Problem in insertion");
			}catch(Exception e1)
			{
			System.out.println(e1);
			}

}
		if(e.getSource()==bref)
			{
			tid.setText("");
			cmbdob.setSelectedItem("Select Date");
			date1.setSelectedItem("Month");date2.setSelectedItem(1);date3.setSelectedItem("Year");
			tname.setText("");
			tfname.setText("");
			tmname.setText("");
			
			tcadd.setText("");
			tpadd.setText("");
			tno.setText("");
			tnat.setText("");
			trlgn.setText("");
			
			tqual.setText("");
			tsal.setText("");
			tdes.setText("");
			
			}
		if(e.getSource()==bsearch)
			{
			String id=String.valueOf(JOptionPane.showInputDialog(this,"Enter Employee ID:"));
			int f=0;
			
			try
			{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
			Statement stat=con.createStatement();
			String sql="select * from emprecord where empid='"+id+"'";
			ResultSet rs=stat.executeQuery(sql);
			
			while(rs.next())
			{
			f=1;			
				
			tid.setText(rs.getString(1));
			cmbdob.setSelectedItem(rs.getString(2));
			tname.setText(rs.getString(3));
			tfname.setText(rs.getString(4));
			tmname.setText(rs.getString(5));
			tnat.setText(rs.getString(6)); 


			
			tcadd.setText(rs.getString(9));
			tpadd.setText(rs.getString(8));
			tno.setText(rs.getString(10));
			
			trlgn.setText(rs.getString(7));
			
			tqual.setText(rs.getString(12));
			tsal.setText(rs.getString(13));
			tdes.setText(rs.getString(11));

			}

			}
			catch(Exception e1)
			{
			JOptionPane.showMessageDialog(this,"Problem"+e1);
			}
			
			if(f==0)
			JOptionPane.showMessageDialog(this,"Record not found");
			
	
			}

			if(e.getSource()==bdel)
			{

			int f=0;
			int id=Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Employee ID:"));

			try
			{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ordb","system","password");
			Statement stat=con.createStatement();
			String sql="delete from emprecord where empid='"+id+"'";
			ResultSet rs=stat.executeQuery(sql);
			JOptionPane.showMessageDialog(this,"Record deleted");
			}
			catch(Exception e1)
			{
			JOptionPane.showMessageDialog(this,"Record not found");
			}
			}	
	
}

public static void main(String[]args)
{
new EmpolyeeRecord();
}


}
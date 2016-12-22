import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;



public class CustomerForm extends JFrame
{      
        JLabel lbl = new JLabel("Customer Details Filling Form");
       Font fnt=new Font("Monotype Simple",Font.BOLD,15);
       
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
      	JLabel ladm=new JLabel("Customer Code.");
	JLabel ldoadm=new JLabel(" Marital status");
	JLabel lname=new JLabel("Age");
	JLabel lfname=new JLabel("First Name");
	JLabel lmname=new JLabel("Last Name");
	JLabel ldob=new JLabel("Status");
	JLabel lcont=new JLabel("Phone No.");
	JLabel lcadd=new JLabel("Residential Address");
	JLabel lpadd=new JLabel("Official  Address");
	JLabel lnat=new JLabel("visa No.");
	JLabel lrlgn=new JLabel("Religion");
	JLabel em=new JLabel("Email ID");
        JLabel lroll = new JLabel("Country");
        JLabel lclgn=new JLabel("Passport No.");
        JLabel lldo=new JLabel("Nationality");
              
	
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
         JTextField email=new JTextField(20);       
        JComboBox cmbc = new JComboBox(); 
        JTextField troll=new JTextField(20);
        JTextField tldo=new JTextField(20);    
        JTextField tclgn = new JTextField(20);
      
      
       
       JButton b2 = new JButton("Save Detail");
       JButton b3 = new JButton("Back to Main");
       
  CustomerForm()
      {
       

    
        setLayout(null);
        lbl.setFont(fnt);
         
        lbl.setForeground(Color.yellow);
        panel2.setBackground(Color.blue);
         String[] s1 = {"select",
         "Married",
         "Unmarried",
         
         
};

JComboBox cmbdoa = new JComboBox(s1);
cmbdoa.setEditable(true);

   String[] s2 = {"Regular",
         "weekly",
         "monthly",
         
         
};

JComboBox cmbdob = new JComboBox(s2);
cmbdob.setEditable(true);
 





         this.add(em);
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
        this.add(email);
        group.add(bm);
        group.add(bf);  
        this.add(panel);
        panel.add(bm);
        panel.add(bf);
        this.add(b3);
        this.add(b2);
        this.add(panel1);
        
        panel1.add(b2);
        panel1.add(b3);
      
      
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
        
        this.add(cmbc);
        this.add(lroll);
        this.add(troll);
        this.add(lldo);
        this.add(lldo);
        this.add(tldo);
        this.add(lclgn);
        this.add(tclgn);
       
       

     lbl.setBackground(Color.green);
      panel2.setBounds(267,35,250,35);
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
     
      em.setBounds(360,175,150,23);

      email.setBounds(515,180,150,23);
          

 
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


}






public static void main(String[]args)
{
new CustomerForm();
}
}







	
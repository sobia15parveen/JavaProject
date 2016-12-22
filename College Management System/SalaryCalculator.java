import java.awt.*;
import javax.swing.*;

public class SalaryCalculator extends JFrame
{


   JPanel panel1=new JPanel();
   JPanel panel2=new JPanel();
   JPanel panel3=new JPanel();
   Font fnt=new Font("Times New Roman",Font.BOLD,20);
    
   JLabel ltitle=new JLabel("SALARY-CALCULATOR");
   JLabel lid=new JLabel("Empolyee ID");
   JLabel lname=new JLabel("Empolyee Name");
   JLabel lbasic=new JLabel("Basic Salary");
   JLabel lmon=new JLabel("Salary For The Month");
   JLabel lda=new JLabel("DA");
   JLabel lhra=new JLabel("H.R.A");    
   JLabel lpd=new JLabel("Present Days");
   JLabel lpf=new JLabel("PF");
   JLabel lta=new JLabel("TA");
   JLabel lpb=new JLabel("Previous Balance");
   JLabel ltotal=new JLabel("Total Amount");
   JLabel lgross=new JLabel("Gross Salary");
   

        JComboBox cid=new JComboBox();        
        JComboBox cs=new JComboBox();
  
        JTextField tname=new JTextField(20);    
        JTextField tpd=new JTextField(20);
        JTextField tbasic=new JTextField(20);
        JTextField tda=new JTextField(20);
        JTextField tta=new JTextField(20);
        JTextField tpf=new JTextField(20);  
        JTextField thra=new JTextField(20);
        JTextField tgross=new JTextField(20);
        JTextField tpb=new JTextField(20);
        JTextField total=new JTextField(20);
     
     
       JButton bsave=new JButton("Save");	 
       JButton bcal=new JButton("Calculate");
       JButton bexit=new JButton("Exit");
      JButton bsearch=new JButton("Search");	
      JButton bref=new JButton("Refresh");
     
   SalaryCalculator()
{

     this.add(panel1);
     this.add(panel2);
     this.add(panel3);
     this.setLayout(null);
     panel2.setLayout(null);
     panel3.setLayout(new GridLayout(5,1,0,7));
     panel2.setBorder(BorderFactory.createTitledBorder("Records"));     
     panel1.setBorder(BorderFactory.createLineBorder(Color.black));
         panel1.setBackground(Color.red);

     panel1.add(ltitle);
     panel3.add(bsave);
     panel3.add(bsearch);
     panel3.add(bexit);
     panel3.add(bref);
     panel3.add(bcal);
   
        
               panel2.add(tpf);
               panel2.add(lpf);
               panel2.add(lid);
               panel2.add(cid);
               panel2.add(lname);
               panel2.add(tname);
               panel2.add(lbasic);
               panel2.add(tbasic);
               panel2.add(lmon);
               panel2.add(cs);                 
               panel2.add(lpd);
               panel2.add(tpd);
               panel2.add(lpb);
               panel2.add(tpb);
               panel2.add(tta);
               panel2.add(lta);
               panel2.add(tda);
               panel2.add(lda);
               panel2.add(thra);
               panel2.add(lhra);
               panel2.add(tgross);
               panel2.add(lgross);
               panel2.add(ltotal);
               panel2.add(total);

               ltitle.setFont(fnt);
               panel1.setBounds(230,20,290,35);
               panel2.setBounds(30,90,380,490);
               panel3.setBounds(480,200,150,190);
                lid.setBounds(30,5,150,45);
                lname.setBounds(30,40,150,45);
                lbasic.setBounds(30,75,150,45);
                lmon.setBounds(30,110,150,45);
                lpd.setBounds(30,145,150,45);    
                lpb.setBounds(30,180,150,45);         
                lta.setBounds(30,215,150,45);
                lda.setBounds(30,250,150,45);
               lhra.setBounds(30,285,150,45);
               lpf.setBounds(30,320,150,45);
                lgross.setBounds(30,355,150,45);
                ltotal.setBounds(30,390,150,45);

 
                 cid.setBounds(160,15,150,23);
                 tname.setBounds(160,50,150,23);
                 tbasic.setBounds(160,85,150,23);
                 cs.setBounds(160,120,150,23);
                 tpd.setBounds(160,155,150,23);             
                 tpb.setBounds(160,190,150,23);
                 tta.setBounds(160,225,150,23); 
                 tda.setBounds(160,260,150,23);
                 thra.setBounds(160,295,150,23);
                 tpf.setBounds(160,330,150,23);                
                 tgross.setBounds(160,365,150,23);
                 total.setBounds(160,400,150,23);
         
             

                setTitle("Salary Calclator");
	setLayout(null);
	setVisible(true);
	setSize(780,700);
	setLocation(270,0);
}


public static void main(String[] args)
	{
	new SalaryCalculator();
                }

}
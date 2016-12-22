import java.awt.*;
import javax.swing.*;

public class SalaryStruct extends JFrame 
{
  JPanel panel=new JPanel();
  JPanel panel1=new JPanel();
   JPanel panel2=new JPanel();
   JPanel panel3=new JPanel();
   JPanel panel4=new JPanel();
   Font fnt=new Font("Times New Roman",Font.BOLD,20);

      
    
   JLabel ltitle=new JLabel("SALARY-STRUCTURE");
   JLabel lid=new JLabel("Empolyee ID");
   JLabel lname=new JLabel("Empolyee Name");
   JLabel ldes=new JLabel("Designation");
   JLabel lscale=new JLabel("Scale");
  
   
   
   JLabel lbasic=new JLabel("Basic Salary");
   JLabel lda=new JLabel("DA");
   JLabel lcca=new JLabel("CCA");
   JLabel lmed=new JLabel("MED");
   JLabel lhra=new JLabel("H.R.A");
   JLabel lgross=new JLabel("Gross Salary");
 
   JLabel lpf=new JLabel("PF");
   JLabel lewf=new JLabel("EWF");
   JLabel lgi=new JLabel("GI");
   JLabel lit=new JLabel("IT");
   JLabel lstam=new JLabel("R.Stampe");
   JLabel ltotal=new JLabel("Total");
   JLabel lnat=new JLabel("Nat Payable");
   




   JButton bsave=new JButton("Save");	
   JButton bcal=new JButton("Calculate");
   JButton bexit=new JButton("Exit");
 
        JTextField tid=new JTextField(20);
        JTextField tdes=new JTextField(20);
        JTextField tname=new JTextField(20);  
        JTextField tscale=new JTextField(20);
        JTextField tbasic=new JTextField(20);


        JTextField tda=new JTextField(20);
        JTextField tcca=new JTextField(20);
        JTextField tmed=new JTextField(20);  
        JTextField thra=new JTextField(20);
        JTextField tgross=new JTextField(20);



         JTextField tpf=new JTextField(20);
        JTextField tewf=new JTextField(20);
        JTextField tgi=new JTextField(20);  
        JTextField tit=new JTextField(20);
        JTextField tstam=new JTextField(20);
    
        JTextField total=new JTextField(20);
        JTextField tnat=new JTextField(20);


SalaryStruct()
{            

               this.add(panel1);
               this.add(panel2);
               this.add(panel3);
               this.add(panel4);
             
               this.setLayout(null);
               panel2.setLayout(null);
               panel3.setLayout(new GridLayout(1,2,5,0));
            
               
              
              
                panel1.add(ltitle);
                ltitle.setFont(fnt);
                panel1.setBounds(230,20,290,35);                                         
                panel2.setBounds(30,90,680,170);
                panel3.setBounds(30,280,680,310);    
                panel4.setBounds(210,600,300,50);
                
                lid.setBounds(30,5,150,45);
                lname.setBounds(30,40,150,45);
                ldes.setBounds(30,75,150,45);
                lscale.setBounds(30,110,150,45);
                tid.setBounds(140,15,150,23);
                tname.setBounds(140,50,150,23);
                 tdes.setBounds(140,85,150,23);
                 tscale.setBounds(140,120,150,23);
             
                 lbasic.setBounds(30,5,150,45);
                 lda.setBounds(30,40,150,45);
                 lcca.setBounds(30,75,150,45);      
                 lmed.setBounds(30,110,150,45);
                 lhra.setBounds(30,145,150,45);
                 lgross.setBounds(30,180,150,45);



                tbasic.setBounds(140,15,150,23);
                tda.setBounds(140,50,150,23);
                 tcca.setBounds(140,85,150,23);
                 tmed.setBounds(140,120,150,23);
                 thra.setBounds(140,155,150,23);
                 tgross.setBounds(140,190,150,23);
    
          
                 lpf.setBounds(320,5,150,45);
                 lewf.setBounds(320,40,150,45);
                 lgi.setBounds(320,75,150,45);      
                 lit.setBounds(320,110,150,45);
                 lstam.setBounds(320,145,150,45);
                 ltotal.setBounds(320,180,150,45);
                lnat.setBounds(320,215,150,45);
              
             
                tpf.setBounds(475,15,150,23);
                tewf.setBounds(475,50,150,23);
                 tgi.setBounds(475,85,150,23);
                 tit.setBounds(475,120,150,23);
                 tstam.setBounds(475,155,150,23);
                 total.setBounds(475,190,150,23);
                 tnat.setBounds(475,225,150,23);





                panel.setBorder(BorderFactory.createLineBorder(Color.red));
                panel1.setBorder(BorderFactory.createLineBorder(Color.black));
                panel2.setBorder(BorderFactory.createLineBorder(Color.red));
                panel3.setBorder(BorderFactory.createLineBorder(Color.red));                   
                panel1.setBackground(Color.red);
              




               panel2.add(lid);
               panel2.add(tid);
               panel2.add(lname);
               panel2.add(tname);
               panel2.add(ldes);
               panel2.add(tdes);
               panel2.add(lscale);
               panel2.add(tscale);
             
           
    
               panel3.add(tcca);
               panel3.add(lbasic);
               panel3.add(tbasic);
               panel3.add(lda);
               panel3.add(tda);
               panel3.add(lmed);
               panel3.add(tmed);
               panel3.add(lhra);
               panel3.add(thra);
               panel3.add(tgross);
               panel3.add(lgross);
               panel3.add(lpf);
               panel3.add(tpf);
               panel3.add(tewf);
               panel3.add(lewf);
               panel3.add(tgi);
               panel3.add(lgi);
               panel3.add(tit);               
               panel3.add(lit);
               panel3.add(lstam);
               panel3.add(tstam);
               panel3.add(total);
               panel3.add(ltotal);
               panel3.add(tnat);
               panel3.add(lnat);
               panel3.add(lcca);

               panel4.add(bsave);
               panel4.add(bcal);
               panel4.add(bexit);
               setTitle("Salary-Structure");
	setLayout(null);
	setVisible(true);
	setSize(790,710);
	setLocation(270,0);

}

public static void main(String[] args)
	{
	new SalaryStruct();
	}


}







      
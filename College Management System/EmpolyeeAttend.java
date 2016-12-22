import java.awt.*;
import javax.swing.*;

public class EmpolyeeAttend extends JFrame
{
   JPanel panel1=new JPanel();
   JPanel panel2=new JPanel();
   JPanel panel3=new JPanel();
   JPanel panel4=new JPanel();

   JLabel ltitle=new JLabel("EMPOLYEE DAILY ATTENDANCE WINDOW");
   JLabel lid=new JLabel("Empolyee ID");
   JLabel lname=new JLabel("Empolyee Name");
   JLabel ldate=new JLabel("Date");
   JLabel lmon=new JLabel("Month");
   JLabel lyr=new JLabel("Year");
   
  
   JRadioButton rd1=new JRadioButton("Absent",false);
   JRadioButton rd2=new JRadioButton("Present",false);


   JButton bsave=new JButton("Save");	
   JButton bsearch=new JButton("Change");
   JButton bexit=new JButton("Exit");

    ButtonGroup btngroup=new ButtonGroup();
    Font fnt=new Font("Times New Roman",Font.BOLD,20);

    
        JTextField tid=new JTextField(20);
        JTextField tdate=new JTextField(20);
        JTextField tname=new JTextField(20);  
        JTextField tmon=new JTextField(20);
        JTextField tyr=new JTextField(20);


EmpolyeeAttend()
	{
               panel1.setLayout(null);
               panel1.add(lid);
               panel1.add(tid);
               panel1.add(lname);
               panel1.add(tname);
               panel1.add(ldate);
               panel1.add(tdate);
               panel1.add(lmon);
               panel1.add(tmon);
               panel1.add(lyr);
               panel1.add(tyr);
   
	this.add(panel1);
                panel1.add(panel2);panel1.add(panel3);panel1.add(panel4);
                panel2.add(ltitle);
                ltitle.setFont(fnt);
	panel1.setBounds(20,20,700,565);
                panel2.setBounds(150,20,430,35);
                panel1.add(panel3);
                panel1.add(panel4);
                panel4.add(bsave);
                panel4.add(bsearch);
                panel4.add(bexit);
                panel3.setBorder(BorderFactory.createTitledBorder("Status"));
                panel4.setBorder(BorderFactory.createTitledBorder("Record"));
                panel3.setBounds(90,330,500,100);
                panel4.setBounds(90,450,500,100);
                lid.setBounds(150,65,150,45);
                lname.setBounds(150,95,150,45);
                ldate.setBounds(150,130,150,45);
                lmon.setBounds(150,165,150,45);
                lyr.setBounds(150,200,150,45);
            
               tid.setBounds(270,75,150,23);
               tname.setBounds(270,110,150,23);
               tdate.setBounds(270,145,150,23);
               tmon.setBounds(270,180,150,23);
               tyr.setBounds(270,215,150,23);
                
               
               btngroup.add(rd1); btngroup.add(rd2);

	panel3.add(rd1);
	panel3.add(rd2); panel1.setBorder(BorderFactory.createLineBorder(Color.black));
                panel1.setBorder(BorderFactory.createLineBorder(Color.red));

                panel2.setBorder(BorderFactory.createLineBorder(Color.black));
 
             
	setTitle("EMPOLYEE DAILY ATTENDANCE");
	setLayout(null);
	setVisible(true);
	setSize(750,650);
	setLocation(270,0);

             panel2.setBackground(Color.red);





        }

	public static void main(String[] args)
	{
	new EmpolyeeAttend();
	}




}
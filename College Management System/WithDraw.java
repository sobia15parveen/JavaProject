import java.awt.*;
import javax.swing.*;

public class WithDraw extends JFrame
{
 Font fnt=new Font("Monotype Simple",Font.BOLD,15);
       
        
JPanel panel1=new JPanel();
JPanel panel2=new JPanel();
JPanel panel3=new JPanel();
JLabel withdraw =new JLabel("Withdraw");
JLabel lbname=new JLabel("Book Name");
JLabel laname=new JLabel("Author Name");
JLabel lqual=new JLabel("Quality");

JTextField tbname=new JTextField(20);
JTextField taname=new JTextField(20);
JTextField tqual=new JTextField(20);

JButton bd=new JButton("Withdraw");
JButton be=new JButton("Exit");

WithDraw()
{
this.add(panel1);
panel1.add(withdraw);
panel1.add(panel2);
panel2.add(panel3);

panel1.setBackground(Color.pink);
panel2.setBackground(Color.red);
panel3.setBackground(Color.red);
panel2.add(lbname);
panel2.add(laname);
panel2.add(lqual);
panel2.add(tbname);
panel2.add(taname);
panel2.add(tqual);


panel3.add(be);
panel3.add(bd);
lbname.setFont(fnt);
laname.setFont(fnt);
lqual.setFont(fnt);
panel1.setLayout(null);
panel2.setLayout(null);
panel3.setLayout(new GridLayout(1,2,5,0));

panel1.setBounds(0,0,470,470);
panel2.setBounds(30,30,390,400);
panel3.setBounds(60,300,270,80);

lbname.setBounds(10,20,150,45);
laname.setBounds(10,105,150,45);
lqual.setBounds(10,185,150,45);

tbname.setBounds(170,20,160,66);
taname.setBounds(170,105,160,66);
tqual.setBounds(170,190,160,66);
withdraw.setBounds(40,0,150,35);
withdraw.setFont(fnt);




               setTitle("Stock");
	setLayout(null);
	setVisible(true);
	setSize(480,480);
	setLocation(290,250);





}





public static void main(String[] args)
	{
	new WithDraw();
	}


}






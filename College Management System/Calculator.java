import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame
{

Calculator()
{


JMenuBar mbar = new JMenuBar();
setJMenuBar(mbar);

JMenu view = new JMenu("View");
JMenuItem item1,item2,item3;
view.add(item1 = new JMenuItem("Scientific"));
view.add(item2 = new JMenuItem("Standard"));
view.add(item3 = new JMenuItem("Basic"));
mbar.add(view);
                          
JMenu edit = new JMenu("Edit");
JMenuItem item4,item5,item6;
edit.add(item1 = new JMenuItem("Copy    ctrl+c"));
edit.add(item2 = new JMenuItem("Paste   ctlr+v"));
edit.add(item3 = new JMenuItem("History"));
mbar.add(edit);



JMenu help = new JMenu("Help");
JMenuItem item7,item8;
help.add(item1 = new JMenuItem("View help    F1"));
help.add(item2 = new JMenuItem("About Calculator"));
mbar.add(help);












JPanel panel1=new JPanel();
JPanel panel2=new JPanel();
 Font fnt=new Font("Times New Roman",Font.BOLD,24);
JTextField text=new JTextField(50);
JButton bon=new JButton("On");
JButton bclr=new JButton("CLR");
JButton be=new JButton("Exit");

JButton b0=new JButton("0");
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("7");
JButton b8=new JButton("8");
JButton b9=new JButton("9");
JButton b10=new JButton("/");
JButton b11=new JButton(".");
JButton b12=new JButton("-");
JButton b13=new JButton("+");
JButton b14=new JButton("=");
JButton b15=new JButton("*");


this.add(panel1);
this.add(panel2);
this.setLayout(null);
panel2.setLayout(new GridLayout(4,4));
this.add(text);
panel1.add(bon);
panel1.add(bclr);
panel1.add(be);

panel2.add(b0);
panel2.add(b1);
panel2.add(b2);
panel2.add(b3);
panel2.add(b4);
panel2.add(b5);
panel2.add(b6);
panel2.add(b7);
panel2.add(b8);
panel2.add(b9);
panel2.add(b10);
panel2.add(b11);
panel2.add(b12);
panel2.add(b13);
panel2.add(b14);
panel2.add(b15);
text.setBounds(10,40,300,60);
panel1.setBounds(40,110,200,35);
panel2.setBounds(7,150,320,150);
panel2.setFont(fnt);
 

   setTitle("Calclator");
   setLayout(null);
   setVisible(true);
   setSize(350,380);
   setLocation(320,200);
}


public static void main(String[] args)
	{
	new Calculator();
                }

}

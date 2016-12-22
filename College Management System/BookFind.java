import java.awt.*;
import javax.swing.*;

public class MainForm extends JFrame
{
 Font fnt=new Font("Monotype Simple",Font.BOLD,10);
       
        
JPanel panel=new JPanel();

JButton cf=new JButton("Customer's Form");
JButton sv=new JButton("Services");
JButton bf=new JButton("Booking Form");
JButton bl=new JButton("Billing Form");
JButton log=new JButton("Logout");

MainForm()
{
this.add(panel);


panel.add(cf);
panel.add(sv);
panel.add(bf);
panel.add(bl);
panel.add(log);

panel.setLayout(null);
panel.setBounds(0,0,470,470);

cf.setBounds(170,20,160,66);
sv.setBounds(170,105,160,66);
bf.setBounds(170,190,160,66);
bl.setBounds(40,0,150,35);
log.setFont(fnt);

setTitle("Welcome to Main Form");
setLayout(null);
setVisible(true);
setSize(480,480);
setLocation(290,250);

}

public static void main(String[] args)
	{
	new MainForm();
	}


}






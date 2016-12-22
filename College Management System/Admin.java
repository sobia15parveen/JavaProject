import java.awt.*;
import javax.swing.*;

public class Admin extends JFrame
{
JMenuBar bar=new JMenuBar();

JMenu fileM=new JMenu("Administrator");
JMenuItem fileM1=new JMenuItem("Log Out");
JMenuItem fileM2=new JMenuItem("Log In");
JMenuItem fileM3=new JMenuItem("User Create");
JMenuItem fileM4=new JMenuItem("Exit");


JMenu studentM=new JMenu("Student");
JMenuItem studentM1=new JMenuItem("Student Enquiry");
JMenuItem studentM2=new JMenuItem("Student Admission");
JMenuItem studentM3=new JMenuItem("Identity Card");
JMenuItem studentM4=new JMenuItem("Student Attendence");
JMenuItem studentM5=new JMenuItem("Program Detail");
JMenuItem studentM6=new JMenuItem("Fee Structure");
JMenuItem studentM7=new JMenuItem("Fee Submission");

JMenu employeeM=new JMenu("Employee");
JMenuItem employeeM1=new JMenuItem("Employee Detail");
JMenuItem employeeM2=new JMenuItem("Employee Attendence");
JMenu employeeM3=new JMenu("Salary");
JMenuItem employeeM31=new JMenuItem("Salary Structure");
JMenuItem employeeM32=new JMenuItem("Salary Calculate");
JMenuItem employeeM33=new JMenuItem("Salary Advance");
JMenuItem employeeM4=new JMenuItem("Shift Table");

JMenu libraryM=new JMenu("Library");
JMenuItem libraryM1=new JMenuItem("Stock");
JMenuItem libraryM2=new JMenuItem("Withdraw");
JMenuItem libraryM3=new JMenuItem("Deposit");
JMenuItem libraryM4=new JMenuItem("Book Fund");

JMenu reportM=new JMenu("Report/Enquiry");
JMenuItem reportM1=new JMenuItem("Employee List");
JMenuItem reportM2=new JMenuItem("Student List");
JMenuItem reportM3=new JMenuItem("Book Detail");

JMenu toolsM=new JMenu("Tools");
JMenuItem toolsM1=new JMenuItem("Editor");
JMenuItem toolsM2=new JMenuItem("Calculator");

JMenu helpM=new JMenu("Help");
JMenuItem helpM1=new JMenuItem("Contact us");
JMenuItem helpM2=new JMenuItem("About");

Admin()
{
fileM.add(fileM1);
fileM.add(fileM2);
fileM.add(fileM3);
fileM.add(fileM4);
bar.add(fileM);

studentM.add(studentM1);
studentM.add(studentM2);
studentM.add(studentM3);
studentM.add(studentM4);
studentM.add(studentM5);
studentM.add(studentM6);
studentM.add(studentM7);
bar.add(studentM);

employeeM.add(employeeM1);
employeeM.add(employeeM2);
employeeM.add(employeeM3);
employeeM3.add(employeeM31);
employeeM3.add(employeeM32);
employeeM3.add(employeeM33);
employeeM.add(employeeM4);
bar.add(employeeM);

libraryM.add(libraryM1);
libraryM.add(libraryM2);
libraryM.add(libraryM3);
libraryM.add(libraryM4);
bar.add(libraryM);

reportM.add(reportM1);
reportM.add(reportM2);
reportM.add(reportM3);
bar.add(reportM);

toolsM.add(toolsM1);
toolsM.add(toolsM2);
bar.add(toolsM);

helpM.add(helpM1);
helpM.add(helpM2);
bar.add(helpM);
setJMenuBar(bar);
setVisible(true);
setSize(800,700);

}

public static void main(String[] args)
{
new Admin();
}
}
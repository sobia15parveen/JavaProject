import java.awt.*;
import javax.swing.*;
class MenuFrame extends JFrame
{
MenuFrame() 
{
JMenuBar mbar = new JMenuBar();
setJMenuBar(mbar);

JMenu admin = new JMenu("Administrator");
JMenuItem item1,item2,item3,item4;
admin.add(item1 = new JMenuItem("Logout"));
admin.add(item2 = new JMenuItem("Login"));
admin.add(item3 = new JMenuItem("User Id"));
admin.add(item4 = new JMenuItem("Exit"));
mbar.add(admin);
                          
JMenu student = new JMenu("Student");
JMenuItem item5,item6,item7,item8,item9,item10,item11;
student.add(item5 = new JMenuItem("Student Enquiry"));
student.add(item6 = new JMenuItem("Student Admission"));
student.add(item7 = new JMenuItem("Identity Card"));
student.add(item8 = new JMenuItem("Student Attendence"));
student.add(item9 = new JMenuItem("Program Detail"));
student.add(item10 = new JMenuItem("Fee Structure"));
student.add(item11 = new JMenuItem("Fee submission"));
mbar.add(student);


JMenu empl = new JMenu("Employee");
JMenuItem item12,item13,item14;
empl.add(item12 = new JMenuItem("Employee Detail"));
empl.add(item13 = new JMenuItem("Employee Attendence"));
empl.add(item14 = new JMenuItem("Shift time"));
mbar.add(empl);
JMenu salary = new JMenu("Salary");
JMenuItem item15,item16,item17;
salary.add(item15 = new JMenuItem("Salary Structure"));
salary.add(item16 = new JMenuItem("Salary Calculate"));
salary.add(item17 = new JMenuItem("Salary Advance"));
empl.add(salary);


JMenu lib = new JMenu("Library");
JMenuItem item18,item19,item20,item21;
lib.add(item18 = new JMenuItem("Stock"));
lib.add(item19 = new JMenuItem("Withdraw"));
lib.add(item20 = new JMenuItem("Book fund"));
lib.add(item21 = new JMenuItem("Deposit"));
mbar.add(lib);


JMenu report = new JMenu("Report/Enquiry");
JMenuItem item22,item23,item24;
report.add(item22 = new JMenuItem("Empoyee list"));
report.add(item23 = new JMenuItem("Student list"));
report.add(item24 = new JMenuItem("Book detail"));
mbar.add(report);

JMenu tools = new JMenu("Tools");
JMenuItem item25,item26,item27;
tools.add(item25 = new JMenuItem("Editor"));
tools.add(item26 = new JMenuItem("Calculator"));
mbar.add(tools);


JMenu help = new JMenu("Help");
JMenuItem item28,item29;
help.add(item28 = new JMenuItem("Contact Us"));
help.add(item29 = new JMenuItem("About"));
mbar.add(help);


setSize(800,500);
setVisible(true);
}

public static void main(String arr[])
{
new MenuFrame();

}
}














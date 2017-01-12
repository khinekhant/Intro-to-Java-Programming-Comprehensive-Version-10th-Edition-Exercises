package payroll;
import javax.swing.JOptionPane;
public class payrolldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
personalinfo person= new personalinfo("KK",11411);

String hinput=JOptionPane.showInputDialog("Enter the hours u hav worked today");
double hours=Double.parseDouble(hinput);
String rinput=JOptionPane.showInputDialog("Enter the hourly rate that u earn");
double rate=Double.parseDouble(rinput);

double totalpay=person.grosspay(hours, rate);
System.out.println("$"+totalpay);

	}

}

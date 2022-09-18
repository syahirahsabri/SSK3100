//Authors name: NOOR SYAHIRAH BINTI MOHD SABRI
//Matric Number: 207542
//Assignment: 1
import javax.swing.JOptionPane;

public class Runway_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//read input from the user
		String v = JOptionPane.showInputDialog(null, "Enter the speed, v: ", "Input from user", JOptionPane.QUESTION_MESSAGE);
		double newv = Double.parseDouble(v);
		String a = JOptionPane.showInputDialog(null, "Enter the acceleration, a: ","Input from user", JOptionPane.QUESTION_MESSAGE);
		double newa = Double.parseDouble(a);
		
		double length = newv*newv/(2*newa);
		JOptionPane.showMessageDialog(null,String.format("The minimum runway length is: %.2f", length));
	}

}

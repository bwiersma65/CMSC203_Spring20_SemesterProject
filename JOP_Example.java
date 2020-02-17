import javax.swing.JOptionPane;

/*
 *  Sample code to display how JOPtionPane dialog boxes work in Swing in Java
 */
public class JOP_Example {

	public static void main(String[] args) {

		String input;
		double base, exponent;
		double power;
		int repeat;
		
		/*
		 * In all of the following methods, the first parameter represents the graphical
		 * component in which the dialog box will be displayed. By passing a null value,
		 * you can set the box to be displayed in the center of the screen upon execution
		 */
		
		JOptionPane.showMessageDialog(null, "This program will calculate the power of a base raised to an exponent", 
										"Power Program", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			
			input = JOptionPane.showInputDialog(null, "Enter the base number: ");
			
			base = Integer.parseInt(input);
			
			input = JOptionPane.showInputDialog(null, "Enter the exponent: ");
			
			exponent = Integer.parseInt(input);
			
			power = Math.pow(base, exponent);
			
			JOptionPane.showMessageDialog(null, "The result of " + base 
											+ " raised to the power of " + exponent + " is " + power);
			
			repeat = JOptionPane.showConfirmDialog(null, "Would you like to calculate another power?", 
													"Please Confirm", JOptionPane.YES_NO_OPTION);
		}
		while (repeat == JOptionPane.YES_OPTION);
		
		System.exit(0);
	}

}

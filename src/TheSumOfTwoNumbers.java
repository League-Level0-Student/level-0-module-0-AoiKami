import javax.swing.JOptionPane;

public class TheSumOfTwoNumbers {
	public static void main(String[] args) {
		String Number1 = JOptionPane.showInputDialog("Provide me a number");
		int Number12 = Integer.parseInt(Number1);
			String Number2 = JOptionPane.showInputDialog("Provide me a second number");
			int Number21 = Integer.parseInt(Number2);
				int X = Number12 + Number21;
					System.out.println(X);
					JOptionPane.showMessageDialog(null, X);
						
				
	}

}

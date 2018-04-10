import javax.swing.JOptionPane;

public class Weekday {
	public static void main(String[]args) {
		String userAnswer = JOptionPane.showInputDialog("Is it a weekday?");
		if(userAnswer.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "You should sleep in.");
		}
				if(userAnswer.equals("No")) {
					JOptionPane.showMessageDialog(null, "WAKE UP!.");
				}else {
					JOptionPane.showMessageDialog(null, "Your Answer is Invalid");
					
				}
			
	}

}

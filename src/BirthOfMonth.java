import javax.swing.JOptionPane;

public class BirthOfMonth {
	public static void main(String[]args) {
		JOptionPane.showMessageDialog(null, "Hello Stanger!");
			String userAnswer = JOptionPane.showInputDialog("If you don't mind me asking what month were you born on?");
			if(userAnswer.equalsIgnoreCase("September")) {
				JOptionPane.showMessageDialog(null, "Awesome your were born on the same month as me :3");
			}else {
					JOptionPane.showMessageDialog(null, "Trashy Birth Month!"); 
			}
	}
}
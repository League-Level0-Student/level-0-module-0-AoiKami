import javax.swing.JOptionPane;

public class Code {
	public static void main(String[]args) {
		String userAnswer = JOptionPane.showInputDialog("Do you know how to code?");
			if(userAnswer.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "YOU SHALL BRING WORLD DOMINATION!");
			}else {
					JOptionPane.showMessageDialog(null, "Boring....."); 
			}
	}
}

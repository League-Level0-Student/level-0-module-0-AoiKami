import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[]args) {
		JOptionPane.showMessageDialog(null, "Greetings Friend!");
			String numName = JOptionPane.showInputDialog("What is your name kind friend?");
				JOptionPane.showMessageDialog(null, "Hello " + numName + " its nice to meet you! :)");
	}

}

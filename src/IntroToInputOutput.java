import javax.swing.JOptionPane;

public class IntroToInputOutput { 
	public static void main(String[]args) {
		JOptionPane.showMessageDialog(null, "GHOUL");
			String numGhoul = JOptionPane.showInputDialog("What type of meat would you like to eat?");
				JOptionPane.showMessageDialog(null, "YES!" + numGhoul + "ITS DELICOUS!");
						System.out.println(numGhoul);
					
					
}

}


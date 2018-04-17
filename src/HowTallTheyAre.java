import javax.swing.JOptionPane;

public class HowTallTheyAre {
	public static void main(String[] args) {
		String Height = JOptionPane.showInputDialog("How tall are you?");
			int Height60 = Integer.parseInt(Height);
				if (Height60 > 50 ) {
					JOptionPane.showMessageDialog(null, "You can ride the roller coaster!");
						}else {
							JOptionPane.showMessageDialog(null, "You can't ride on the roller coaster!");
		}
	}
}



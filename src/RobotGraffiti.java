import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	public static void main(String[] args) throws Exception {
		
		Robot Genos = new Robot();
		
		Genos.penDown();
		
		Genos.miniaturize();
		
		Genos.setSpeed(10);
		
		Genos.move(100);
		
		Genos.turn(180);
		
		Genos.move(100);
		
		Genos.turn(180);
		
		Genos.turn(90);
		
		Genos.move(100);
		
		Genos.turn(270);
		
		Genos.move(200);
		
		Genos.penUp();
		
		Genos.turn(90);
		
		Genos.move(50);
		
		Genos.penDown();
		
		Genos.move(100);
		
		Genos.turn(180);
		
		Genos.move(50);
		
		Genos.turn(270);
		
		Genos.move(200);
		
		
		
		
		
	}
}

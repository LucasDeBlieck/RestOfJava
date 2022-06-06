import java.awt.Frame;

public class Program {
	
	public static void Main(String[] args) {
		System.out.println("Hello Java UI Demo");
		
		Frame myFrame = new Frame("Java UI Demo");
		myFrame.setSize(800, 600);
		myFrame.setVisible(true);
		
		System.out.println("Goodbye!");
	}
}

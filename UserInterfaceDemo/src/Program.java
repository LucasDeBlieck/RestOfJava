import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.TextArea;

public class Program {

private static 	Frame myFrame = new Frame("Java UI Demo");	
	private static final int _padding = 10;
	private static Button myButton = new Button("My First Button!");
	private static TextArea myTextArea = new TextArea();
	private static MyListener myListener = new MyListener(myTextArea);

	public static void main(String[] args) {
		System.out.println("Hello Java UI Demo");

	
		myFrame.setSize(800, 600);
		myFrame.setVisible(true);

		
		myFrame.addWindowListener(myListener);
		myFrame.setLayout(null);

		Dimension d = myFrame.getSize();
		System.out.println(d);
		Insets i = myFrame.getInsets();
		System.out.println(i);

		
		myButton.setBounds(i.left + _padding, i.top + _padding, 100, 40);

		myFrame.add(myButton);
		myButton.setBackground(Color.cyan);
		myButton.addActionListener(myListener);

		
		int xAnchor = myButton.getX();
		int yAnchor = myButton.getY() + myButton.getHeight() + _padding;
		myTextArea.setBounds(xAnchor, yAnchor, myFrame.getWidth() - i.left - i.right - 2 * _padding,
				myFrame.getHeight() - yAnchor -i.bottom - _padding);
		myFrame.add(myTextArea);
		System.out.println("Goodbye!");
		myTextArea.setBackground(Color.gray);
	}
}

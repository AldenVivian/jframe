package jframe;
import java.awt.*;
import javax.swing.*;
public class fruit extends JFrame {
	
	private JLabel item1;
	
	public fruit()
	{
		super("this is the title");
		
		setLayout(new FlowLayout());
		
		item1 = new JLabel("lool");
		
		item1.setToolTipText("u are hovering over lool");
		
		add(item1);
	}

}

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
	private int count = 0;
	private Label l;
	private Button b1;
	private Button b2;

	public MyFrame()
	{
		super("Counter App");
		setLayout(new FlowLayout());
		setSize(300,400);
		
		b1 = new Button("Subtract");
		l = new Label("   "+count);
		b2 = new Button("Add");
		
		// Registering the listener with the component
		b1.addActionListener(this);
		b2.addActionListener(this);

		add(b1);
		add(l);
		add(b2);

		setVisible(true);

	}


	@Override 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand() == "Add")
		{
			count++;
			l.setText("    "+count);
		}else{
			count--;
			l.setText("    "+count);
		}
	}
		

}

public class Main_04 {

	public static void main(String... args) {
		new MyFrame();
	}

}

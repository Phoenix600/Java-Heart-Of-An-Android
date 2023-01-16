import java.awt.*;
import java.awt.event.*;


/**
 * Event Handelling in Java Abstract Window ToolKit 
 * 
 * 
 * #TODO: Event Delegation Model 
 * Creating the Counter app 
 */


class MyFrame extends Frame implements ActionListener
{
	int count = 0;
	Label l;
	Button b;

	public MyFrame()
	{
		super("CounterApp");
		l = new Label("    "+count);
		b = new Button("Click");
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(l);
		add(b);
		

	
	
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		count++;
		l.setText("   "+count);
	}	
}


public class Main_03 {

    public static void main(String...args)
    {
		MyFrame frame = new MyFrame();
		frame.setSize(400,500);
		frame.setVisible(true);
	
    }
    
}

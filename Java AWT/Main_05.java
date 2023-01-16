import java.awt.*;
import java.awt.event.*;


/*
	Checkbox and radio-button in the java AWT 
*/


class MyFrame extends Frame  implements ItemListener
{
	Label l;
	Checkbox c1,c2,c3;
	
	public MyFrame()
	{
		super("Checkbox Title");
		l  = new Label("                               ");
		c1 = new Checkbox("Java");
		c2 = new Checkbox("C");
		c3 = new Checkbox("Python");

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}

	
	@Override 
	public void itemStateChanged(ItemEvent e)
	{
		String str = "";
		
		if(c1.getState() == true)
		{
			str += " " + c1.getLabel();
		}

		if(c2.getState() == true)
		{
			str += " " + c2.getLabel();
		}

		if(c3.getState() == true)
		{
			str += " " + c3.getLabel();
		}	

		if(str.isEmpty())
		{
			str = "Nothing is selected";
		}

		l.setText(str);
	}

}


class Main_05 
{
	public static void main(String...args)
	{
		MyFrame F = new MyFrame();
		F.setSize(300,400);
		F.setVisible(true);
	}
}

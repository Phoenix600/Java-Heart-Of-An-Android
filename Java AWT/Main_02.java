import java.awt.*;


/**
 * Methods 2: To work with the Java GUI applications 
 * #TODO: This is recomended Method 
 */
class MyFrame extends Frame 
{
    Label l;
    TextField tf;
    Button b;

    public MyFrame()
    {
        super("MyApp"); // Frames Constructor is called 
        setLayout(new FlowLayout());
        // setSize(400,500);

        l = new Label("Name : ");
        tf = new TextField(20);
        b = new Button("OK");

        add(l);
        add(tf);
        add(b);

        // setVisible(true);

    }

}

public class Main_02 {

    public static void main(String...args)
    {
        MyFrame f = new MyFrame();
        f.setSize(400,500);
        f.setVisible(true);
    }
    
}

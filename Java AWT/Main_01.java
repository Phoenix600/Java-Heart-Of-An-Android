import java.awt.*;

class MyApp
{
    private String title;
    private String bName;
    private String sampleText;

    public MyApp(String title, String bName, String sampleText)
    {
        this.title = title;
        this.bName = bName;
        this.sampleText = sampleText;

        init();
    }

    public void init()
    {
        Frame F = new Frame(title);
        F.setSize(400,250);
        F.setLayout(new FlowLayout());

        Label L = new Label(sampleText);
        Button B = new Button(bName);
        TextField TF = new TextField(20);

        F.add(L);
        F.add(TF);
        F.add(B);

        F.setVisible(true);
    }
}

class Main_01
{
    public static void main(String...args)
    {
        Frame F = new Frame("Universe");
        F.setLayout(new FlowLayout());

        Button B = new Button("Make A Wish");        
        Label L = new Label("Your wish has been granted");
        TextField TF = new TextField(20);

        F.add(L);
        F.add(TF);
        F.add(B);


        F.setSize(300,200);
        F.setVisible(true);

        new MyApp("Universe","Make A wish","Your wish has been granted");

    }
}
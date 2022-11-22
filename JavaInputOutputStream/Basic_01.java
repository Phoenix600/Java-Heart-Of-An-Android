import java.io.*;

class Read
{
  String str = "Getting Started with Java Input And Output streams";


  void readerEvent()
  {
    byte memo_buff[] = str.getBytes();
    ByteArrayInputStream bais = new ByteArrayInputStream(memo_buff);

    int i;

    while( (i=bais.read()) != -1)
    {
      System.out.print((char)i);
    }
  }
}

class Write
{
    String str = "Death is the only way to life";
    
    void WriterEvent()
    {
        try{
            FileOutputStream fos = new FileOutputStream("sample.txt");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            baos.write(str.getBytes());
            baos.writeTo(fos);
            baos.flush();
            baos.close();

        }catch(Exception e){

          e.printStackTrace();
        }
    }
}


class PrinterClass
{
  String str = "This is default string to printed";

  void outputData()
  {
    try{
      FileOutputStream fos = new FileOutputStream("sample1.txt");
      ByteArrayOutputStream baos = new ByteArrayOutputStream();

      baos.write(str.getBytes());
      baos.writeTo(fos);
      baos.flush();
      baos.close();

    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public PrinterClass(String str)
  {
    this.str = str;
    outputData();
  }
}

class MyScanner 
{
  String str;

  void readHandler()
  {
    byte memo[] = str.getBytes(); 
    ByteArrayInputStream baos = new ByteArrayInputStream(memo);
  
    // baos named iterator is created 
    int i;

    while((i=baos.read())!= -1)
    {
      System.out.print((char)i);
    }

  }

  public MyScanner(String str)
  {
    this.str = str;
  }
}

class Main 
{
  public static void main(String...args)
  {

    // Test-Code : 01 
    // Reading the data 
    // Read R = new Read();
    // R.readerEvent();

    // Test-Code : 02
    // Writing the data 
    // Write W = new Write();
    // W.WriterEvent();

  
    // MyScanner Scanner = new MyScanner("The most blessed ones, are the most cursed ones\n");
    // Scanner.readHandler();

    PrinterClass PrintFile = new PrinterClass("Life's Mess");

  }
}

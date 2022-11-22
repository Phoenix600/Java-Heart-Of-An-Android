import java.io.*;

class Addition 
{
    int a;
    int b;
    int sum;
}

class Bank
{
    String name;
    int acc_number;
    String username;
    String password;
}

class Main
{
    public static void main(String[] args) {
            Bank B = new Bank();

            B.username = "Pranay Ramtek";
            B.acc_number = 121212;
            B.password = "GOD KNOWS";

            // Getting Started With The File IO Stream            
            Addition A = new Addition();
            A.a = 12;
            A.b = 14;
            A.sum = A.a + A.b;

            // Creating the connection between the program and file is stream 
            // Stream is a logical connection between java program and the file through 
            // which we can write and read the data back & front to java prog and file.

            /*
             * Notes : 
             * ------
             *  1) Must use sperate streams for input and outpu stream 
             *  2) There are two types of streams : 
             *          a) A stream who sends the value is called the output stream 
             *          b) A stream which receives the value is called the input stream  
             *  3) Writing the data based on the java application view is output stream 
             *  4) Retriving the data into java application view is input stream
             *  NOTE :  Don't look at the stream concept from the file point of view 
             *  
             *  5) Pipes : 
             *  ==========
             *      Pipe for sending the water  is called water pipe.
             *      Pipe for sending the petrol is called petrol pipe.
             *      Pipe for sending the gas is called a gas pipe.
             *      Pipe for sendning the kerosene is kerosene pipe.
             *      
             *      basically a pipe is called a pipe, what you are sending throught the pipe is important 
             *      based on what you are sending through the pipe , gives us the main name of the pipe.      
             * 
             *      In Java Programming, We can send the data in the form of binary values, character values
             *         i) Binary Fomrat 
             *        ii) Character Format
             *         
             *        i)  * If we are sending the data from java programe to the file, in the binary format 
             *              then that stream is callled as binary-output stream 
             *              
             *              * If we are reading the data from the java program to the file, in the binary format
             *              then that stream is called as binary-input stream 
             * 
             *          ----------------------------------------------------------------------------------------------------       
             * 
             *        ii)  * If we are sending the dat from the java program to the file, in the character format 
             *               then that stream is called as charcter-output stream 
             *             
             *              * If we are reading the data from the java programe to the file, in the character fomrat 
             *               then that stream is called as character-input stram
             *                 
             *       #[CAUTION]#
             *       -----------
             *        There are two levels on types of streams 
             *         1) Based on the direction of the flow
                                inputStream 
                                outputStream  
             *         2) Based on the type of the value flow
             *                  binaryStream        :   binaryOutputStream & binaryInputStream
                                characterStream     :   Reader : To read data from file 
                                                        Writer : To write data in the file
             *

                                               =========================
                                              # J-A-V-A  S-T-R-E-A-M-S #
                                              ===========================
                                                    /            \
                                                   /              \
                                         binary Stream      Character Stream  
                                         /       \                /       \ 
                                        /         \              /         \
                                       /           \            /           \
                                 InputStream  outputstram  Reader        Writer              
                                    \               \      /                /  
                                     \               \    /                / 
                                      \               \  /                /
                                       \               \/                /
                                        \              /\               /
                                         \            /  \             /
                                          \          /    \           /   
                                           \        /      \         /
                                            \      /        \       /
                                             \    /          \     /
                                              READ           WRITING                             
             
             
             There are two types of streams : Binary and Character stream 
             Again the binary streams and character streams are divided into two types 
             1) Output stream / Writer
             2) Input Stram / Reader


            Two operations:  Read and wirte we will be performing the I/O stream 
            The logic of these method is coded in the methods              
            
            Read() method is available in inputStream classes  & Reader classes
            Write() method is available in outputStream classes & Writer Classes

            

             */                             

    }
}
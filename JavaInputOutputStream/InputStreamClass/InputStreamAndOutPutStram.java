/**

When you are reading the data from the resource, we use the inputStream

for the data from the inputStream java provides some, member function : 
    
    // ##################### READING OPERATION #######################
    
    1)* int read() // this will only read one byte from the stream, if the read function reaches to the end of the data stream, then it returns the -1
    
    2)* int read(byte[] b) : 
        This is also another version of the read() method, where we read the 
        data in byte array.

        Here now the read() will read the bytes according to the
        size of the byte array.
        It will read the number of bytes depending on the size of the 
        byte array
        
        Assusme if the size of the array is 5, at a time, read() will
        method will read the 5 Bytes of data 
    
    3)* int read(byte[] b,int OFSET,int len);
        Here you can start the reading the data from the desired postion 
        in the byte array, where index position is stored in the 'OFSET'

    ####################### GENERALIZED METHODS #########################

    1)* int available() :
        This method tells you the number bytes available in the resource 
    2) long skip(long n)
        This method will skips the number of the bytes 
    3) void mark(int limit) :
        Rather than discarding the data from the stram, we can use mark,
        just like and pointer which will point to the every next byte
        we can set the limit to read.
        Basically the limit sets, how long you want that mark to be active.
        for this we set the limit in mark();

    4) void reset() :
        mark() and rest() work together as they are related, reset() is used 
        to reset the mark in the data stream. Then again your program can start 
        reading the data from the stream 

        Once we, read the data from the stram, that data is removed / discarded
        from the stream 

    5) boolean markSupport() : 
        Not every stream supports mark, it possible only when the straem having the 
        buffer (Extra Memory for holding the data)
    6)* close() :
        After using resource, which is present in the stram, it 
        must be closed.

 */

 /**
    Outputstream  : 
        The program is having data and the programme is going to write 
        on the resource.
        Resource can be anything,socket in the network or file.

        For sending out the data  from porgram to the resource, we need the 
        output stream.

        Buffer is a temprory memory object

        ####################### OUTPUT STREAM METHODS #####################
        

  */
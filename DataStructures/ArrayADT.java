import lib.ArrayMethods;

class ArrayADT implements ArrayMethods {

    private int size = (int)1e7+3;
    private int length = 0;
    private int[] HASH = new int[(int)1e7+3];
    private int[] hashIndex = new int[(int)1e7+3];
    private int[] A = new int[size];

    public void append(int key) {
        if (length < size - 1 && length >= 0) {
            A[length++] = key;
        }

    }
    public void insert(int index, int key) {

      for(int i=length; i>index; i--)
      {
          A[i] = A[i-1];
      }   
      A[index] = key;
      length++;
    }

    public void delete(int index) {
        
        if(index < length && index >=0)
        {
              for(int i=index; i<length-1;i++)        
              {
                A[i] = A[i+1];
              }
             length--;
        }
        else{
            System.out.println("[X]Invalid Index");
        }
    }


    public void init()
    {
        for(int i=0; i<HASH.length; i++)
        {
            HASH[A[i]] = 1; 
        }

        for(int i=0; i<length; i++)
        {
            hashIndex[A[i]] = i;
        }

    }

    public int hashSearch(int element) {

        if(HASH[element] == 1)
        {
             return hashIndex[element];
        }
        return -1;

    }

    public void insertionSort()
    {
        int j, key;

        System.out.println("InsertionSort is Running");

        for(int i=1; i < length; i++)
        {
            key = A[i];
            j = i-1;
            
            while(key < A[j] && j >=0)
            {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;

        }

    }

    public void bubbleSort()
    {
        int temp;

        System.out.print("Running Bubble Sort\n");

        for(int i=0; i<length; i++)
        {
            for(int j=0; j<length-i-1;j++)
            {
                if(A[j] > A[j+1])
                {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        
    }
    public boolean isSorted() {

        for(int i=0; i<length-1; i++)
        {
          if(A[i] > A[i+1])
          {
            return false;          
          }
        }
        return true;
    }

    
    public int linearSearch(int key)
    {
            for(int i=0; i<length; i++)
            {
                if(key == A[i]) 
                        return i;
            }
            return -1;
    }

    
    public int binarySearch(int key)
    {
        int start = 0;
        int end = length-1;
        int midd;

        while(start<= end)
        {
               midd = (start + end) /2;
               if(key == A[midd])
               {
                   return midd;
               }
               else if(key > A[midd])
               {
                   start = midd + 1;
               }
               else 
               {
                   end = midd - 1;
               }
        }
       return -1; 
    }

    public int search(int key) {
        if(isSorted())
        {
            System.out.println("Using the Binary Search Algorithm");
            return binarySearch(key);
        }
        else{
            System.out.println("Using the Linear Search");
            return linearSearch(key);
        }
    }

    public int get(int index) {
        if(index < length && index >=0)
        {
            return A[index];
        }
        return -1;
    }

    public void set(int index, int key) {

        if(index < length && index >=0)
        {
            A[index]  = key;
        }

    }

    public int max() {
        int max = A[0];
        
        for(int i=1; i<length; i++)
        {
            if(A[i] > max)
            {
                max = A[i];
            }
        }

        return max;

    }

    public int min() {

        int min = A[0];

        for(int i=0; i < length; i++)
        {
            if(A[i] < min)
            {
                min = A[i];
            }
        }

        return min;

    }

    public int sum()
    {
        int sum =0;

        for(int i=0; i<length; i++)
        {
            sum += A[i];
        }

        return sum;
    }

    public double average()
    {
        return sum()/length;
    }

    public void reverse() {

        int temp;
        for(int i=0,j=length-1; i<j; i++, j--)
        {
              temp = A[i];
              A[i] = A[j];
              A[j] = temp;
        }

    }

    public void shiftToLeft(int RotateBy) {

        int temp;

        for(int i=0; i<RotateBy; i++)
        {
            temp = A[0];
            for(int j=0; j<length; j++)
            {
                   A[j] = A[j+1];
            }
            A[length -1] = temp; // right rotation

        }


    }

    public void shiftToRight(int RotateBy) {

        int temp;
        for(int i =0; i<RotateBy; i++)
        {
            
            temp = A[length-1];

            for(int j=length-1 ; j > 0; j--)
            {
                      A[j] = A[j-1];
            }
            A[0] = temp;
        }

    }

    public void display() {
        for (int i = 0; i < this.length; i++) {
            System.out.printf("%d ", A[i]);
        }
        System.out.println();
    }


}
class Main {
    public static void main(String[] args) {

        ArrayADT Arr = new ArrayADT();
        Arr.append(12);
        Arr.append(14);
        Arr.append(16);
        Arr.append(56);
        Arr.append(78);
        Arr.append(45);
        Arr.append(41);
        Arr.append(89);
        Arr.append(99);
        Arr.append(34);

        Arr.display();

        Arr.delete(4);
        Arr.delete(1212);
        Arr.delete(0);


        // Searching is done with the help of HASHING: Time Complexity : 0(N) for first search and later it will be 0(1) for every key to be searched 
        Arr.init();
        System.out.printf("\n45 Found At : %d\n",Arr.hashSearch(45));

        Arr.display();


        Arr.insert(3, 21);
        Arr.display();


        //Arr.insertionSort();
        Arr.bubbleSort();
        Arr.display();

        System.out.printf("\n34 is Found At : %d\n",Arr.search(34));


        Arr.reverse();
        Arr.display();
        
        Arr.reverse();

      //  Arr.shiftToRight(2);
        Arr.display();
        
        Arr.shiftToLeft(1);
        Arr.display();


    }
}
               
               

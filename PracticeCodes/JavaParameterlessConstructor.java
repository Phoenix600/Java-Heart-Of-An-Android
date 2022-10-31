
class NumberSeries
{
    int SUM;
    int PRODUCT;   

		void getSum()
		{
			System.out.println("[+]SUM 		: " + SUM);
		}

		void getProduct()
		{
			System.out.println("[+]Product 	: " + PRODUCT);
		}
}

class ArithmaticSeries extends NumberSeries
{
		int firstTerm;
		int commonDiff;
		int lastTerm;
		int nTerms;
	
		public ArithmaticSeries(int first_term, int common_diff, int n_terms)
		{
				firstTerm = first_term;
				commonDiff = common_diff;
				nTerms = n_terms;

				displayAPSeries();
				calSum();
				calProduct();
				super.getSum();
				super.getProduct();
		}

		void displayAPSeries()
		{
			 int first_term   = firstTerm;

			 System.out.print("Arithmatic Series : ");

			 for(int i=0; i< nTerms; i++)
			 {
			 	System.out.printf("%d ", first_term);
				first_term = first_term + commonDiff;
			 }
			 System.out.println("");
			 lastTerm = first_term;
		}

		void calSum()
		{	
			super.SUM = 0; // The variable SUM from super class
			int first_term = firstTerm;
			
			// There is another way to calculate the SUM using the mathematical formula.
			for(int i=0; i<nTerms; i++) 
			{
				 super.SUM = super.SUM + first_term;		
				 first_term  += commonDiff;
			}
				
		}

		void calProduct()
		{
				super.PRODUCT = firstTerm * lastTerm;
		}
}


/**
*  @brief GeometricProgression class inherited from the parent class NumberSeries 
* @method  
*	    1] displayGeometricSeries()
* 		2] calSum()
* 		3] calProduct()
*/
class GeometricProgression extends NumberSeries
{
		int firstTerm;
		int lastTerm;
		int commonRatio;
		int nTerms;
		
		public GeometricProgression(int first_term, int common_ratio, int n_terms)
		{
			firstTerm = first_term;
			commonRatio = common_ratio;
			nTerms = n_terms;

			displayGPSeries();
			calSum();
			calProduct();
			super.getSum();
			super.getProduct();

		}

		void displayGPSeries()
		{
			int temp = firstTerm;

			System.out.print("Geometric Series : ");
			for(int i=0; i< nTerms; i++)
			{
				System.out.printf("%d ", temp);
				temp = temp*commonRatio;  // Traversing for the next term in the sequence 
			}
			lastTerm = temp/3;   // Settping back to the orignal last term
			System.out.println(""); // Just added the newLine for the Formatting Purpose
			// The current value of the temp will be the last term in the GP
					
		}

		void calSum()
		{
		 		int temp = firstTerm;

				for(int i=0; i < nTerms; i++)
				{
					super.SUM = super.SUM + temp;
					temp = temp*commonRatio;
				}
		}

		void calProduct()
		{
			super.PRODUCT  = firstTerm * lastTerm;
		}

}

class FibonacciSeries extends NumberSeries{

	int nTerms;
	static int[] MEMORY = new int[20];
	
	public FibonacciSeries(int n_terms)
	{
		nTerms = n_terms;
		init(); // Intilizes the matrix to the -1 
		getFibonacciSeries(nTerms);
		printFibonacciSeries();
		calSum();
		calProduct();
		super.getSum();
		super.getProduct();

		
	}

	private void init()
	{
		for(int i=0; i<MEMORY.length; i++)
			MEMORY[i] = -1;
	}

	void getFibonacciSeries(int nTerms)
	{
	

		MEMORY[0] = 0;
		MEMORY[1] = 1;

		for(int i=2; i<nTerms; i++)
		{
			MEMORY[i] = MEMORY[i-1] + MEMORY[i-2];
		}

	}
	
	void printFibonacciSeries()
	{

		System.out.print("Fibonacci Series : ");
		for(int i=0; i< nTerms; i++)
		{
			System.out.print(" " + MEMORY[i]);
		}
		System.out.print("\n");
	}

	void calSum()
	{
			for(int i=0; i< nTerms; i++)
			{
				super.SUM += MEMORY[i];
			}
	}

	void calProduct()
	{
		super.PRODUCT = MEMORY[0] * MEMORY[nTerms-1];  // No matter, how many terms there are first term is zero so product will be 0
	}

}

class SolutionClass
{
		ArithmaticSeries AP;
		GeometricProgression GP;
		FibonacciSeries Fib;

		public SolutionClass(int apFirstTerm, int apCommonDiff, int apNTerms, int gpFirstTerm, int gpCommonRatio,int gpNTerms,int fibNTerms)
		{
			AP = new ArithmaticSeries(apFirstTerm, apCommonDiff, apNTerms);				
			GP = new GeometricProgression(gpFirstTerm, gpCommonRatio, gpNTerms);
			Fib = new FibonacciSeries(fibNTerms);
		}
}

public class JavaParameterlessConstructor
{
    public static void main(String[] args)
    {
			// ArithmaticSeries AP = new ArithmaticSeries(2,5,10);	
			// GeometricProgression  GP = new GeometricProgression(2,3,10);
			// FibonacciSeries Fib= new FibonacciSeries(10); 

			SolutionClass Solution = new SolutionClass(2, 5, 10, 2, 3, 10, 10);
    }
}

abstract class Hospital 
{
	abstract void emergency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();    
} 

class MyHospital extends Hospital 
{
	MyHospital()
	{
		// Constructor code
	}

	@Override 
	void emergency()
	{
		// Write some code 
	}

	@Override 
	void appointment()
	{
		// Write some code here 
	}

	@Override 
	void admit()
	{
		// Write some code here 
	}

	@Override 
	void billing()
	{
		// Write some code here 
	}
	
}
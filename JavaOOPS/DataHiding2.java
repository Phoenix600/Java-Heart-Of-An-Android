import	java.util.*;

class Rectangle
{
	// Make the properties as private 
	private int length;
	private int breadth;

	public void setLength(int length)
	{
		if(length > 0)
		{
		this.length = length;			
		}else{
			this.length = 0;
		}
	}

	public int getLenght()
	{
		return length;
	}

	public void setBreadth(int breadth)
	{
		if(breadth > 0)
		{
		this.breadth = breadth;			
		}
		else{
			this.breadth = 0;
		}
	}

	public int getBreadth()
	{
		return breadth;
	}

	public int perimeter()
	{
		return 2*(this.length + this.breadth);
	}

	public int area()
	{
		return (this.length * this.breadth);
	}

	public boolean isSquare()
	{
		if(this.length == this.breadth)
		{
			return true;
		}
		else
			return false;
	}

}

class Main 
{
	public static void main(String...args)
	{
		Rectangle R = new Rectangle();
		System.out.println(R.getLenght());
		System.out.println(R.getBreadth());
	}
}
import java.util.*;

class Graph 
{
	static void addEdge(ArrayList<ArrayList<Integer>>node, int s, int d)
	{
		node.get(s).add(d);
		node.get(d).add(s);
	}
}

public static void main(String[] args)
{
	int V = 5;
	ArrayList<ArrayList<Integer>> node = new ArrayList<ArrayList<Integer>>(V);

	for(int i=0; i<V; i++)
	{
	}


}

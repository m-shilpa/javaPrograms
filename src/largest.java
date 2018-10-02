

public class largest {
	static int a[] = {4,5,3,7,1};

	static int larger()
	{
		
		int i,large=a[0];
		
		
		for(i=1;i<a.length;i++)
		{
			if(a[i]>large)
				large = a[i];
			// System.out.println(a[i]);
		}
		return large;
	}

	public static void main(String[] args) {
		
		System.out.println("largest element is "+ larger());
	}
	
	
	
}

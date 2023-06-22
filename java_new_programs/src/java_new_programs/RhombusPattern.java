package java_new_programs;

public class RhombusPattern {
	
	public static void rhombusPattern(int n)
	{
		int i,j;
		for(i=1;i<n;i++)
		{
			for(j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int n=6;
		rhombusPattern(n);

		
	}

}

/*
    * * * * * 
   * * * * * 
  * * * * * 
 * * * * * 
* * * * * 

*/
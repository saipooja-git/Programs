
/*
 ******
 *    *
 *    *
 *    *
 *    *
 ****** 
*/

package java_new_programs;

public class HollowRectangle {
	
	public static void hollowRectangle(int n)
	{
		int i,j;
		for (i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0|| i == n-1 || j==0 || j == n-1)
				{
					System.out.print("*");
				}
				else {
					System.out.print( " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		hollowRectangle(n);

	}

}

/*
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 

 */

package java_new_programs;

public class TrianglePyramid {
	public static void trianglePyramid(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for (j=1;j <= i;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n= 6;
		trianglePyramid(n);
	}

}

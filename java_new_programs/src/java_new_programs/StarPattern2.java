//downward triangle star pattern
package java_new_programs;

public class StarPattern2 {

	public static void main(String[] args) {

		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}

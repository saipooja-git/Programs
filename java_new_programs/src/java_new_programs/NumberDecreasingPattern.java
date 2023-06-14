package java_new_programs;

public class NumberDecreasingPattern {
			
			public static void numberDecrement(int n)
			{
				int i,j;
				for(i = n;i>=1;i--)
					{
					for(j =1 ;j<=i;j++)
					{
						System.out.print(j + " ");
					}
					System.out.println();
					}
			}


			public static void main(String[] args) {
				int n=5;
				numberDecrement(n);

			

	}

}

/*  
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 */
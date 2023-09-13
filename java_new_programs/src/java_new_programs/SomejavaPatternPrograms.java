package java_new_programs;

public class SomejavaPatternPrograms {

	public static void main(String[] args) {

		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.print("next program");
		System.out.println();
		
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.print("next program");
		System.out.println();
		
		int num=1;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		
		System.out.print("next program");
		System.out.println();
		
		char a,b;
		for(a="A";a<="E";a++)
		{
			for(b="A";b<=a;b++)
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.print("next program");
		System.out.println();
		
		for(a="A";a<="E";a++)
		{
			for(b="A";b<=a;b++)
			{
				System.out.print(a);
			}
			System.out.println();
		}
		
		System.out.print("next program");
		System.out.println();
		
		char s= "A";
		for(a="A";a<="E";a++)
		{
			for(b="A";b<=a;b++)
			{
				System.out.print(s);
				s++;
			}
			System.out.println();
		}
		
		
	}

}

/*

1
12
123
next program
1
22
333
next program
1
23
456
next program
A
AB
ABC
ABCD
ABCDE
next program
A
BB
CCC
DDDD
EEEEE
next program
A
BC
DEF
GHIJ
KLMNO

 
*/


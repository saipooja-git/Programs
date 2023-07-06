package java_new_programs;
import java.util.Scanner;
public class MultiplicaionTable {
	public static void mutiplicationTable(int n,int a) {
		for(int i=1;i<=n;i++) {
			System.out.printf("%d*%d=%d",a,i,a*i).println();
		}
	}
	public static void main(String [] args) {
		int a,n;
		System.out.print("Enter a multiple value");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		System.out.print("enter the number n");
		n=s.nextInt();
		mutiplicationTable(n,a);	
		
	}

}

/* note: if you enter this,	
  System.out.println("%d*%d=%d",a,i,a*i);
  it is not applicable so use printf instead of println
*/

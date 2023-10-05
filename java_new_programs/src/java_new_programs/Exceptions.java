package java_new_programs;

public class Exceptions {

	public static void main(String[] args) {
			//case5) only st2 HAS EXCEPTION AND CATCH BLOCK ALSO HAS EXCEPTION ALSO FINALLY BLOCK HAS EXCEPTION 
		//also the last st6 has exception then st1 executes and then abnormal termination

		
		try{
			// st1:
			System.out.println("happy learning");
			//st2
			int a =10,b=0,c;
			c=a/b;
			System.out.println(c);
			//st3
			System.out.println("coding");
			
		}
		catch(ArithmeticException e) {
			//st4
			int x=10,y=0,z;
			z=x/y;
			System.out.println(z);
			System.out.println("this can't be solved ");
		}
		finally {
			//st5
			String s = "Pooja";
			int d = Integer.parseInt(s);
			System.out.println(d);
			System.out.println("please do like...! share");
		}
		//st6
		String v = "Pooja";
		int de = Integer.parseInt(v);
		System.out.println(de);
		System.out.println("please do like...! share");

		System.out.println("code ends here...!");
		
}
}
	
		/**	//case5) only st2 HAS EXCEPTION AND CATCH BLOCK ALSO HAS EXCEPTION ALSO FINALLY BLOCK HAS EXCEPTION
		 *  then st1 executes and then abnormal termination

		try{
			// st1:
			System.out.println("happy learning");
			//st2
			int a =10,b=0,c;
			c=a/b;
			System.out.println(c);
			//st3
			System.out.println("coding");
			
		}
		catch(ArithmeticException e) {
			//st4
			int x=10,y=0,z;
			z=x/y;
			System.out.println(z);
			System.out.println("this can't be solved ");
		}
		finally {
			//st5
			String s = "Pooja";
			int d = Integer.parseInt(s);
			System.out.println(d);
			System.out.println("please do like...! share");
		}
		//st6
		System.out.println("code ends here...!");
		
}
}
	**/

		
	/**	//case5) only st2 HAS EXCEPTION AND CATCH BLOCK ALSO HAS EXCEPTION ALSO FINALLY BLOCK HAS EXCEPTION 
	 * then st1 executes and then abnormal termination
				try{
					// st1:
					System.out.println("happy learning");
					//st2
					int a =10,b=0,c;
					c=a/b;
					System.out.println(c);
					//st3
					System.out.println("coding");
					
				}
				catch(ArithmeticException e) {
					//st4
					int x=10,y=0,z;
					z=x/y;
					System.out.println(z);
					System.out.println("this can't be solved ");
				}
				finally {
					//st5
					String s = "Pooja";
					int d = Integer.parseInt(s);
					System.out.println(d);
					System.out.println("please do like...! share");
				}
				//st6
				System.out.println("code ends here...!");
				
		}
		}
		**/
		/**
		//case2 & 3) SINCE TRY BLOCK ST2 KO EXCEPTION HAI AND CATCH BLOCK KO ALAG EXCEPTION HAI,,
		 *  AUR ST2 EXCEPTION HAI AND CATCH BLOCK MAI BE EXCEPTION HAI only st1 ,st5 executes and then abnormal termination
		try{
			// st1:
			System.out.println("happy learning");
			//st2
			int a =10,b=0,c;
			c=a/b;
			System.out.println(c);
			//st3
			System.out.println("coding");
			
		}
		catch(NumberFormatException e) {
			//st4
			
			System.out.println("this can't be solved ");
		}
		finally {
			//st5
			System.out.println("please do like...! share");
		}
		//st6
		System.out.println("code ends here...!");
		
}
}
**/
	/**	//case1) st1,st,st3,st5,st6 executes and normal termination
		try{
		//st1
			System.out.println("happy learning");
			//st2
			int a =10,b=2,c;
			c=a/b;
			System.out.println(c);
			//st3
			System.out.println("coding");
			
		}
		catch(ArithmeticException e) {
		//st4
			
			System.out.println("this can't be solved ");
		}
		finally {
		//st5
			System.out.println("please do like...! share");
		}
		//st6
		System.out.println("code ends here...!");
		
	}
}
**/
	/**	//case2) SAME EXCEPTON IN ST2 AS WELL AS IN CTCH BLOCK st1,st4,st5,st6 executes and normal termination
		try{
		//st1
			System.out.println("happy learning");
			//st2
			int a =10,b=0,c;
			c=a/b;
			System.out.println(c);
			//st3
			System.out.println("coding");
			
		}
		catch(ArithmeticException e) {
			//st4
			System.out.println("this can't be solved ");
		}
		finally {
		//st5
			System.out.println("please do like...! share");
		}
		//st6
		System.out.println("code ends here...!");
		
	}
}
**/
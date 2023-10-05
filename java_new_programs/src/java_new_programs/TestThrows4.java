package java_new_programs;
import java.io.*;  
// when exception occured
class M2{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class TestThrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     M2 m=new M2();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  
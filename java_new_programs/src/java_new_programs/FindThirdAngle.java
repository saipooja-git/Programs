package java_new_programs;
import java.util.Scanner;
public class FindThirdAngle {


		public static int calThirdAngle(int angle1 , int angle2) {
			int angle3 = 180 - (angle1 + angle2);
			return angle3;
		}

        public static void main(String[] args) {
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter 1st value: ");
        	int angle1 = s.nextInt();
        	System.out.println("Enter 2nd value: ");
        	int angle2 = s.nextInt();
        	int angle3 = calThirdAngle(angle1,angle2);
        	System.out.println("third angle: "+ angle3);
            s.close();



        }
}


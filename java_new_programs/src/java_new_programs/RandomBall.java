package java_new_programs;

import java.util.Scanner;

public class RandomBall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ball number for Team 1: ");
        int ballNum1 = s.nextInt();
        System.out.println("Enter the ball number for Team 2: ");
        int ballNum2 = s.nextInt();
       
        // Randomly pick a ball for player 1 of Team 1
        int teamOneScore = teamOne(ballNum1);

        // Randomly pick a ball for player 1 of Team 2
        int teamTwoScore = teamTwo(ballNum2);

        System.out.println("Pick a random ball for player 1 of Team 1 --> " + teamOneScore);
        System.out.println("Pick a random ball for player 1 of Team 2 --> " + teamTwoScore);
        
        int totalScore = teamOneScore + teamTwoScore;
        System.out.println("Total score for both teams is " + totalScore);
        
        s.close();
    }

    public static int teamOne(int ballNum1) {
        if (ballNum1 >= 6 && ballNum1 <= 15) {
           return ballNum1;
        } else {
            return 0; // Return 0 for an invalid ball
        }
    }

    public static int teamTwo(int ballNum2) {
        if (ballNum2 >= 6 && ballNum2 <= 15) {
           
            return ballNum2;
        } else {
            return 0; // Return 0 for an invalid ball
        }
    }
}



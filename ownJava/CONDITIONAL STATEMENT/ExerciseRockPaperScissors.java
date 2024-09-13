
// Exerciese : Rock, Paper , Scissor game 

import java.util.*;

class RockPaperScissors {
    int computerChoice;
    int playerChoice;

    public void play() {
        Random rand = new Random();
        computerChoice = rand.nextInt(1, 4);
        System.out.println();

        System.out.println("Enter you choice 1- rock , 2-paper, 3-scissor : ");
        Scanner sc = new Scanner(System.in);
        playerChoice = sc.nextInt();
        System.out.println("Computer choice  : " + computerChoice);

        // logic of rock paper scissor
        /*
         1 - rock
         2 - paper
         3 - scissor
         */
        if (computerChoice == playerChoice) {
            System.out.println("Match Draw !! ");
        } else if ((playerChoice == 1 && computerChoice == 3) || (playerChoice == 2 && computerChoice == 1)
                || (playerChoice == 3 && computerChoice == 2)) {
            System.out.println("Player wins !!! ");
        } else {
            System.out.println("Computer wins !!! ");
        }
    }
}

public class ExerciseRockPaperScissors {

    public static void main(String[] args) {
        RockPaperScissors play1 = new RockPaperScissors();
        play1.play();
    }
}
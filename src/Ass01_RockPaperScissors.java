import java.util.Scanner;

public class Ass01_RockPaperScissors
{
        public static void main(String[] args) {
        // Declare Variables
        String player1 = "";
        String player2 = "";
        String move = "Please enter your R, P or S for your move: ";
        boolean done = false;
        String quit = "";
        String trash = "";
        Scanner in = new Scanner(System.in);

        // Get Players  moves//

        do {

                System.out.print("Player 1 " + move);
                player1 = in.nextLine();

                System.out.print("Player 2 " + move);
                player2 = in.nextLine();

            if(in.hasNextLine()) {
                trash = in.nextLine();
                System.out.println("You need to enter R, P or S for your move");

            }

                if (player1.equalsIgnoreCase("R")) {
                    if (player2.equalsIgnoreCase("R")) {
                        System.out.println("Rock vs.Rock it is a tie");
                    } else if (player2.equalsIgnoreCase("S")) {
                        System.out.println("Rock breaks Scissors player 1 wins");
                    } else //player1 paper
                    {
                        System.out.println("Paper covers Rock player 1 wins");
                    }
                } else if (player1.equalsIgnoreCase("S")) {
                    if (player2.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks scissors player 2 wins");
                    } else if (player2.equalsIgnoreCase("S")) {
                        System.out.println("Scissors vs. Scissors it is a tie");
                    } else //player1 paper
                    {
                        System.out.println("Scissors cuts paper player 2 wins");
                    }
                } else //player1 paper
                    if (player2.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers rock player 1 wins");
                    } else if (player2.equalsIgnoreCase("S")) {
                        System.out.println("Scissors cuts paper player 2 wins");
                    } else //player1 paper
                    {
                        System.out.println("Paper vs. Paper it is a tie");

                    }


            // Asking players to play again

            System.out.print("Would you like to play again enter Y/N: ");

            quit = in.nextLine();


            if(quit.equalsIgnoreCase("N"))
                done = true;

        }while(!(done));

    }
}







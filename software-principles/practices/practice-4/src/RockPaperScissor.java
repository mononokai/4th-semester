import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    Random rng = new Random();
    Scanner input = new Scanner(System.in);

    public void rps() {
        int wins = 0, losses = 0, draws = 0;

        while (true) {
            System.out.println("Enter your play:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            int npc = rng.nextInt(3);
            int player = input.nextInt();

            if (npc == player) {
                System.out.println("It's a draw!");
                draws++;
            }
            else if (npc == 1 && player == 2 || npc == 2 && player == 3 || npc == 3 && player == 1) {
                System.out.println("You win!");
                wins++;
            }
            else if (player == 1 && npc == 2 || player == 2 && npc == 3 || player == 3 && npc == 1) {
                System.out.println("You lose!");
                losses++;
            }
            else {
                System.out.println("Invalid entry");
            }

            System.out.println("Score:");
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            System.out.println("Draws: " + draws);
        }
    }
}

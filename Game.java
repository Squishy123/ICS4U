import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int points = 0;
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Welcome to Chris's Guessing Game");
			int num = (new Random()).nextInt(999) + 1;
			System.out.println("DEV NUM : " + num);
			while (true) {
				System.out.println("GUESS THE NUMBER!!!");
				int guess = new Scanner(System.in).nextInt();

				if (guess > num)
					System.out.println("Your guess is bigger than the actual number");
				else if (guess < num)
					System.out.println("Your guess is smaller than the actual number");
				else if (guess == num) {
					System.out.println("YOU GOT THE NUMBER!!!");
					points+=100;
					break;
				}

				System.out.println("GET A HINT!");
				String hint = new Scanner(System.in).nextLine();
				switch (hint) {
				case "a":
					System.out.println("FIRST DIGIT IS: " + String.valueOf(String.valueOf(num).charAt(0)));
					points -= 10;
					break;
				case "b":
					System.out.println("SECOND DIGIT IS: " + String.valueOf(String.valueOf(num).charAt(1)));
					points -= 10;
					break;
				case "c":
					System.out.println("THIRD DIGIT IS: " + String.valueOf(String.valueOf(num).charAt(2)));
					points -= 10;
					break;
				}
			}
			System.out.println("YOU WIN THE GAME!!! Start another round? Y/N");
			if ((new Scanner(System.in).next()).toLowerCase().equals("n")) {
				isRunning = false;
			}
		}
		System.out.println("YOUR SCORE IS : " + points);
	}

}

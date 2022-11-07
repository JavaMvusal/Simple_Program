import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Random random = new Random();
			int numberOfTries = 0;
			int randomNumber = random.nextInt(100);
			System.out.println("Enter a number beetwen 0-100");
			boolean win = false;
			
			while(!win) {
				try {
				int input = scanner.nextInt();
				numberOfTries++;
				if(input<randomNumber) {
					System.out.println("go higher");
				}else if(input>randomNumber) {
					System.out.println("go lower");
				}else {
					System.out.println("You win....         number of tries = " + numberOfTries);
					win=true;
				}
				}catch(Exception e) {
					win = true;
				System.out.println(e.getLocalizedMessage());	
				}
			}
		}

	}

}

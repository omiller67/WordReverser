import java.util.Scanner;

public class ReverseWordsDriver {
	
	private void interactionLoop() {
		
		ReverseWords wordReverser = new ReverseWords();
		boolean done = false;
		while(!done) {
			System.out.print("Enter the sentence you want reversed: ");
			Scanner in = new Scanner(System.in);
			String userInput = in.nextLine();
			System.out.print("Reversed: ");
			System.out.println(wordReverser.reverse(userInput));
			System.out.println("Would you like to reverse another sentence? (Y/N)");
			String userResponse = in.nextLine();
			if(userResponse.equalsIgnoreCase("n")) {
				done = true;
				System.out.println("See you later!");
			}
		}
	}
	
	public static void main(String[] args) {
		
		ReverseWordsDriver driver = new ReverseWordsDriver();
		driver.interactionLoop();

	}

}

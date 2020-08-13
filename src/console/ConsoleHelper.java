package console;

import java.util.Scanner;


public class ConsoleHelper {

	private String inputString;
	private final Scanner s = new Scanner(System.in);

	public boolean checkIfWannaPlayAgain() {
		boolean legalInput = false;
		this.inputString = "";
		System.out.println("Wanna play again? Type in \"y\" for yes or \"n\" for no and confirm with \"Enter\":");
		legalInput = getInputAndReturnLegal();
		while (!legalInput) {
			System.out.println("\n\"" + inputString + "\""
					+ " is no legal Input? Please type in \"y\",  if you want to play again or \"n\", if you do not want to play again and confirm with \"Enter\":");
			legalInput = getInputAndReturnLegal();
		}
		if (inputString.equals("y")) {
			System.out.println("New Round started.");
			return true;
		}
		System.out.println("Game has been ended.");
		return false;
	}

	private boolean getInputAndReturnLegal() {
		this.inputString = s.next();
		return inputString != null && (inputString.equals("y") || inputString.equals("n"));
	}

}

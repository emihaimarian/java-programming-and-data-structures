/**
 * Calculator.java, to accept an expression as a string in which the operands and operator are separated by zero or more spaces. 
 * For example, 3+4 and 3 + 4 are acceptable expressions
 */

package exercises.exercise26;

public class Calculator {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Usage: java Calculator \"operand1 operator operand2\"");
			System.exit(1);
		}

		int result = 0;

		String string = insertBlank(args[0]);
		String[] token = string.split("\\s+");

		switch (token[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(token[0]) + Integer.parseInt(token[2]);
			break;
		case '-':
			result = Integer.parseInt(token[0]) - Integer.parseInt(token[2]);
			break;
		case '*':
			result = Integer.parseInt(token[0]) * Integer.parseInt(token[2]);
			break;
		case '/':
			result = Integer.parseInt(token[0]) / Integer.parseInt(token[2]);
		}

		System.out.println(token[0] + ' ' + token[1] + ' ' + token[2] + " = " + result);

	}

	public static String insertBlank(String string) {

		String result = "";

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == '+' || string.charAt(i) == '-' || string.charAt(i) == '*'
					|| string.charAt(i) == '/')
				result += " " + string.charAt(i) + " ";
			else
				result += string.charAt(i);
		}

		return result;
	}
}

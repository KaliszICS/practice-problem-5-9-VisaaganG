import java.util.ArrayDeque;


public class PracticeProblem {

	public static String processBackspaces(String input) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
 
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
	String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }
 
}
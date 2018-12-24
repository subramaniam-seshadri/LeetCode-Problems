import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class ValidParantheses {

	public static void main(String[] args) {
		String paranthesesString = "()([]{}[[]]){}[]{{()}}";
		boolean result = isValidParanthesis(paranthesesString);
		if(result)
			System.out.println("Valid parantheses");
		else
			System.out.println("Invalid parantheses");
	}

	public static boolean isValidParanthesis(String paranthesesString) {
		Deque<Character> myStack = new ArrayDeque<Character>();
		HashMap<Character, Character> paranthesesMap = new HashMap<Character, Character>();
		paranthesesMap.put('}', '{');
		paranthesesMap.put(']', '[');
		paranthesesMap.put(')', '(');
		int stringLength = paranthesesString.length();
		int count = 0;
		if(stringLength%2 == 0) { //check if it is a valid parantheses string
			for(char c: paranthesesString.toCharArray()) {
				if(!paranthesesMap.containsKey(c)) { // open parantheses
					myStack.push(c);
					count +=1;
				}
				else { // if map contains character then check head of stack
					 if(myStack.peek() == paranthesesMap.get(c)) {
						 myStack.pop();
					 }
				}
			}
			if(myStack.isEmpty() && count == (stringLength/2))
				return true;
			else
				return false;
		}else {
			return false;
		}
	}
}

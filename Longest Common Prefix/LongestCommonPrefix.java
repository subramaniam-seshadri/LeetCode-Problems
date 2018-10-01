import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		List<String> strs = new ArrayList<String>();
		strs.add("flower");
		strs.add("flow");
		strs.add("flight");
		String result = commonPrefix(strs);
		System.out.println(result);
	}

	public static String commonPrefix(List<String> strs) {
		String result = "";
		if (strs.size() < 2) {
			return "";
		} else if (strs.size() == 2) {
			result = baseCase(strs.get(0), strs.get(1));
			return result;
		} else {
			result = baseCase(strs.remove(0), strs.remove(1));
			strs.add(result);
			result = commonPrefix(strs);
			return result;
		}
	}

	public static String baseCase(String firstString, String secondString) {
		String result = "";
		for (int i = 0, j = 0; i < firstString.length() && j < secondString.length();i++,j++) {
			if (firstString.charAt(i) == secondString.charAt(j) && i == j) {
				result += firstString.charAt(i);
				
			}
		}
		return result;
	}
}

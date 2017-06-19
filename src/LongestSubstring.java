import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string input");
		String str = sc.nextLine();
		System.out.println(longestNonRepeatingSubstring(str));
		sc.close();
	}
	
	public static String longestNonRepeatingSubstring(String inputStr) {
		char [] charArray = inputStr.toCharArray();
		String tempResultCompare = new String();
		StringBuilder currentSubstr = new StringBuilder();
		for(char ch:charArray) {
			if(currentSubstr.length() == 0) {
				currentSubstr.append(String.valueOf(ch));
			} else {
				if(currentSubstr.indexOf(String.valueOf(ch)) == -1) {
					currentSubstr.append(String.valueOf(ch));
				} else {
					if(tempResultCompare == null) {
						tempResultCompare = currentSubstr.toString();
					} else {
						if(currentSubstr.length() > tempResultCompare.length()) {
							tempResultCompare = currentSubstr.toString();
						}
					}
					currentSubstr = new StringBuilder();
					currentSubstr.append(String.valueOf(ch));
				}
			}
		}
		return tempResultCompare;
	}
}

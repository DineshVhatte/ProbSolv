import java.util.Scanner;
import java.util.Stack;

public class ShuffleString {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string"); 
		String str = sc.nextLine();
		String resultStr = null;
		char [] charStr = str.toCharArray();
		
		int index = 1;
		StringBuilder strBldr = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		for(char ch:charStr) {
			if(index != (str.length()/2 + 1)) {
				stack.push(String.valueOf(ch));
			} else {
				while(!stack.isEmpty()) {
					strBldr.append(stack.pop());
				}
				if(str.length() % 2 == 1) {
					strBldr.append(ch);
				} else {
					stack.push(String.valueOf(ch));
				}
				
			}
			index++;
		}
		while(!stack.isEmpty()) {
			strBldr.append(stack.pop());
		}
		resultStr = strBldr.toString();
			
		
		System.out.println(resultStr);
		sc.close();
	}

}

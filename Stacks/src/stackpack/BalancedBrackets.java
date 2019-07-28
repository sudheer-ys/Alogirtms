package stackpack;
import java.util.*;

public class BalancedBrackets {

	public static void main(String[] args) {
		
		  Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            String s = in.next();
	            System.out.println(s);
	            System.out.println(checkBalence(s)?"YES":"NO");
	        }			     
	}
	
	static boolean checkBalence(String s){
		
		Stack<Character> stk = new Stack<Character>();
		
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stk.push(c);
			} 
			else {
				if (stk.isEmpty()) {
					return false;
				}

				char top = stk.pop();
				if (!((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))) {
					return false;
				}
			}
		}
		return stk.isEmpty();
	}
}

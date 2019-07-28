package stackpack;
import java.util.*;

public class MaxElement {

	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> stk2 = new Stack<Integer>();
		stk2.push(0);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i< N; i++){
			int q = sc.nextInt();						
			switch(q){
			case 1:
				int x = sc.nextInt();
				stk.push(x);
				if(stk.peek()>=stk2.peek()){
					stk2.push(stk.peek());
				}					
				break;
			case 2:
				
					
					if(stk.peek() == stk2.peek()){
						stk2.pop();						
					}
					stk.pop();
									
				
				break;
			case 3: 
				System.out.println(stk2.peek());
			}
		}
	}

}

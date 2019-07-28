package algos;

import java.util.Scanner;

public class StackandQueue {

	 char[] stack = new char[100];
	    int top = 0;
	    char[] queue = new char[100];
	    int f=0,l=0;
	    public void pushCharacter(char c){
	       stack[top] = c;
	       top++;
	    }
	    public char popCharacter(){
	        int temp = top;
	        top = top - 1;
	    	return stack[temp-1];	        
	    }
	    public void enqueueCharacter(char c){        
	        queue[l] = c;        
	        l++;
	    }
	    public char dequeueCharacter(){
	        char[] t = new char[l];
	        char c = queue[0];
	        for(int i=1; i<l+1; i++){
	            t[i-1] = queue[i];
	        }
	        l--;
	        queue = t.clone();
	        return c;
	    }	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		char[] s = input.toCharArray();
		StackandQueue p = new StackandQueue();
		
		for(char c:s){
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}
		
		boolean isPalindrome = true;
		for(int i=0; i<s.length/2; i++){
			System.out.println(p.popCharacter()+" "+p.dequeueCharacter());
//			if(p.popCharacter() != p.dequeueCharacter()){
//				isPalindrome = false;
//				break;
//			}
		}
		System.out.println("The word, "+input+", is "+((!isPalindrome) ? "not a palindrome.":"a palindrome."));

	}

}

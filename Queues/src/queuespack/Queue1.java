package queuespack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Queue1 {
    
    private static class MyQueue<T> {
        
        private Stack<T> S1 = new Stack<T>();
        private Stack<T> S2 = new Stack<T>();
        
        public void enqueue(T item) {
            S1.push(item);
        }
        
        public T dequeue() {
            if (S2.isEmpty()) {
                while (!S1.empty()) {
                    S2.push(S1.pop());
                }
            }
            
            return S2.pop();
        }
        
        public T peek() {
            if (S2.isEmpty()) {
                while (!S1.empty()) {
                    S2.push(S1.pop());
                }
            }
            
            return S2.peek();
        }
        
    }
    
    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<Integer>();      

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
        	int op = sc.nextInt();
            
        	if (op == 1) 
            { 
              q.enqueue(sc.nextInt());
            } 
            else if (op == 2) 
            {
              q.dequeue();
            } 
            else if (op == 3) 
            { 
              System.out.println(q.peek());
            }
        }
        sc.close();
    }
}

package treespack;
import java.util.*;

public class medianUpdates {

	static void median(String a[], Long x[]){
		ArrayList<Long> al = new ArrayList<Long>();
		for(int i=0; i<a.length; i++){
			printMedian(a[i],x[i],al);
		}
	}
	static void printMedian(String a, Long b, ArrayList<Long> list){
		
		int index = Collections.binarySearch(list, b);
		
		if(a.equals("r")){
			if(index < 0){
				System.out.println("Wrong!");
				return;
			}
			else{
				list.remove(index);
			}						
		}
		else{
			if(index < 0)
				list.add(-index-1, b);
			else
				list.add(index,b);
		}		
		
		
		if(list.size()==0){
			System.out.println("Wrong!");	
		}			
		else if(list.size()%2==0){
			long median = list.get(list.size()/2)+list.get(list.size()/2-1);
			 if((median & 1) == 1) {
	                System.out.printf("%.1f", median/2.0);
	                System.out.println();
	            }
			 else 
				 System.out.println(median / 2);
		}
		else{
			System.out.println(list.get((list.size()-1)/2));
		}
		
		
	}
	
	public static void main(String[] args) {

	      Scanner in = new Scanner(System.in);
	      
	      int N;
	      N = in.nextInt();
	   
	      String s[] = new String[N];
	      Long x[] = new Long[N];
	      
	      for(int i=0; i<N; i++){
	         s[i] = in.next();
	         x[i] = in.nextLong();
	      }
	   
	      median(s,x);		

	}

}

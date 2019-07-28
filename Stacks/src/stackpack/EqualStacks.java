package stackpack;
import java.util.*;
import java.lang.Math;
public class EqualStacks {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        int sum1=0,sum2=0,sum3=0;
        
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sum1+= h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            sum2+= h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sum3+= h3[h3_i];
        }	
        int fn1=0,fn2=0,fn3=0;
        int x = Math.max(sum1, Math.max(sum2, sum3));       
        boolean flag=true;
        int ans=0;
        while(flag){
        	
        	x = Math.max(sum1, Math.max(sum2, sum3));
        	
        	if(sum1==sum2 && sum2==sum3){        		
        		ans = sum1;
        		flag = false;
        		break;
        	}
        	
        	if(fn1==n1-1 || fn2==n2-1 || fn3==n3-1){
        		flag=false;
        		break;
        	}        		
        	if(x==sum1){
        		sum1 = sum1 - h1[fn1];
        		fn1++;
        	}
        	if(x==sum2){
        		sum2 = sum2 - h2[fn2];
        		System.out.println(sum2);
        		fn2++;
        	}
        	if(x==sum3){
        		sum3 = sum3 - h3[fn3];
        		fn3++;
        	}
        	
        }
        System.out.println(ans);
        
	}

}

package algos;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int val = scn.nextInt();				
		int[] a = new int[val];
		for(int i=0; i<val;i++){
			a[i] = scn.nextInt();
		}
		scn.close();
		int totalswaps = 0;
		for(int i=0;i<val;i++){
			int numswaps = 0;
			for(int j=0; j<val-1;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					numswaps++;
				}
			}
			Totalswaps += numswaps;
			if(numswaps==0){
				break;
			}
		}
		System.out.println("Array is sorted in "+Totalswaps+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[val-1]);
	}

}
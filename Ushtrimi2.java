package ushtrime;

import java.util.Scanner;

public class Ushtrimi2 {
	public static void main (String [] args) {
		int n, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nr total i elementeve:");
		n =sc.nextInt();
		int a[] = new int[n];
		System.out.println("Vendosni elementet e vektorit:");
		for (int k=0; k<a.length; k++) 
		a[k] = sc.nextInt();
		System.out.println("Vendosni shumen:");
		s = sc.nextInt();
		
		/*int a[] = {4,7,2,1,3,8,5};*/
		int low = 0;
	    int high = 0;
	    int sum = a[0];
	    while(high < a.length) {
	        if(sum < s) {
	            high++;

	            if(high < a.length) {
	                sum+= a[high];

	            }
	        } else if(sum > s) {
	            sum-=a[low];
	            low++;

	        }
	        if(sum == s) {
	            for(int i=low;i<=high;i++) {
	                System.out.println(a[i]);
	            }
	            System.out.println("new ");
	            low++;
	            high=low;
	            sum = a[low];
	            //return;
	        }
	    }
		
	}
	}



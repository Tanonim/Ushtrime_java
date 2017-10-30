package ushtrime;

import java.util.Scanner;

public class Ushtrimi1 
	{public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Vendosni nr e elemnteve");
		n = sc.nextInt();
	    int[] a = new int[n];
	    System.out.println("Vendosni elementet e vektorit:");
	    for (int k=0; k <a.length; k++)
	    { a[k] = sc.nextInt();}
	     System.out.println("Nr me i shpeshte eshte:" + getMostPopularElement(a));        
	}

	private static int getMostPopularElement(int[] a){              
	    int maxElementIndex = getArrayMaximumElementIndex(a); 
	    int[] b= new int[a[maxElementIndex]+1];
	    for(int i = 0; i<a.length;i++){
	           ++b[a[i]];
	    }
	    return getArrayMaximumElementIndex(b);
	}

	private static int getArrayMaximumElementIndex(int[] a) {
	    int maxElementIndex = 0;
	    for(int i = 1;i<a.length;i++){
	        if(a[i]>=a[maxElementIndex]){
	            maxElementIndex = i;
	        }
	    }
	    return maxElementIndex;
	}                               
	}


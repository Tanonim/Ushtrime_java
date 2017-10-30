package ushtrime;


	import java.util.Scanner;
	public class Ushtrimi4 {
	    public static void printRow(int[] row) {
	        for (int i : row) {
	            System.out.print(i);
	            System.out.print("\t");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	int n,m;
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Gjatesia:");
	    	n = sc.nextInt();
	    	System.out.println("Gjeresia");
	    	m=sc.nextInt();
	    	
	        int twoDm[][]= new int[n][m];
	        int i,j;
	    	System.out.println("Vendosni elementet e vektorit:");
	        for(i=0;i<n;i++) {
	            for(j=0;j<m;j++) {
	            
	                twoDm[i][j]=sc.nextInt();
	                
	            }
	        }

	        for(int[] row : twoDm) {
	            printRow(row);
	        }
	    }

}

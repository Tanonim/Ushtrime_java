package ushtrime;


	import java.util.Scanner;

	public class Ushtrimi5 {

	        public static void main(String[] args) {
	            int number = 0;
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("Vendosni nje numer nga 0 ne 999, ose shkruani -1 per exit ");
	            number = scanner.nextInt();
	            while(number!=-1){
	                if(number>=0 && number<=999){
	                    if(number==0){
	                        System.out.print("Numri pas konvertimit:\tZERO");
	                    } else  {
	                        System.out.print("Numri pas konvertimit:\t");
	                        numberToWord(((number / 100) % 10), "qind");
	                        numberToWord((number % 100), " ");
	                    }

	                } else{
	                    System.out.print("NUMBER OUT OF RANGE");
	                }
	                System.out.print("\nVendosni nje numer ndermjet 0 dhe 999 ose -1 per exit:");
	                number = scanner.nextInt();
	            }
	        }

	        public static void numberToWord(int num, String val) {
	            String ones[] = {" "," nje", " dy", " tre", " kater", "pese", "gjashte", " shtate", " tete", " nente", " dhjete", " njembedhjete", " dymbedhjete", " trembedhejte", " katermbedhjete", " pesembedhjete", " gjashtembedhjete", " shtatembedhjete", " tetembedhjete", "nentembedhjete"
	            };
	            String tens[] = {" ", " ", " njezet", " tridhjet", " katerdhjete", " pesedhjete", " gjashtedhjete", " shtatedhjete", "tetedhjete", " nentedhjete"};
	            if (num > 19) {
	                System.out.print(tens[num / 10] + " " + ones[num % 10]);
	            } else {
	                System.out.print(ones[num]);
	            }
	            if (num > 0) {
	                System.out.print(val);
	            }
	        }
	    

}

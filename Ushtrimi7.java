package ushtrime;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;

	public class Ushtrimi7 {

		private Random random = new Random();

		public static void main(String[] args) {

			List<String> list = new ArrayList<String>();
			list.add("The product is excellent");
			list.add("This is a great product");
			list.add("I use this product constantly");
			list.add("This is the best product from this category");
			
			List<String> list2 = new ArrayList<String>();
			list2.add("Now i feel better");
			list2.add("I managed to change");
			list2.add("It made some miracle");
			list2.add("I can't believe it, but now i feel great");
			list2.add("You should try it too. I am very satisfied");
			
			List<String> list3 = new ArrayList<String>();
			list3.add("Dayan");
			list3.add("Stella");
			list3.add("Hellen");
			list3.add("Kate");
			
			List<String> list4 = new ArrayList<String>();
			list4.add("Johnson");
			list4.add("Peterson");
			list4.add("Charls");
			
			List<String> list5 = new ArrayList<String>();
			list5.add("London");
			list5.add("Paris");
			list5.add("Berlin");
			list5.add("New York");
			list5.add("Madrid");

			Ushtrimi7 obj = new Ushtrimi7();
			Ushtrimi7 obj2 = new Ushtrimi7();
			Ushtrimi7 obj3 = new Ushtrimi7();
			Ushtrimi7 obj4 = new Ushtrimi7();
			Ushtrimi7 obj5 = new Ushtrimi7();
			
			for(int i = 0; i < list.size(); i++){
				for (int j =0; j<list2.size(); j++) {
					for (int k=0; k<list3.size(); k++) {
						for (int l=0; l<list4.size(); l++) {
							for (int m=0; m<list5.size(); m++) {		
					
				System.out.println(obj.getRandomList(list) + obj2.getRandomList(list2) + obj3.getRandomList(list3) + obj4.getRandomList(list4) + obj5.getRandomList(list5));
			}
	
	
						}}}}}

		
		public String getRandomList(List<String> list ) {
		

		    //0-4
		    int index = random.nextInt(list.size());
		    System.out.println("\nIndex :" + index );
		    return list.get(index);

		}



	}



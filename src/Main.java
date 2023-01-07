
public class Main {

	public static void main(String[] args) throws Exception {

		String str = "2 ";
		Animal animal1 = new Animal(5, "Kedi", true);
		boolean isIt = true;
		MyOwnList listem = new MyOwnList();
		listem.add("O ");
		listem.add("1 ");
		listem.add(str);
		//listem.add("2 ");
		listem.add("3 ");
		listem.add("4 ");
		 listem.add(animal1);
		//listem.add("5 ");
		listem.add("6 ");
		listem.add("7 ");
		 listem.add(isIt);
		//listem.add("8 ");
		listem.add("9 ");
		listem.add("10 ");
		

		System.err.println("add() , show(), size()  metodu kontrolü");
		System.out.println("Liste Boyutu : " + listem.size());
		System.out.print("Show Metodu : ");
		listem.show();
		System.out.println("****************************************");


		System.err.println("getOf() ve getİndexOf() metodu kontrolü");
		System.out.println(listem.getOf(0));
		System.out.println(listem.getOf(5));
		System.out.println(listem.getOf(8));
		System.out.println(listem.getOf(20)); // olmayan index değeri yazdık null geldi
		System.out.println(listem.getİndexOf(str));
		System.out.println(listem.getİndexOf(23));// olmayan bir değer yazdık -1 döndü
		System.out.println(listem.getİndexOf("9 uncu "));
		System.out.println(listem.getİndexOf(animal1));
		System.out.println("****************************************");


		System.err.println("remove() ve show() metodu kontrolü");
		listem.show();
		listem.remove(2);
		listem.show();
		listem.remove(5);
		listem.show();
		listem.remove(50);                      //false döndü
		System.out.println(listem.remove(50)); // olmayan index değeri
		listem.show();
		int lastSize = listem.size();
		System.out.println(lastSize);

		MyOwnList listem2 = new MyOwnList();
		listem2.add("1inci,");
		listem2.add("2inci,");
		listem2.add("3üncü,");
		listem2.add(false);

		System.out.println("****************************************");
		System.err.println("2nci ayrı bir  liste  nesnesi kontrolü");
		listem2.show();
		System.out.println(listem2.size());
		listem2.getİndexOf("sadasdasda");
		listem2.getOf(200);
		System.out.println(listem2.getİndexOf("2inci,"));
	}

}

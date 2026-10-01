
public class TestListeChainee {

	public static void main(String[] args) {
		ListeChainee listeChainee = new ListeChainee(1);
		listeChainee.addFirst(4);
		listeChainee.addFirst(7);
		
		System.out.println("Premier : " + listeChainee.first());
		listeChainee.addFirst(9);
		System.out.println("Premier : " + listeChainee.first());
		
		
		System.out.println("Dernier : " + listeChainee.last());
		listeChainee.addLast(2);
		System.out.println("Dernier : " + listeChainee.last());	
		System.out.println("Pénultième : " + listeChainee.penultimate());
		
		System.out.println("Liste entière : " + listeChainee);
		System.out.println("Inverse : " + listeChainee.inverser());

		
		ListeChainee listeChainee2 = new ListeChainee(2);
		System.out.println("Dernier : " + listeChainee2.last());
		System.out.println("Premier : " + listeChainee2.first());
		listeChainee2.addLast(1);
		System.out.println("Dernier : " + listeChainee2.last());
		System.out.println("Premier : " + listeChainee2.first());
		

	}

}

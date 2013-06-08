import java.util.*;

public class Deal {
    	public static void main(String[] args) {
        	//	if number of arguments is less than 2
        		if (args.length < 2) {
        	    	System.out.println("Usage: Deal hands cards");
            		return;
        	}
        	// parse number of hands
       	 int numHands = Integer.parseInt(args[0]);
       	 // parse cards per hand
       	 int cardsPerHand = Integer.parseInt(args[1]);
    
       	 // Make a normal 52-card deck.
       	 String[] suit = new String[] {
       	     "spades", "hearts", 
       	     "diamonds", "clubs" 
       	 };
       	 String[] rank = new String[] {
       	     "ace", "2", "3", "4",
       	     "5", "6", "7", "8", "9", "10", 
       	     "jack", "queen", "king" 
       	 };

       	List<String> deck = new ArrayList<>();
       	for (int i = 0; i < suit.length; i++)
       		for (int j = 0; j < rank.length; j++)
       	         		deck.add(rank[j] + " of " + suit[i]);
    
        	// Shuffle the deck.
        	Collections.shuffle(deck);
    
        	if (numHands * cardsPerHand > deck.size()) {
            		System.out.println("Not enough cards.");
            		return;
        	}
    
        	for (int i = 0; i < numHands; i++)
            		System.out.println(dealHand(deck, cardsPerHand));
    	}	
  
    	public static <E> List<E> dealHand(List<E> deck, int n) {
        		int deckSize = deck.size();
        		List<E> handView = deck.subList(deckSize - n, deckSize);
        		List<E> hand = new ArrayList<E>(handView);
        		handView.clear();
        		return hand;
    	}
}
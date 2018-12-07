package code;

import java.util.ArrayList;

public class WhaleWatcher {

	public static void main(String[] args) {
		ArrayList<Whale> whales = new ArrayList<Whale>();
		
		Whale rightWhale = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale blueWhale = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale spermWhale = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale humpbackWhale = new Whale("Humpback", "Antarctic", 919, 13, 13);
		
		whales.add(rightWhale);
		whales.add(blueWhale);
		whales.add(spermWhale);
		whales.add(humpbackWhale);
			
			
		System.out.println("All Whales:\n");
		displayWhales(whales);
		
		System.out.println("\nAtlantic Whales:\n");
		displayAtlanticWhales(whales);
		
		System.out.println("\nFastest Whale:\n");
		displayFastestWhale(whales);
		
		System.out.println("\nAverage Length:\n" + averageLength(whales));
		
		ArrayList<Whale> heaviestWhales = heaviestWhale(whales);
		System.out.printf("\nHeaviest Whale:\n");
		for (Whale whale : heaviestWhales) {
			System.out.printf("%s at %d tonnes \n", whale.getName(), whale.getWeight());
		}
		
	}

	private static ArrayList<Whale> heaviestWhale(ArrayList<Whale> whales) {
		
		ArrayList<Whale> heaviestWhales = new ArrayList<Whale>();
		
		Whale heaviestWhale = whales.get(0);
		for(Whale whale : whales) {
			if(whale.getWeight() > heaviestWhale.getWeight()) {
				heaviestWhale = whale;
			}
			
		}
		
		heaviestWhales.add(heaviestWhale);
		
		for(Whale whale : whales) {
			if((whale.getWeight() == heaviestWhale.getWeight()) && !(whale.getName() == heaviestWhale.getName())) {
				heaviestWhales.add(whale);
			}
		}
		
		
		return heaviestWhales;
	}

	private static Double averageLength(ArrayList<Whale> whales) {
		
		double length = 0;
		double average = 0;
		for(Whale whale : whales) {
			length += whale.getLength();
			
		}
		
		average = length / whales.size();
		
		return average;
	}

	private static void displayFastestWhale(ArrayList<Whale> whales) {
		Whale fastest = whales.get(0);
		
		for(Whale whale : whales) {
			if(whale.getMaxSpeed() > fastest.getMaxSpeed()) {
				fastest = whale;
			}
			
			}
		
		System.out.println(fastest.toString());
		
	}

	private static void displayAtlanticWhales(ArrayList<Whale> whales) {
		for(Whale whale : whales) {
			if(whale.getMainOcean().equalsIgnoreCase("Atlantic")) {
				System.out.println(whale.toString());
			}
			
		}
		
	}

	private static void displayWhales(ArrayList<Whale> whales) {
		
		for(Whale whale : whales) {
			System.out.println(whale.toString());
		}
		
	}


}

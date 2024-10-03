package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}

	}

	// b) "GIR FEILMELDING"
	public static void tilStreng(String[] args) {
		int[] tabell = {42, 67, 89};
		String resultat = tilStreng(tabell);
		System.out.print(resultat);
	}
	
	public static String tilStreng(int[] tabell) {
		String ret = "[";
		for (int i = 0; i < tabell.length; i++){
			ret += tabell[i];
			if (i != tabell.length-1){
				ret+= ",";
			}
		}
		ret += "]"; 
		return ret;
	}

	// c)
	public static void summer(String[] args) {
		int[] tabell = {1,2,3,4,5};
		int sum =summer(tabell);
		System.out.print("Summen er:" + sum);
	}

	public static int summer(int[] tabell) {
		int sum =0;
		for (int tall : tabell) {
			sum += tall;
		}
		return sum;
	}

	// d)
	public static void finnesTall(String[] args) {
		int[] tabell = {1,2,3,4,5};
		int tall = 3;
		
		boolean finnes = finnesTall(tabell, tall);
		System.out.print("Finnes tallet " + tall + ":" + finnes);
	}
	
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int element : tabell) {
			if (element == tall) {
				return true;
			}
		}
		return false;
	}


	// e)
	public static void posisjonTall(String[] args) {
		int[] tabell = {1,2,3,4,5};
		int tall = 3;
		
		int posisjon = posisjonTall(tabell, tall);
		System.out.println("Posisjon til tallet " + tall + ":" + posisjon);
	}
	
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static void reverser(String[] args) {
		int[] tabell = {1,2,3,4,5};
		int[] reversertTabell = reverser(tabell);
		
		System.out.print("Reversert tabell: ");
		for (int tall : reversertTabell) {
			System.out.print(tall + " ");
		}
	}
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length - 1 - i];
		}
		return reversert;
	}

	// g)
	public static void erSortert(String[] args) {
		int[] tabell1 = {1,2,3,4,5};
		int[] tabell2 = {1,3,2,4,5};
		
		System.out.print("Tabell 1 er sortert: " + erSortert(tabell1));
		System.out.print("Tabell 2 er sortert: " + erSortert(tabell2));
	}
	
	public static boolean erSortert(int[] tabell) {
		int forrigeTal = Integer.MIN_VALUE;
		for (int element : tabell){
			if (element < forrigeTal) {
				return false;
			}
			forrigeTal = element;
		}
		return true;
	}

	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[tabell1.length + i] = tabell2[i];
		}

		return nyTabell;
	}
}

package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int a = 0; a < tabell.length; a++) {
			System.out.println(tabell[a]+ " ");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		if (tabell.length == 0) {
			return "[]";
		}
		String svar = "[";
		for(int a = 0; a < tabell.length; a++) {
			if (a == tabell.length-1) {
				svar += tabell[a]+"]";
			}
			else {
			svar += tabell[a] +",";
			}
		}
		return svar;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int a = 0; a < tabell.length; a++) {
			sum += tabell[a];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int a = 0; a < tabell.length; a++) {
			if (tabell[a] == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int a = 0; a < tabell.length; a++) {
			if (tabell[a] == tall) {
				return a;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] revers = new int[tabell.length];
		for (int a = 0; a < tabell.length; a++) {
			revers[a] = tabell[tabell.length-1-a];
		}
		return revers;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int a = 1; a < tabell.length; a++) {
				if (tabell[a] < tabell[a-1]) {
					return false;
				}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] megaTabell = new int[tabell1.length+tabell2.length];
		for (int a = 0; a < tabell1.length; a++) {
			megaTabell[a] = tabell1[a];
		}
		for (int a = 0; a < tabell2.length; a++) {
			megaTabell[tabell1.length+a] = tabell2[a];
		}
		return megaTabell;
	}
}

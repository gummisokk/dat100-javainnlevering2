package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.print(tilStreng(matrise));
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String ret = "";
		for(int[] tabell : matrise){
			for(int element : tabell)
			{
				ret += element + " ";
			}
			ret += "\n";
		}
		return ret;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = matrise.clone();
		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise[i].length; j++) {
				nyMatrise[i][j] *= tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length){
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length){
				return false;
			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]){
					return false;
				}
				
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				nyMatrise[i][j] = matrise[j][i];
			}
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] nyMatrise = new int[a.length][b[0].length];

		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise[0].length; j++) {
				
				int val = 0;

				for (int k = 0; k < b.length; k++){
					val += a[i][k] * b[k][j];
				}
				nyMatrise[i][j] = val;
			}
		}
		
		return nyMatrise;
	}
}

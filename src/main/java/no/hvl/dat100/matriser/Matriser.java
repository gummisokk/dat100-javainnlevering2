package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] rad : matrise) {
			for (int rekke : rad) {
				System.out.println(rekke);
				}
			}
				
				
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String svar = "";
		for(int[] rad : matrise) {
			for (int rekke : rad) {
				svar += rekke+" ";
				}
			svar += "\n";
			}
		return svar;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] bedreMatrise = new int[matrise.length][matrise[0].length];
		for(int a = 0; a < matrise.length; a++) {
			for (int b = 0; b < matrise[a].length; b++) {
				bedreMatrise[a][b] = matrise[a][b]*tall;
				}
			}
		return bedreMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length != b.length) {
			return false;
		}
		for (int f = 0; f < a.length; f++) {
			if(a[f].length != b[f].length) {
				return false;
			}
		}
		for(int f = 0; f < a.length; f++) {
			for (int s = 0; s < a[f].length; s++) {
				if (a[f][s] != b[f][s]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][]speilMatrise = new int[matrise.length][matrise[0].length];
		for (int a = 0; a < matrise.length; a++) {
			for (int b = 0; b < matrise[a].length; b++) {
				speilMatrise[a][b] = matrise[b][a];
			}
		}
		return speilMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int aRekke = a.length;
		int felles = a[0].length;
		int bRekke = b.length;
		
		int[][] multiMatris = new int [aRekke][bRekke];
		
		for (int f = 0; f < aRekke; f++) {
			for (int s = 0; s < bRekke; s++) {
				for (int t = 0; t < felles; t++) {
					multiMatris[f][s] += (a[f][t]*b[t][s]);
				}
			}
		}
		return multiMatris;
	}
}
package ZahlenRaten;

import java.util.Scanner;

public class ZahlenRaten {

	static void rateZahl(int wertebereich){		
		int zufallsZahl = (int)( Math.random()*wertebereich);
		
		System.out.println(zufallsZahl);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gib eine Zahl zwischen 0 und "+wertebereich+" ein!");
		int eingabe = scanner.nextInt();
		int zaehler=1;//f�ngt bei eins an f�r die l�ufe
		
		while (zufallsZahl != eingabe){
			System.out.println("Falsch! Versuchs noch mal!");
			eingabe = scanner.nextInt();
			zaehler++;// Wird bei jedem lauf um eins erh�ht f�r den z�hler
			
		}
		System.out.println("Richtig! Du hast "+zaehler+" Durchg�nge ben�tigt.");
		
		//Anzahl der l�ufe
	}

	public static void main(String[] args) {
		rateZahl(100);
	}
}
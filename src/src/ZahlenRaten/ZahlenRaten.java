package ZahlenRaten;

import java.util.Scanner;

public class ZahlenRaten {

	static void rateZahl(int wertebereich){		
		int zufallsZahl = (int)( Math.random()*wertebereich);
		
		System.out.println(zufallsZahl);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gib eine Zahl zwischen 0 und "+wertebereich+" ein!");
		int eingabe = scanner.nextInt();
		int zaehler=1;//fängt bei eins an für die läufe
		
		while (zufallsZahl != eingabe){
			System.out.println("Falsch! Versuchs noch mal!");
			eingabe = scanner.nextInt();
			zaehler++;// Wird bei jedem lauf um eins erhöht für den zähler
			
		}
		System.out.println("Richtig! Du hast "+zaehler+" Durchgänge benötigt.");
		
		//Anzahl der läufe
	}

	public static void main(String[] args) {
		rateZahl(100);
	}
}
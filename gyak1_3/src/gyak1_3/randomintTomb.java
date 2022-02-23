package gyak1_3;

import java.util.Random;

public class randomintTomb {

	public static void main(String[] args) {
		//Java-gyak01 3. feladata
		
		Random num = new Random();
		int[] szamok = new int[10];
		
		//1. feladat
		System.out.println("Kiiratas:");
		for (int i = 0; i < 10; i++) {
			szamok[i] = num.nextInt(100);
			System.out.println(szamok[i]);
		}
		
		//2. feladat
		System.out.println("Kiiratas visszafele:");
		for (int i = 9; i >= 0; i--) {
			System.out.println(szamok[i]);
		}
		
		//3. feladat
		System.out.println("A paros szamok atlaga:");
		parosSzamokAtlaga(szamok);
		
		//4. feladat
		System.out.println("A legkisebb szam:");
		minimumKereses(szamok);
		
		//5. feladat
		System.out.println("Monoton novekvo-e a szamtomb?");
		monotonE(szamok);
		
		//6. feladat
		System.out.println("A szamtomb sorba rendezve: ");
		sorbaRendezes(szamok);
	}
	
	static void parosSzamokAtlaga(int[] numbers) {
		int szamlalo = 0, osszeg = 0;
		double atlag;
		
		for (int i = 0; i < 10; i++) {
			if (numbers[i] % 2 == 0) {
				osszeg = osszeg + numbers[i];
				szamlalo++;
			}
		}
		
		atlag = (double)osszeg/szamlalo;
		
		System.out.println(atlag);
	}
	
	static void minimumKereses(int[] numbers) {
		int minimum = 200;
		
		for(int i = 0; i < 10; i++) {
			if (numbers[i] < minimum) {
				minimum = numbers[i];
			}
		}
		
		System.out.println(minimum);
	}
	
	static void monotonE (int[] numbers) {
		int joE = 0;
		
		for (int i = 0; i < 9; i++) {
			if (numbers[i] < numbers[i+1]);
			else {
				joE++;
			}
		}
		
		if (joE == 0) {
			System.out.println("Igen");
		}
		else {
			System.out.println("Nem");
		}
	}
	
	static void sorbaRendezes (int[] numbers) {
		int minimum, temp = 0;
		for (int i = 0; i < 8; i++) {
			minimum = i;
			
			for (int j = i+1; j < 10; j++) {
				if (numbers[j] < numbers[minimum]) {
					minimum = j;
				}
			}
			
			if (minimum != i) {
				temp = numbers[minimum];
				numbers[minimum] = numbers[i];
				numbers[i] = temp;
			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numbers[i]);
		}
	}
}

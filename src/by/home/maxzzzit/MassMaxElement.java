package by.home.maxzzzit;

import java.util.Scanner;
public class MassMaxElement {
	public static void main(String [] args) {
		int razm;
		Scanner schitka = new Scanner(System.in);
		System.out.print("Введите размер Вашего массива: ");
		razm = schitka.nextInt();
		int [] array = new int [razm];
		VivodMass(array);
		Max(array);
	}
	
	private static void VivodMass (int [] massiv) {
		for (int i = 0; i < massiv.length; i++) {
			massiv[i] = (int)(10+Math.random()*89);
			System.out.print(massiv[i]+" ");
		}
	}
	
	private static void Max (int [] massiv) {
		int pervoe = massiv[0];
		for (int j = 0; j < massiv.length; j++) {
			if (massiv[j] > pervoe)
				pervoe = massiv[j];
			}
		System.out.print("\n"+pervoe);
		}
	}

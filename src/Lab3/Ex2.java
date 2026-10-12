package Lab3;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez la hauteur du triangle : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			// Espaces pour centrer le triangle
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Étoiles : 1, 3, 5, 7...
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		sc.close();
	}
}

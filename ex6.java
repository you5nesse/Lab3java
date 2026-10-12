package Lab3;


import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n < 1 || n > 100000 || k < 1 || k > n) {
            sc.close();
            return;
        }

        int[] T = new int[n];
        int MAXV = 100000;
        int[] freq = new int[MAXV + 1];

        // Lire le tableau
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int distinct = 0;

        // Initialiser la premiere fenetre
        for (int i = 0; i < k; i++) {
            int x = T[i];

            if (freq[x] == 0) {
                distinct++;
            }

            freq[x]++;
        }

        // Afficher le resultat de la premiere fenetre
        System.out.print(distinct);

        // Faire glisser la fenetre
        for (int i = k; i < n; i++) {

            // Retirer l'element sortant
            int out = T[i - k];
            freq[out]--;

            if (freq[out] == 0) {
                distinct--;
            }

            // Ajouter l'element entrant
            int in = T[i];

            if (freq[in] == 0) {
                distinct++;
            }

            freq[in]++;

            // Afficher le resultat
            System.out.print(" " + distinct);
        }

        System.out.println();
        sc.close();
    }
}

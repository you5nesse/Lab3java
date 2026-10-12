package Lab3;
import java.util.Scanner;

public class ex5 {

    public static void rotate90ClockwiseInPlace(int[][] A) {
        int N = A.length;
        int temp;

        // Etape 1 : transposition de la matrice
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // Etape 2 : inverser chaque ligne
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }

    public static void afficher(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner N : ");
        int N = sc.nextInt();

        if (N < 2 || N > 200) {
            System.out.println("N doit etre entre 2 et 200.");
            sc.close();
            return;
        }

        int[][] A = new int[N][N];

        System.out.println("Donner les elements de la matrice :");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        rotate90ClockwiseInPlace(A);

        System.out.println("Matrice apres rotation :");
        afficher(A);

        sc.close();
    }
}

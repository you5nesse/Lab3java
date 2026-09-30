package Lab3;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("donner n :");
	int n = sc.nextInt();
	double s = 0 ;
    double m = 1;
	for(int i=1 ; i<n ; i++) {
		s+=m/i;
	}
	System.out.print("la somme est : " + s);
	}
}

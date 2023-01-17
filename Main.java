
package exerciciosprorpostosfor01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner hs = new Scanner(System.in);
		
		int n = hs.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 !=0) {
				System.out.println(i);
			}
			
		}
		
		hs.close();

	}

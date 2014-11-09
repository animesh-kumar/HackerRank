import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int[] growthCycles = new int[n];
		for (int i = 0; i < n; i++) {
			growthCycles[i] = in.nextInt();
		}
		for (int cycle : growthCycles) {
			int size = 1;
			if (cycle == 0) {
				System.out.println(size);
				continue;
			}
			for (int i = 1; i <= cycle; i++) {
				if (i % 2 == 0) {
					size = size + 1;
				} else {
					size = size * 2;
				}
			}
			System.out.println(size);
		}

	}
}
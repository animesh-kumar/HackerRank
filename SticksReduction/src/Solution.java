//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class Solution {
//
//	public static void main(String[] args) {
//		/*
//		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
//		 * Your class should be named Solution.
//		 */
//		Scanner in = new Scanner(System.in);
//		int n;
//		n = in.nextInt();
//		List<Integer> sticks = new ArrayList<Integer>();
//		for (int i = 0; i < n; i++)
//			sticks.add(in.nextInt());
//		int min = Collections.min(sticks);
//		int N = sticks.size();
//		while (N > 0) {
//			List<Integer> list = new ArrayList<Integer>();
//			min = Collections.min(sticks);
//			for (int stick : sticks) {
//				stick = stick - min;
//				if (stick == 0) {
//					continue;
//				}
//				list.add(stick);
//			}
//			System.out.println(sticks.size());
//			sticks = list;
//			N = sticks.size();
//		}
//		in.close();
//	}
//}


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[26]; int cnt = 0;
        for (int i = 0; i < n; i++) {
            
            char[] ch = in.next().toCharArray();
            for (char k : ch) {
                //System.out.print(arr[k - 'a'] + " ");
                if (arr[k - 'a'] == cnt) {
                   // System.out.print( " animesh ");
                    arr[k - 'a']++;
                } 
            }
            //System.out.println();
            cnt++;
            
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == n) ans++;
        }
        in.close();
        System.out.println(ans);
        
    }
    
}
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
GemStones
=========

John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lowercase latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a 'gem-element' if it occurs at least once in each of the rocks.

Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format <br>
The first line consists of N, the number of rocks. 
Each of the next N lines contain rocks' composition. Each composition consists of lowercase letters of English alphabet.

Output Format <br>
Print the number of gem-elements that are common in these rocks. If there are none, print 0.

Constraints <br>
1 ≤ N ≤ 100 <br>
Each composition consists of only small latin letters ('a'-'z'). <br>
1 ≤ Length of each composition ≤ 100<br>

Sample Input<br>
3 <br>
abcdde<br>
baccd<br>
eeabg<br>

<br>
Sample Output<br>
2<br>


Explanation <br>
Only "a", "b" are the two kind of gem-elements, since these are the only characters that occur in each of the rocks' composition.

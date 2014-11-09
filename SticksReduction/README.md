SticksReduction (Cut the sticks)
=================================

Link : https://www.hackerrank.com/challenges/cut-the-sticks <br>

You are given N sticks, where each stick is of positive integral length. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.
<br>
<br>
Suppose we have 6 sticks of length <br>
5 4 4 2 2 8<br>
then in one cut operation we make a cut of length 2 from each of the 6 sticks. For next cut operation 4 sticks are left (of non-zero length), whose length are
<br><br>
3 2 2 6<br>
Above step is repeated till no sticks are left.<br>
<br>
Given length of N sticks, print the number of sticks that are cut in subsequent cut operations.<br>
<br>
Input Format <br>
The first line contains a single integer N. <br>
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.<br>

Output Format <br>
For each operation, print the number of sticks that are cut in separate line.<br>

Constraints <br>
1 ≤ N ≤ 1000 <br>
1 ≤ ai ≤ 1000<br>
<br>
Sample Input #00<br>
<br>
6<br>
5 4 4 2 2 8<br><br>
Sample Output #00<br>
<br>
6<br>
4<br>
2<br>
1<br><br>
Sample Input #01<br>
<br>
8<br>
1 2 3 4 3 3 2 1<br><br>
Sample Output #01<br>
<br>
8<br>
6<br>
4<br>
1<br>
Explanation<br>
<br><br>
Sample Case #00 :<br>
<br>
sticks-length        length-of-cut   sticks-cut<br>
5 4 4 2 2 8             2               6<br>
3 2 2 _ _ 6             2               4<br>
1 _ _ _ _ 4             1               2<br>
_ _ _ _ _ 3             3               1<br>
_ _ _ _ _ _           DONE            DONE<br><br>
Sample Case #01<br>

sticks-length         length-of-cut   sticks-cut<br>
1 2 3 4 3 3 2 1         1               8<br>
_ 1 2 3 2 2 1 _         1               6<br>
_ _ 1 2 1 1 _ _         1               4<br>
_ _ _ 1 _ _ _ _         1               1<br>
_ _ _ _ _ _ _ _       DONE            DONE<br>
<br>

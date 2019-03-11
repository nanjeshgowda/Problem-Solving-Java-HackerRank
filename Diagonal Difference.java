Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

arr: an array of integers .
Input Format

The first line contains a single integer, , the number of rows and columns in the matrix . 
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x


Solution in java:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int pd=0,npd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i)
                    pd=pd+a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-j-1){
                    npd=npd+a[i][j];
                }
            }
        }
        int dif=npd-pd;
        dif=Math.abs(dif);
        System.out.println(dif);
    }
}


Solution in c:



#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main() {
  int a[100][100], n, c = 0, d = 0, i, j, sum = 0;
  scanf("%d", &n);
  for (i = 0; i < n; i++)
    for (j = 0; j < n; j++)
      scanf("%d", &a[i][j]);
  for (i = 0; i < n; i++)
    c = c + a[i][i];
  for (i = 0; i < n; i++)
    d = d + a[i][n - 1 - i];
  sum = abs(c - d);
  printf("%d", sum);

  /* Enter your code here. Read input from STDIN. Print output to STDOUT */
  return 0;
}

/* 
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8
*/

/*****SOLUÇÃO*****/

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int index = n * (n - 1) + 1;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += index + (i * 2);
        }
        return total;
    }
}
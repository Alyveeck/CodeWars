//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

//Note: The function accepts an integer and returns an integer


/*****Solução*****/


public class SquareDigit {

    public int squareDigits(int n) {
      char[] digits = ("" + n).toCharArray();
      String str = "";
      
      for(int i = 0; i < digits.length;i++){
        int x = Integer.parseInt(String.valueOf(digits[i]));
        str = str +(x * x);
      }
      
      n = Integer.parseInt(str);
      return n;
    }
  }
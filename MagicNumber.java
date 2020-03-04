/*For a given set of numbers, magic number is a number greater than 1
whose square perfectly divides the product of these numbers.
weite an algorthm to find smallest magic number from given set of numbers.*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    int n = kb.nextInt();
    long product=1;
    long val[] = new long [n];
    for (int i = 0; i<val.length;i++)
    {
      val[i]=kb.nextLong();
      product = product*val[i];
    }

    for(int j=2;j<product;j++){
      if (product%(j*j)==0)
      {
        System.out.println(j);
        break;
      }
    }

  }
}

import java.util.*; 
import java.io.*;

class Main {

  public static int MathChallenge(int num1, int num2) {
    // code goes here

    int numero = 1;
    for(int i = 1; i <= num1 && i <= num2; i++){
      if (num1 % i == 0 && num2 % i == 0) {
        numero = i;
      }
    }

    return numero;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(MathChallenge(s.nextLine())); 
  }

}

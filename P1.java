package ProjectOOPs;
/*
Write a program to swap 2 String without a temporary variable?
 */
public class P1 {
        public static void main(String[] args) {
            String w1 = "Honey";
            String w2 = "Funny";

            System.out.println("Before swapping:");
            System.out.println("Word1: " + w1);
            System.out.println("Word2: " + w2);

          //Swap String without a temporary variable
          w1=w1+w2;
          w2=w1.substring(0,w1.length()-w2.length());
          w1=w1.substring(w2.length());

            System.out.println("After swapping:");
            System.out.println("Word1 = " + w1);
            System.out.println("Word2 = " + w2);
        }
    }



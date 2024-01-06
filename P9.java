package ProjectOOPs;
/*
Find the First Non-Repeating Character in a String:
 Given a string, find and return the first non-repeating
 character. For example, in the string "abracadabra",
 the first non-repeating character is 'c'.
 */
public class P9 {
    public static void main(String[] args) {

        String str = "abracadabra";

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i),str.indexOf(str.charAt(i))+1)==-1){
                System.out.println("Non-repeating character is: "+str.charAt(i));
            }
        }
        }
        }

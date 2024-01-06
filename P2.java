package ProjectOOPs;
/*
Find out how many alpha characters are present in a string?
 */
public class P2 {
    public static void main(String[] args) {
        String input="Hello123World";

        System.out.println(input.replaceAll("[^A-Za-z]","").length());

    }
}
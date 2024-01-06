package ProjectOOPs;

import java.util.ArrayList;
import java.util.List;

/*
How can you remove all duplicates from ArrayList?

 */
public class P10 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Gulizar");
        names.add("Sare");
        names.add("Buket");
        names.add("Sare");
        names.add("Melisa");
        names.add("Yusuf");
        names.add("Yusuf");


            ArrayList<String> names1 = new ArrayList<>();

            // Iterate through the original list
            for (String s : names) {
                // Check if the element is not already in the result list
                if (!names1.contains(s)) {
                    // If not, add it to the result list
                    names1.add(s);
                }
            }

            System.out.println(names1);

        }
    }
package ProjectOOPs;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".
 */
public class P8 {
    public static void main(String[] args) {
        List<String> stringslist=new ArrayList<>();
        stringslist.add("Ali");
        stringslist.add("Ahmet");
        stringslist.add("Ayse");
        stringslist.add("Sare");
        stringslist.add("Gamze");
        for(String s:stringslist){
            if (s.startsWith("A")){
                System.out.println(s.toLowerCase());
            }
        }

        }

    }

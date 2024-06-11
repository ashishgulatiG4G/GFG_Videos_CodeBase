package sortString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sortString {
    public static void main(String[] args) {


        String str = "geeksforgeeks";



        /*
         * 1. Using character arrays (sort())
         *      1. Transform string into character array
         *      2. Sort the character Array
         *      3. Concatenate the character array to form a string
         * 
         */
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        System.out.println("Using char sort() : " + sortedStr);


        
        str = "geeksforgeeks";


/*
         * 2. Using Stream API
         *      1. Convert into stream of characters
         *      2. Sorting the stream of characters
         *      3. Combine stream of strings
         */


         sortedStr = str.chars()
            .sorted()
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());
        System.out.println("USing stream API: " + sortedStr);

    }
}

/*
 * 
 * 2. 
 * 
 */
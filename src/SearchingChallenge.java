import java.util.*;
import java.io.*;
public class SearchingChallenge {
    public static String SearchingChallenge(String str) {
        // code goes here
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }



}
    /*Searching Challenge
    Have the function SearchingChallenge(str) take the str parameter,
search for all the numbers in the string, add them together, then return that final number.
        For example: if str is "88Hello 3World!" the output should be 91.
        You will have to differentiate between single digit numbers and multiple digit numbers
        like in the example above. So "55Hello" and "5Hello 5" should return two different answers.
        Each string will contain at least one letter or symbol.
        Examples
        Input: "75Number9"
        Output: 84
        Input: "10 2One Number*1*"
        Output: 13
        Browse Resources
        Search for any help or documentation you
        might need for this problem. For example: array indexing, Ruby hash tables, etc.  */
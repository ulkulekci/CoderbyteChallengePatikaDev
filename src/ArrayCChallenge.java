import java.util.Scanner;

public class ArrayCChallenge {
//import java.util.*;
//import java.io.*;

    class Main {

        public static int ArrayChallenge(int[] arr) {
            // code goes here
            return arr[0];
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(ArrayChallenge(s.nextLine()));
        }

    }}
   /* Array Challenge
    Have the function ArrayChallenge(arr) take the array of numbers stored in arr and determine
    if the array forms a superincreasing sequence where each element in the array is greater
    than the sum of all previous elements. The array will only consist of positive integers.
    For example: if arr is [1, 3, 6, 13, 54] then your program should return the string "true" because it forms a
    superincreasing sequence. If a superincreasing sequence isn't formed, then your program should return the string "false"
    Examples
    Input: new int[] {1,2,3,4}
    Output: false
    Input: new int[] {1,2,5,10}
    Output: true*/

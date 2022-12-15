import java.util.Scanner;

public class StringChallengee {
//import java.util.*;
//import java.io.*;

    class Main {

        public static String StringChallenge(String str) {
            // code goes here
            return str;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(StringChallenge(s.nextLine()));
        }

    }}
    /*String Challenge
    Have the function StringChallenge(str) read the str parameter
     being passed which will be an encrypted string and your program should output the original decrypted string.
     The encryption being used is the following: For every character i in str up to the second to last character,
     take the i and i+1 characters and encode them by writing the letters of the alphabet, in order,
     that range in the same direction between those chosen characters.
     For example: if the original string were bo then it would be encoded as cdefghijklmn,
     but if the string were boa then bo is encoded as cdefghijklmn and oa is encoded
     as nmlkjihgfedcb with the final encrypted string being cdefghijklmnnmlkjihgfedcb.
     So str may be something like the encrypted string just written, and your program
     should decrypt it and output the original message.
    The input string will only contains lowercase characters (a...z). There are also three important
    rules to this encryption based on specific character sequences.

            1) If the original string contains only one letter between two chosen characters,
            such as the string ac then this would be encrypted as bR with R standing for
            what direction in the alphabet to go in determining the original characters. The encrypted string bR
            represents ac but the encrypted string bL represents ca (R = right, L = left).

            2) If the original string contains zero letters between two chosen characters,
            such as the string ab then this would be encrypted as abS, with S representing the
            fact that no decryption is needed on the two letters preceding S. For example,
            if the original string were aba then the encryption would be abSbaS,
            but be careful because decrypting this you get abba, but the actual original string is aba.

            3) If the original string contains a repeat of letters,
            such as the string acc then this would be encrypted as bRcN,
            with N representing the fact that no change in characters occurred on the character preceding N.
            The input string will never only be composed of repeated characters.
            Examples
    Input: "bcdefghijklmnopqrstN"
    Output: att
    Input: "abSbaSaNbR"
    Output: abaac
    System.out.println("1)" + AlphabetRunEncryption("defghijklmnnmlkjihgfedeS") + " = code");
        System.out.println("2)" + AlphabetRunEncryption("abSbaSaNbR") + " = abaac");
        System.out.println("3)" + AlphabetRunEncryption("abSbNcR") + " = abbd");
        System.out.println("4)" + AlphabetRunEncryption("bRdR") + " = ace");
        System.out.println("5)" + AlphabetRunEncryption("bRcNdR") + " = acce");
        System.out.println("6)" + AlphabetRunEncryption("cdefghijklmnopqrstuvwxxwvusrqponmlkjihgf") + " = byte");
        System.out.println("7)" + AlphabetRunEncryption("abSbaS") + " = aba");
        System.out.println("8)" + AlphabetRunEncryption("baSbcdefghijklmnopqrstNtNtNtsS") + " = batttts");
        System.out.println("9)" + AlphabetRunEncryption("abSbcScdSdeSefS") + " = abcdef");
        System.out.println("10)" + AlphabetRunEncryption("baSaNabScdefghijklmnop") + " = baabq");*/

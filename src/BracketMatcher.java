import java.util.Scanner;
public class BracketMatcher {

    class Main {
        int a=0,b=0;
        public static int BracketMatcher(String str) {
            int a=0,b=0,s;
        for (int i=0;i<str.length();i++)
          if(str.charAt(i)=='(')
          {
         a=1+a;
          }
            else if(str.charAt(i)==')')
            {
                b=1+b;
            }
        if (a==b){
      s=1;

        } else {
            s=0;
        }
            return s;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(BracketMatcher(s.nextLine()));
        }

    }
}
/*Bracket Matcher
Have the function BracketMatcher(str) take the str parameter being passed and return 1
if the brackets are correctly matched and each one is accounted for.
Otherwise return 0. For example: if str is "(hello (world))",
then the output should be 1, but if str is "((hello (world))"
the the output should be 0 because the brackets do not correctly match up. Only "(" and ")"
will be used as brackets. If str contains no brackets return 1.
Examples
Input: "(coder)(byte))"
Output: 0
Input: "(c(oder)) b(yte)"
Output: 1*/
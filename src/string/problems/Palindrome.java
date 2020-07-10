package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

    String original = "";

    //System.out.println("Character reverse result : ");
    palindromeCount("MOM");
        System.out.println("DAD");
        System.out.println("MADAM");

    }
    public static void palindromeCount(String original){
        String reverse = ""; //no space into the code.
        //original.length()-1 = String word mom-1 =mo. start deducting from end.
        for (int i=original.length()-1; i>=0; i--){
            reverse += original.charAt(i);
            //  System.out.println(reverse);  //0=m,1=mo,2=mom. character reverse.
            // System.out.println(original); this line written end of the line
        }
        boolean palindrome = true;
        for(int i=0; i<original.length(); i++){
            if(original.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("Palindrom!!");
        }else {
            System.out.println("Not a Palindrome!!");
        }
        System.out.println(original);
    }
}

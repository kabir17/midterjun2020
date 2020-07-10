package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        System.out.println("permutation result in ABC : ");
        permute("ABC");
        System.out.println("-----------------");
        System.out.println("permutation result in XYZ : ");
        permute("xyz");
    }
    //declare pre-condition/set up permute
    public static void permute(String full){
        if(full == null || full.length() == 0) {
            System.out.println("You must provide a String of length > 0.");
            return;  //check the pre-condition.
        }
        permute("",full);  //previous and remaining arguments
    }
    //declare permute method .
    private static void permute(String previous,String remaining){
        if(remaining.length()==0){  //if abc then previous is a
            System.out.println(previous);
            return;
        }
        for (int i=0; i<remaining.length(); i++){   //Now add by loop
            permute(previous + remaining.charAt(i),remaining.substring(0,i)+
                    remaining.substring(i+1, remaining.length()));
        }
    }
}

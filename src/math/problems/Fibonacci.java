package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        //declare variable
       int prev=0;
       int next=1;

       //Numbers count by loop
       for (int i=0; i<=40; i++){
           System.out.println(prev);
          prev = prev+next;  //0+1=1
          next = prev-next;  //1-1=0
       }
        System.out.println("Total fibonacci are = 40");
    }
}

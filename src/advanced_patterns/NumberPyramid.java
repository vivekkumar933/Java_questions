/*
        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 
 */

package advanced_patterns;

public class NumberPyramid {
    public static void numberedPyramid(int n){

        // outer loop
        for(int i=1;i<=n;i++){

           //inner loopf for space and space printing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberedPyramid(9);
    }
}

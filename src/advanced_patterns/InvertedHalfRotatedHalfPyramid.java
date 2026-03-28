/*  *
   **
  ***
 ****
***** */
package advanced_patterns;

public class InvertedHalfRotatedHalfPyramid {
    public static void InvRotHlfPyramid(int totRow){
        for(int i=1;i<=totRow;i++){
            //for space printing 
            for(int j=1;j<=totRow-i;j++){
                System.out.print(" ");
            }
            //for '*' printing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvRotHlfPyramid(5);
    }
}

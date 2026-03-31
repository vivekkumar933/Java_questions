/*
      *******
     *     *
    *     *
   *     *
  *     *
 *     *
*******
*/

package advanced_patterns;

public class HollowRhombus {
    public static void hollowRhombusPattern(int n){
        //Outer loop
        for(int i=1;i<=n;i++){

            //inner loop for spaces outside rhombus.
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //inner loop for stars and spaces inside the rhombus.
            for(int j=1; j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombusPattern(7);
    }
}

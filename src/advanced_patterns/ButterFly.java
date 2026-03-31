/*
*            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************
**************
******  ******
*****    *****
****      ****
***        ***
**          **
*            *
*/

package  advanced_patterns;

public class ButterFly {
    public static void butterFlyPattern(int n){
        // First half of pattern

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
    }

    // Second half of the pattern

    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
         for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
  }


public static void main (String args[]){
    butterFlyPattern(7);
   }
}
/*
      *
     ***
    *****
   *******
  *********
 ***********
*************
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */

package advanced_patterns;

public class Diamond {
    public static void diamondPattern(int n){
       
       //First half of diamond.
        for(int i=1;i<=n;i++){
            
            //loop for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //loop for stars.
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second half of diamond
        for(int i=n;i>=1;i--){
            //loop for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //loop for stars.
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        diamondPattern(7);
    }
    
}

/*
12345678910
123456789
12345678
1234567
123456
12345
1234
123
12
1
 */

package advanced_patterns;

public class invertedHalfPyramidWithNumbers{
    public static void invertedHalfPyramid(int n){
        for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
    
    

    public static void main (String args[]){
        invertedHalfPyramid(10);
    }
}

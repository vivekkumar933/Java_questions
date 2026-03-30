/*
1
01
101
0101
10101
010101
1010101
01010101
101010101
0101010101
*/
package advanced_patterns;

public class TriangleWith0And1 {
    public static void tirangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                        System.out.print("0");
                }
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        tirangle(10);
    }
}

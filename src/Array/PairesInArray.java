/*
(5,7)(5,8)(5,6)(5,1)(5,9)
(7,8)(7,6)(7,1)(7,9)
(8,6)(8,1)(8,9)
(6,1)(6,9)
(1,9) 
*/

package Array;

public class PairesInArray {
    public static void pairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
                for(int j=i+1;j<numbers.length;j++){
                    System.out.print("("+curr+","+numbers[j]+")");
                }
                System.out.println();
                }
    }

    public static void main(String[] args) {
        int numbers[]={5,7,8,6,1,9};
        pairs(numbers);
    }
}

// Check if s number id odd or eben using Bit-manipulation 


package Bit_maniulation;

public class oddEvenBitManipulation {
    public static void oddEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        oddEven(3);
    }
}

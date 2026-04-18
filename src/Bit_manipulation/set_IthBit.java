package Bit_manipulation;

public class set_IthBit {
    public static int setIthBit(int n,int i){
        int bitMask=i<<1;
        return n|bitMask;
    }

    public static void main(String[] args) {
        
        System.out.println(setIthBit(10, 3));
    }
    
}

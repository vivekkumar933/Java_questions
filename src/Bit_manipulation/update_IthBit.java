package Bit_manipulation;

public class update_IthBit {
    public static int clearIthBit(int n,int i){
        int bitMask=~(i<<1);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit){
        n=clearIthBit(n, i);
        int BitMask=newBit<<i;
        return n|BitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}

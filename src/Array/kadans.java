package Array;

public class kadans {
    public static void kadanSum(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<number.length;i++){
            cs=cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("max sub array sum is:"+ms);

    }

    public static void main(String[] args) {
        int number[]={4,5,8,6,9,3};
        kadanSum(number);
    }
    
}

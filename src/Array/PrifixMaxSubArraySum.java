package Array;

public class PrifixMaxSubArraySum {
    public static void maxSubArraySum(int number[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];

        //calculating prefix array;

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];

        }

        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=0;j<number.length;j++){
                int end=j;
                currSum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maxSum= "+maxSum);

    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxSubArraySum(number);


}
}

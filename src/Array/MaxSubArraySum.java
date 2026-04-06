package Array;

public class MaxSubArraySum {
    public static void maxSubSum(int numbers[]){

        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maxSum="+maxSum);
    }


public static void main(String[] args) {
    int numbers[]={2,4,8,0,12,17,20};
    maxSubSum(numbers);
    }
}

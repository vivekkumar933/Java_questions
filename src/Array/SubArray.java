/*
Print Total Sub Arrays.

5 0 
5 0 4 
5 0 4 2 
5 0 4 2 3 
5 0 4 2 3 6 
5 0 4 2 3 6 1 

0 4 
0 4 2 
0 4 2 3 
0 4 2 3 6 
0 4 2 3 6 1 

4 2 
4 2 3
4 2 3 6
4 2 3 6 1

2 3
2 3 6
2 3 6 1

3 6
3 6 1

6 1


Total Subarrays=21
 */
package Array;

public class SubArray {
    public static void PrintSubArray(int numbers[]){
        int totSubArray=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                totSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays="+totSubArray);


    }
    public static void main(String[] args) {
        int numbers[]={5,0,4,2,3,6,1};
        PrintSubArray(numbers);
    }
}

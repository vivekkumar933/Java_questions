package Array;

public class twiceElement {
    public static boolean twiceElementInArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){    
                    return true; 
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,2};
       System.out.println(twiceElementInArray(arr));
    }
}

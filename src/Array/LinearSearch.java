package Array;

public class LinearSearch {
    public static int linear_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,11,12,14,16,18,20};
        int key=10;
        int index=linear_search(arr, key);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("key is at index:"+index);
        }
    }
    
}

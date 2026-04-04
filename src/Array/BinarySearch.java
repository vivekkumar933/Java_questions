package Array;

public class BinarySearch {
    public static int binSearch(int arr[],int key){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={5,8,9,10,25,55,86,99};
        int kay=25;
        System.out.println("Element is present at index:"+ binSearch(arr, kay));
    }
}

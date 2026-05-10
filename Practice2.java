import java.util.Arrays;
public class Practice2 {
    // 1)Linear Search
    public static boolean linearSearch(int key,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
    // Binary Search
    public static boolean BinarySearch(int key,int arr[]){
        Arrays.sort(arr);
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]>key){
                end = mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    // 2)Sorting Algorithm
    // 1)Bubble Sort
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }
    // 2)Selection Sort
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           
            int idx =i;
            for(int j=i+1;j<arr.length;j++){
              if(arr[idx]>arr[j]){
                idx=j;
              }
            }
            //swap
            int temp =arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for(int nums: arr){
            System.out.print(nums);
        }
    }
    // 3)Insertion Sort
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = i;
            int prev = i-1;
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1] = arr[prev];
            }
            arr[prev+1] = arr[curr];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[]args){
 int arr[]={2,1,5,1,9,2};
 int key = 1;
insertionsort(arr);
    }
}

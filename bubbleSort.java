import java.util.*;

class bubbleSort{
    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n;i++){
            if(arr[i] == arr[i+1]){
                n--;
                continue;
            }else{
            System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};

        System.out.print("Sorted Array: ");
        BubbleSort(arr);
        print(arr);

    }
}
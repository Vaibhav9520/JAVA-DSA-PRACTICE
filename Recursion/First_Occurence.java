
public class First_Occurence {
    public static int firstOcc(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {4,6,2,5,7,3,1,5};
        System.out.println("Key present at Index: " + firstOcc(arr,5,0));

    }
}

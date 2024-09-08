
public class Last_Occurence {
    public static int LastOcc(int arr[] , int key,int i){
        if(i == arr.length){
            return -1;
        }
        
        int isfound = LastOcc(arr, key, i+1);

        if(isfound == -1 && arr[i] == key){
            return i;
        }

        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,1,2,5,7,8,5};
        System.out.println("Key present in Index: " + LastOcc(arr,5,0));
    }
}

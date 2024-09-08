public class decresingNum {
    public static void printDec(int num){
        if(num == 1){
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        printDec(num-1);
    }
    public static void main(String[] args) {
        int a = 10;
        printDec(a);
    }
    
}

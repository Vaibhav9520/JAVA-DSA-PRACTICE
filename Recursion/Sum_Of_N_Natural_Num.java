public class Sum_Of_N_Natural_Num {
    public static int CalSum(int num){
        if(num == 1){
            return 1;
        }
        int sm = num + CalSum(num - 1);
        return sm;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalSum(n));
    }
}

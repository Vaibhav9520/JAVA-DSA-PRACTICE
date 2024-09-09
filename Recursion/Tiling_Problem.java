public class Tiling_Problem {
    public static int tileProb(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return tileProb(n-1) + tileProb(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tileProb(n));
    }
}

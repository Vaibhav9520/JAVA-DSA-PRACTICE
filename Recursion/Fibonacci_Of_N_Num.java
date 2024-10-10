
public class Fibonacci_Of_N_Num {
    public static int fib(int num){
        if(num == 0 || num == 1){
            return num;
        }
        

        
        int fn1 = fib(num-1);
        int fn2 = fib(num-2);
        int fn = fn1 + fn2;
        return fn;
        
    }
    public static void main(String[] args) {
        int num = 25;
        System.out.println(fib(num));
    }
}

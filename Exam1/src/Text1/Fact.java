package Text1;

public class Fact {
    public static int fact(int n){
        if(n == 0) return 0;
        return n * fact(n - 1);
    }
    public static int squareSum(int[] A){
        int sum = 0;
//        for(int e : A){
//            sum += e *e;
//        }
        for(int i = 0; i < A.length; i++) {
            sum += A[i] * A[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        System.out.println(squareSum(a));
    }
}

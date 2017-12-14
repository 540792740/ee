public class Problem2 {


    public static double  fact(double  a){
        double  res = 1;
        for(double  i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }
    public static double  fact2(double  b){
        if(b == 0) return 1;
        return b * fact2(b - 1);
    }

    public static void main (String[] args){
        System.out.println(fact(10));
        System.out.println(fact2(5));

    }
}

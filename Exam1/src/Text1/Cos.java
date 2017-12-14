package Text1;

public class Cos {
    public static void main(String[] args){
        System.out.println(cosine(4,5));
    }
    public static double cosine(int x, int n){
        double num = 1;
        double den = 1;
        double sum = 0;
        for(int i = 1; i <= n; i = i + 1) {
            num = num * x;
            den = den * i;
            if (i % 2 == 0) {
                sum = sum + num / den;
            }
        }
        return sum + 1;
    }

}

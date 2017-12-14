public class Problem5 {

    public static double cosine(int x, int n) {
        int numerator = 1, denominator = 1;
        double sum = 0;
        for (int i = 1; i <= n; i = i + 1) {
            numerator = x * numerator;
            denominator = denominator * i;
            if (i % 2 == 0) {
                sum = sum + numerator * 1.0 / denominator;
            }

        }
        return sum + 1;
    }


    public static void main(String[] args){
        System.out.println(cosine(4,5));

    }
}

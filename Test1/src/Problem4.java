public class Problem4 {
    public static int sumSquare(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length-1; i++) {
            sum += a[i] * a[i+1];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] a = {1,5,1,6,1,2,5};
        System.out.print(sumSquare(a));


    }
}

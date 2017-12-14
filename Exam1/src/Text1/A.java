package Text1;

public class A {

    public static void main(String[] args){
        int[] a1 = {1, 5, 1, 6};
        System.out.println(sumSquare(a1));
    }

    public static double sumSquare(int[] a){
        int sum = 0;
        int res = 0;
        for(int i = 0; i <= a.length-1; i++){
            if(a[i] != 5) {
                sum = a[i] * a[i];
                res = res + sum;
            }
        }
        return res;
    }
}

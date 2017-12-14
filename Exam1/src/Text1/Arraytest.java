package Text1;

public class Arraytest {
    public static double arrayadd(int[] a){
        int sum = 0;
        for(int i = 0; i <= a.length -1; i++){
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(arrayadd( a ));

    }
}

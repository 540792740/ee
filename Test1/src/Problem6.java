public class Problem6 {
    public static double force(double me, double mm, double di){
        final double G = 6.67408e-11;
        double F = 0;
        F = -((G * me * mm) / (di * di));
        return F;
    }
    public static void main(String[] a){

        System.out.println( force(5.6e24, 7.34e22, 384472282) );
    }
}
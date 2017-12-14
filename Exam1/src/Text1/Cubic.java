package Text1;

public class Cubic {
    public static void main(String[] args){
        Cubic c1 = new Cubic(1, 2.5, -1.5, 3);
        Cubic c2 = new Cubic(3, -1.0, 2.4);
        System.out.println(c2.eval(2));
        Cubic c3 = c1.add(c2);
        Cubic c4 = c1.neg();
        System.out.println(c4);
    }
    double a ,b ,c, d;

    public Cubic(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Cubic(double b, double c, double d){
        a = 0;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public double eval(double x){
        return this.a * x * x * x + this.b * x * x + this.c * x + this.d;
    }
    public Cubic add(Cubic n2){
        return new Cubic((this.a + n2.a), (this.b + b), (this.c + c), (this.d + d));
    }
    public Cubic neg(){
        return new Cubic(-this.a, -this.b, -this.c, -this.d);
    }
    public String toString(){
        return a + "x^3" + b + "x^2" + c + "x" + d;
    }
}

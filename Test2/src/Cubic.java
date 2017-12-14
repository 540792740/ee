public class Cubic {
    double x;
    double a, b, c, d;
    public Cubic(double a1, double b1, double c1, double d1){
        a = a1;
        b = b1;
        c = c1;
        d = d1;
    }

    public Cubic (double b1, double c1, double d1){
        a = 0;
        b = b1;
        c = c1;
        d = d1;

    }

    public double eval(double x){

        return a*x*x*x+b*x*x+c*x+d;
    }

    public Cubic add(Cubic n2){

//        return new Cubic(a + n2.a, b + n2. b, c + n2.c, d + n2.d);
        Cubic x1 = new Cubic(0,0,0,0);
        this.a = a + n2.a;
        this.b = b + n2.b;
        this.c = c + n2.c;
        this.d = d + n2.d;
        return x1;

    }

    public Cubic neg(){
        Cubic n3 = new Cubic(0,0,0);
        n3.a = -a;
        n3.b = -b;
        n3.c = -c;
        n3.d = -d;
        return n3;
//        return new Cubic(-a, -b, -c, -d);
    }
    public String toString(){
        String res = "";
        res = addElement(res, a, 3);
        res = addElement(res, b, 2);
        res = addElement(res, c, 1);
        res = addElement(res, d, 0);
        return res;
    }
    public String addElement(String s, double a, int i){
        if(a ==  0)
            return s;

        else if(a == -1)
            s += "-";
        else if (a == 1)
            s += s.length() < 1 ? "" : "+";
        else if (a < 0 && a != -1)
            s += a;
        else if (a > 0 && a != 1)
            s += s.length() < 1? "" + a : "+" + a;
            if(i >= 2)
                s += "x^" + i;
            else if (i == 1)
            s += "x";
        return s;
    }




    public static void main(String[] a){
        Cubic c1 = new Cubic(1,2.5,-1.5,3);
        Cubic c2 = new Cubic(3, -1.0, 2.4);
        System.out.println(c1.eval(2));
        System.out.println(c2.eval(2));
        Cubic c3 = c1.add(c2);
        Cubic c4 = c1.neg();
        System.out.println(c3);
        System.out.println(c4);
    }
}



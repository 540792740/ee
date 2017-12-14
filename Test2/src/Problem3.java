    class A{
        private static int count= 0;
        public A(){
            System.out.print('a');
        }
        public void A(){
            System.out.println('b');
        }
        public String toString(){
            return"c";
        }
        public void f(){
            System.out.println('d');
        }
        public static int getCount(){
            return count;
        }
        public void finalize(){
            System.out.println('e');
        }

    }

    class B extends A{
        public B() {
            System.out.print('f');
        }
        public B(int r){
            this();     //constructure b()
            B();        //method B();
            System.out.println('g');
            System.out.println(getCount());
        }
        public void B(){
            System.out.print('h');
            super.A();
        }
    }
    public class Problem3{
    public static void f(){
        B b1 = new B(3);
        A a1 = new A();
        System.out.println("-" + a1 +"-");

    }
    public static void main(String[] args){
        f();
        System.gc();
    }
    }


//interface
// class implement
//this.x = x;
////public String toString(){
//  return"B x = " + x;
//  }
//  class extends
//  super.x()
//
// public String toString(){
// return super.toString() + " C y = " +y;
// }
//
//B z = 1 C y = 2
// B
// C
// }


package JavaLab;

public class AnonymousClass {
    public static void main(String[] arg) {

        An a = new An(){
            public void f() {
                System.out.println("I am a class");
            }
        };
        System.out.println(a.getClass());

        An a1 = new An(){
            public void f() {
                System.out.println("I am a class1");
            }
        };
        System.out.println(a1.getClass());
    }
}

interface An {
    public void f();
}
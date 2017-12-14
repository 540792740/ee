public class Problem1 {
    public static void main(String[] a) {
        //11111111111111111111111
        for (int i = 5; i <= 12; i += 2) {
            System.out.print("A" + i);
            System.out.print(i % 3 + i % 4);
        }
        System.out.println();
        System.out.println("-------------");
        //222222222222222222222
        for (int i = 1; i < 25; i += i){
            System.out.print(i + "x");
            System.out.print(i / 3 + "y");
        }
        System.out.println();
        System.out.println("-------------");
        //cccccccccccccccccccccc
        for (double i = 0; i < 10; i += 3/2*3){
            System.out.print(i);
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------");
        //ddddddddddddddddddddddddddd
        for (int i = 4; i < 7; i += 1){
            System.out.print(i *3/2.0 + " "+ i * 2 / 3 );
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------");
        //eeeeeeeeeeeeeeeeeeeeeeeeeeeee
        for (int i = 100; i > 0; i /= 3+2){
            System.out.print(i*2 );
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------");
        //fffffffffffffffffffffff
        for (int i = 100; i > 0 ; i = i / 3 - 2){
            System.out.print(i *2 );
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------");


        }
    }





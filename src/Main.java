public class Main {
    public static void main(String[] args) {

        byte a = 3; // -128 .. 127 1 байт
        short b = 5; // -32768 .. 32767 2 байта
        int c = 10; // -2 * 10^9 ... 2 *10^9 4 байта
        long d = 100; // -9 *10^18 .. 9 *10^18 8 байт

        double n = 101; // -5*10^320 ... 1.8 * 10 ^ 308 8 байт
        float f = 120f; // -3 * 10 ^ 38 .. 3 * 10 ^ 38 4 байта

        boolean flag = false;
        char m = 'm';


        System.out.println(10);

        long f1 = 1111111111111111111L;
        int num = 0x6F;

        int x1 = 123__456;
        System.out.println(x1);

        float y1 = 30.6f;
        double y2 = 30.6;

        String str = "dfgjdfhgjhdf";

        char gg = 102;
        char dd = 'а';

        System.out.println(gg);

        char nn = 'n';
        String ft = "n";

        String hello = "Hello\nworld";
        System.out.println(hello);

        String text1 = "xjvhjsdvc\n"+
                "sdfsdfsd\n"+
                "dsfdsfds";

        System.out.println(text1);
        System.out.println("##################");
        String text = """ 
                sdhfgdhfghdsjgfhjsdgf
                jgfsdfhjsdhf
                sdjfhsd
                """;

        System.out.println(text);


        System.out.print("test\n");

        int t1 = 10;
        int t2 = 20;

        System.out.println("t1=" + t1 + " t2=" + t2);

        System.out.printf("t1=%d t2=%d\n", t1, t2);

        //%x 16-ричные числа
        //%f - дробные
        //%e - экспонент. числа
        // %c - символы
        // %s - строковые значения

        String name = "Anna";
        int age = 30;
        float height = 1.7f;
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);






    }
}
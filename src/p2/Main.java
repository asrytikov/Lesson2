package p2;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = 50 + c;

        System.out.println(d + 10);

        int c1 = b - a;
        int c2 = c1 - 10;

        int d1 = a*b;
        int d2 = d1*10;

        int f = b/a;
        int f1 = a/b;

        int t1 = 9;
        double t2 = 10;
        System.out.println(t1/t2);

        double k1 = (double) a/b;

        System.out.println(k1);

        int h = a%b;

        System.out.println(h); // (10 - 20*0 = 10)

        System.out.println(3%2); // (3 - 2*1 = 1)

        int k = 8;
        int w = ++k;
        System.out.println(k);
        System.out.println(w);

        int k2 = 8;
        int w1 = k2++;
        System.out.println(k2);
        System.out.println(w1);

        int m1 = 8;
        int m2 = 7;
        int rez = m1 + 5 * ++m2; //48
        int rez2 = (m1 + 5) * ++m2; //104

        int rez3 = 10/5*2; // (10/5)*2 10/(5*2)


        double d12 = 2.0-1.1;
        System.out.println(d12);

        int a1 = 2;//010
        int b1 = 5;//101
        System.out.println(a1&b1); // 0*1, 1*0, 0*1 = 000
        System.out.println(a1|b1); // 0+1, 1+0, 0+1 = 111

        a1 = 4; //100
        b1=5; // 101
        System.out.println(a1&b1); //1*1, 0*0, 0*1 = 100
        System.out.println(a1|b1); //101

        int yu = 45; //   0101101
        int key = 102; // 1100110
        int enc = yu ^ key; //1001011
        System.out.println(enc);

        int dec = enc^key;
        System.out.println(dec);

        int df = 12; // 0000 11 00
        System.out.println(~df); // 1111 00 11





    }
}

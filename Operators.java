public class Operators {
    public static void main(String[] args) {
        // Operators
        // 1. Arithmetic operators
        int a = 10;
        int b = 10 + 20;
        System.out.println(b + a);
        System.out.println(b - a);
        System.out.println(b * a);
        System.out.println(b / a);
        System.out.println(b % a);

        // 2. Logical Operators
        // and
        boolean ans1 = (a > b) && (b < a);
        System.out.println(ans1);
        // or
        boolean ans2 = (a < b) || (b < a);
        System.out.println(ans2);
        // not
        boolean ans3 = !(b < a);
        System.out.println(ans3);

        // 3. Assignment Operator
        int c = 5;
        int d = 10;
        d += c;
        d += 10;
        System.out.println(d);
        int f = 50;
        f -= (c + d);
        System.out.println(f);
        // 4. Relation Operators
        int g = 5;
        int h = 10;
        System.out.println(g > h);
        System.out.println(g < h);
        System.out.println(g == h);
        System.out.println(g != h);
        // 5. Unary Operators
        int i = 5;
        System.out.println(i++);
        System.out.println(i--);
        System.out.println(++i);
        System.out.println(--i);
        System.out.println((i++ + i--) + (--i + ++i));
        // 6. Ternary Operators
        System.out.println(g > h ? "g is greater" : "h is greater");
        // 7. Bitwise Operators
        System.out.println(2 & 3);
        System.out.println(2 | 3);
        System.out.println(2 ^ 3);
        System.out.println(2 << 3);
        System.out.println(2 >> 3);

    }
}

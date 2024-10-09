public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        // autoboxing
        int a = 10;
        Integer b = a;
        System.out.println(b);
        // boxing
        int c = 50;
        Integer d = Integer.valueOf(c);
        System.out.println(d);

        int result = 105;
        Integer result1 = Integer.valueOf(result);
        System.out.println("result1 : " + result1);
        // Unboxing
        Integer marks = 50;
        int newResult = marks.intValue();
        System.out.println("Marks : " + marks);
        // AutoUnboxing
        Integer e = 160;
        int f = e;
        System.out.println("f : " + f);
    }
}

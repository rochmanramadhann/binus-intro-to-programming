public class ExerciseTiga {
    public static void main(String[] args) {
        System.out.println("=== Operator Aritmatika Example ===");
        showAritmatikaOperatorExample();

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        System.out.println("=== Assignment Operator Example ===");
        showAssignmentOperatorExample();
    }

    static void showAritmatikaOperatorExample() {
        int a, b, c, d, e, f;

        a = 8 + 4;
        b = 9 - 2;
        c = 2 * 3;
        d = 10 + 3 - 7 * 4;
        e = ((10 + 3) - 7) * 4;
        f = -79;

        System.out.println("Isi variabel a: " + a);
        System.out.println("Isi variabel b: " + b);
        System.out.println("Isi variabel c: " + c);
        System.out.println("Isi variabel d: " + d);
        System.out.println("Isi variabel e: " + e);
        System.out.println("Isi variabel f: " + f);
    }

    static void showAssignmentOperatorExample() {
        int a = 10, b = 10, c = 10, d = 10, e = 10, f = 10;

        System.out.println("Variabel a, b, c, d, e, f = 10 \n");

        a += 5;
        System.out.println("Hasil operasi a += 5: " + a);

        b -= 3;
        System.out.println("Hasil operasi b -= 3: " + b);

        c *= 3;
        System.out.println("Hasil operasi c *= 3: " + c);

        d /= 3;
        System.out.println("Hasil operasi d /= 3: " + d);

        e %= 3;
        System.out.println("Hasil operasi e %= 3: " + e);

        f <<= 2;
        System.out.println("Hasil operasi f <<= 2: " + f);
    }
}

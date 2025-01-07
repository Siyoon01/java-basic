package memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        System.out.println("main_start");
        method1(10);
        System.out.println("main_end");
    }

    static void method1(int m1) {
        System.out.println("method1_start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1_end");
    }

    static void method2(int m2) {
        System.out.println("method2_start");
        System.out.println("method2_end");

    }
}

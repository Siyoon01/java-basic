package practice.method;

public class MethodEx2 {

    public static void main(String[] args) {

        String str = "Hello, world";

        printMessage(str, 3);
        printMessage(str, 5);
        printMessage(str, 7);
    }

    public static void printMessage(String str, int c) {
        for(int i = 0; i < c; i++) {
            System.out.println(str);
        }
    }
}

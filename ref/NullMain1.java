package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data1 = null;
        System.out.println("1. data = " + data1);
        data1 = new Data();
        System.out.println("2. data = " + data1);
        data1 = null;
        System.out.println("3. data = " + data1);
    }
}

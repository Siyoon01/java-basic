package practice.loop;

public class LoopEx2 {
    public static void main(String[] args) {

        int num = 2;
        while(num <= 20) {
            System.out.println(num);
            num += 2;
        }

        for(int i = 2, count = 1; count <= 10; i += 2, count++) {
            System.out.println(i);
        }
    }
}

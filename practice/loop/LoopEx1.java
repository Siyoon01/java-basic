package practice.loop;

public class LoopEx1 {
    public static void main(String[] args) {

        int count1 = 1;
        while(count1 <= 10) {
            System.out.println(count1);
            count1++;
        }

        for(int count2 = 1; count2 <= 10; count2++) {
            System.out.println(count2);
        }
    }
}

package practice.loop;

public class LoopEx3 {

    public static void main(String[] args) {

        int sum1 = 0;
        int max = 100;
        int i = 0;
        int sum2 = 0;


        while (i <= max) {
            sum1 += i;
            i++;
        }
        System.out.println(sum1);

        for(int j = 0; j <= max; j++) {
            sum2 += j;
        }
        System.out.println(sum2);
    }
}

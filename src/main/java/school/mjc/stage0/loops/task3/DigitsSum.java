package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String line = "" + t;
        int num = 0;
        int sum = 0;
        if (t>=0) {
            for (int i = 0; i <= line.length(); i++) {
                num = t % 10;
                t = t / 10;
                sum = sum + num;
            }
        } else {
            t = t * (-1);
            for (int i = 0; i <= line.length(); i++) {
                num = t % 10;
                t = t / 10;
                sum = sum + num;
            }
        }
            System.out.println(sum);



    }
}

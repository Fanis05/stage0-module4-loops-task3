package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        if (first == 0){
            System.out.println(second);
        }else if (second == 0 ){
            System.out.println(first);
        } else {
            int gcd = 1;

            for (int i = 1; i <= first && i <= second; ++i) {

                // check if i perfectly divides both n1 and n2
                if (first % i == 0 && second % i == 0)
                    gcd = i;
            }

            System.out.println(gcd);
        }
    }
}

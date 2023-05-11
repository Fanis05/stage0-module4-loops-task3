package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n1 = 0;
        int n2 = 1;
        int nt = 0;
        System.out.println(n1);
        System.out.println(n2);

        for (int l = 3; l<=lastFibonacci; l++){
            nt = n1+n2;
            System.out.println(nt);
            n1 = n2;
            n2 = nt;
        }
    }
}

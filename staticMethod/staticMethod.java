class MathsUtil{
    private static int value = 0;

    public static void increment() {
        value++;
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n*factorial(n-1);
    }

    public void printFactorial() {
        System.out.println(factorial(value));
    }


}


public class staticMethod {
    public static void main(String[] args) {

        MathsUtil mathsUtil = new MathsUtil();

        for(int i = 0; i < 5; i++) {
            MathsUtil.increment();
            mathsUtil.printFactorial();
        }


    }
}



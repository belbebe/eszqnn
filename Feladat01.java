public class Feladat01 {
    private static int factorial(int n) {
        int r = 1;
        for(int i = 2; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    public int feladat01(String[] szinek) {
        if (szinek.length < 2) {
            return 0;
        } else {
            int res = 1;
            for(int i = szinek.length-1; i >= 2; i--) {
                int tmp = factorial(szinek.length) / (factorial(i) * factorial(szinek.length-i));
                res += tmp;
            }
            return res;
        }
    }
}
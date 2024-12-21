public class GCD {

    //Space Complexity is O(log(min(a, b))) and Time Complexity is also O(log(min(a, b)))
    public static int getGCD(int a, int b) {
        //Simply returning a if b is 0;
        if (b == 0) {
            return a;
        }
        //recalling the function again passing b as a and a%b as b
        return getGCD(b, a%b);
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        System.out.println(getGCD(a, b));
    }
}

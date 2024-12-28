import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
  
  //Method for getting square of a number
  public static int square(int n) {
    int ans = 0;
    while (n > 0) {
        int rem = n%10;
        ans += rem*rem;
        n /= 10;
    }

    return ans;
}


//Time Complexity O(logn) ans SpaceComplexity O(1)
public static boolean isHappy(int n) {
    //Initializing a set of integers
    HashSet<Integer> set = new HashSet<>();

    //Looping until n is not equal to 1 and set doesn't contains n
    while (n != 1 && !set.contains(n)) {
        //Adding in set when find new number
        set.add(n);
        n = square(n); // Updating n to its square
    }

    return n == 1; //return true if n is 1 else false
}


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isHappy(n));
  }
}

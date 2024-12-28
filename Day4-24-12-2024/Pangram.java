import java.util.HashMap;
import java.util.Scanner;

public class Pangram {

  //Time complexity O(n) and Space complexity O(n)
  public static void main(String[] args) {

    //Initializing scanner for user input
    Scanner sc = new Scanner(System.in);

    //First input which is size of string
    int n = sc.nextInt();

    //Second input which is string
    String s = sc.next();

    //Initialing a StringBuilder and storing lowercase of string input in StringBuilder
    StringBuilder str = new StringBuilder(s.toLowerCase());

    //Initializing Hashmap to store frequency
    HashMap<Character, Integer> map = new HashMap<>();

    //iterating through each element of string and storing in hashmap with their freq
    for (int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }

    //Initializing a boolean to check whether it is a pangram or not
    boolean isPangram = true;

    //All chars in alphabet
    String st = "abcdefghijklmnopqrstuvwxyz";

    //Iterating through each chars in alphabet and updating isPangram if any char does not exist in map
    for (int i = 0; i < 26; i++) {
      if (!map.containsKey(st.charAt(i))) {
        isPangram = false;
        break;
      }
    }

    //Simply printing yes or no accordingly
    if (isPangram) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}

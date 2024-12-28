import java.util.ArrayList;

public class NumberOfLaserBeams {


  //Just retrieving number of ones in a string
  public static int ones(String s) {
    int one = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        one++;
      }
    }
    return one;
  }


  //Time Complexity O(n*m) and Space complexity O(n)
  public static int numberOfBeams(String[] bank) {
    //Initializing a arraylist (vector) of integer
    ArrayList<Integer> ar = new ArrayList<>();

    //Adding in ar number of ones in each string and avoiding if there is not any one
    for (int i = 0; i < bank.length; i++) {
      int one = ones(bank[i]);
      if (one != 0) {
        ar.add(ones(bank[i]));
      }
    }

    //Returning zero if there's one row or none with 1's
    if (ar.size() <= 1)
      return 0;

    int ans = 0;

    //Counting beams here
    for (int i = 1; i < ar.size(); i++) {
      ans += (ar.get(i) * ar.get(i - 1));
    }

    //returning ans
    return ans;
  }

  public static void main(String[] args) {
    String[] bank = {"011001","000000","010100","001000"};
    System.out.println(numberOfBeams(bank));
  }

}

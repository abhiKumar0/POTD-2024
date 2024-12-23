public class MinimumMoveConString {

  //Time complexity O(n) and Space compexity O(1)
  public static int minimumMoves(String s) {
    //Getting the length of string
    int n = s.length();

    //Initialising pointer and counter
    int i = 0;
    int count = 0;

    //Looping through each character of string
    while ( i < n ) {

      //If the char is 'X'
      if (s.charAt(i) == 'X') {
        count++; // Incrementing counter by one
        i += 3; // Incrementing pointer by 3 as it covers 3 chars
      } else {
        i++; // Else just incrementing by one
      }
    }

    //Returning count
    return count;
  }
  public static void main(String[] args) {
    String s = "XXOX";
    System.out.println(minimumMoves(s));
  }
}
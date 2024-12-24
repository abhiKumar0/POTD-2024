import java.util.Arrays;

public class AssignCookie {

  //Time complexity O(nlogn + mlogm) and Space complexity O(1)
  public static int findContentChildren(int[] g, int[] s) {

    //Assigns two pointer 1 for g and another for s
    int i = 0;
    int j = 0;

    //returning 0 if any array is empty
    if (g.length == 0 || s.length == 0)
      return 0;

    //Initializing ans and sorting both arrays
    int ans = 0;
    Arrays.sort(g);
    Arrays.sort(s);

    //Traversing through both arrays
    while (i < g.length && j < s.length) {

      //Incrementing ans when the cookie size is greater than greed factor
      if (s[j] >= g[i]) {
        ans++;
        i++;
        j++;
      } else {
        //Else just incrementing the pointer of cookie
        j++;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] g = { 1, 2, 3 };
    int[] s = { 1, 1 };

    System.out.println(findContentChildren(g, s));
  }

}

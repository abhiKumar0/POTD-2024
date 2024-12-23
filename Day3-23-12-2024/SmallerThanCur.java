import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCur {

  //Time complexity O(nlogn) and space complexity O(n)
  public static int[] smallerNumberThanCurrent(int[] nums) {

    //Intinalising a hashmap to store number with there their indexes
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = nums.length;

    //New array with same elements
    int[] ans = nums.clone();

    //Sorting the new array
    Arrays.sort(ans);


    //Iterating through new sorted array ans storing in hashmap with their indexes
    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(ans[i])) {
        map.put(ans[i], i);
      }
    }

    //new array to store result
    int[] res = new int[n];

    //Storing the indexes according to nums's elements in res array
    for (int i = 0; i < nums.length; i++) {
      res[i] = map.get(nums[i]);
    }


    //returning res
    return res;
  }

  public static void main(String[] args) {
    int[] arr = {8,1,2,2,3};
    int[] ans = smallerNumberThanCurrent(arr);

    for (int i: ans) {
      System.out.print(i + " ");
    }
  }
}

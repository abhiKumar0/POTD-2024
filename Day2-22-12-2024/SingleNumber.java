public class SingleNumber {

  //Time complexity O(n); Space complexity O(1)
  public static int singleNumber(int[] nums) {
    //Initialing ans as 0
    int ans = 0;

    //Iterating through every element in array
    for (int i: nums) {
      //Performing XOR operation of ans with every element of array
      //Ex: (a^a=0)
      ans ^= i;
    }
    
    //Returing ans which is the only single number in the array
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = {4,1,2,1,2};
    System.out.println(singleNumber(nums));
  }
}

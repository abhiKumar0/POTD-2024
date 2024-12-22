public class MinimumOperation {


  public static int minOperation(int[] nums) {
    //Defining an variable count to store count
    int count = 0;

    //Iteration through each element of array
    for (int i : nums) {

      //Incrementing count when a number in array is divisible by 3
      if (i%3 != 0) {
        count++;
      }
    }

    //Simply returing the ans which the count
    return count;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(minOperation(arr));
  }
}

public class DutchFlagAlgo {

  public static void sortColors(int[] N) {

    //Initializing 3 vars as high to last element, low and mid with starting element
    int l = 0, m = 0, h = N.length-1;
    int temp; //Temp for swapping
    while (m <= h) {

      //If N[m] is 0 then bring it in starting
      if (N[m] == 0){
        temp = N[m];
        N[m] = N[l];
        N[l] = temp;
        l++; m++;
      } else if (N[m] == 1) {
        m++; // if N[m] is 1 then its in right place
      } else{

        //If N[m] is 2 then bring it in last
        temp = N[m];
        N[m] = N[h];
        N[h] = temp;
        h--;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};
    sortColors(nums);
    for (int i : nums) {
      System.out.print(i + " ");
    }
  }
  
}
public class StringScore {

    //Space complexity O(1) and Time complexity O(n)
    public static int scoreOfString(String s) {
        //sum initialized
        int sum = 0;
        //Looping through every element
        for (int i = 0; i < s.length()-1; i++) {

            //ASCII value of first char
            int first = (int)s.charAt(i);

            //ASCII value of char just after the first char
            int second = (int)s.charAt(i+1);

            //Subtracting and adding mod of sub to sum
            if (first >= second) {
                sum += (first-second);
            } else {
                sum += (second-first);
            }
        }
        //return sum
        return sum;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(scoreOfString(str));
    }
}

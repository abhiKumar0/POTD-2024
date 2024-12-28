import java.util.*;
import java.io.*;

public class SwapPermutation {

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        char nextChar() {
            return next().charAt(0);
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a%b;
            a = t;
        }

        return a;
    }

    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out=new FastWriter();


            int testcases=in.nextInt();
            while(testcases-- >0){

                //Time Complexity O(n*logn) and Space Complexity O(n)
                int n = in.nextInt();

                //initializing an arraylist
                ArrayList<Integer> nums = new ArrayList<>();
                //Taking input
                for (int i = 0; i < n; i++) {
                    int f = in.nextInt();
                    nums.add(f);
                }

                int i = 0;
                int ans = 0; //Initializing ans to 0

                //Looping through the array
                for (; i < nums.size(); i++) {

                    //Condition if the index is not equal to the element in the array at the same index
                    if (nums.get(i) != i+1) {

                        //When find subtract the element with its index+1 and take the absolute value
                        int sub = Math.abs(nums.get(i) - i - 1);

                        //Update the answer when the ans is zero then update it to the sub else update it to gcd of ans and sub
                        ans = ans == 0 ? sub : gcd(ans, sub);
                    }
                }


                //Print the answer
                System.out.println(ans);







            }

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
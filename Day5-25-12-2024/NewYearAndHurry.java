import java.util.*;
import java.io.*;

public class NewYearAndHurry {

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

    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out=new FastWriter();

            //write your code here


            //Time complexity O(n) and space complexity O(1)

            //Two inputs n = number of problems and minutes it takes him to get to party
            int n = in.nextInt();
            int k = in.nextInt();

            //Initializing problems and remaining time
            int prob = 0;
            int remTime = 240-k;

            //To check he doesn't over do
            int t = 0;

            for (int i = 1; i <= n; i++) {
                t += (i*5);
                if (t > remTime){
                    break; //breaking the loop when he exceeds the remaining time limit
                }
                prob++; //Incrementing max number of problems he can solve so he wont get late
            }

            System.out.println(prob);
            

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
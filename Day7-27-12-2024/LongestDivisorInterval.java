import java.util.*;
import java.io.*;

public class LongestDivisorInterval {

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

            //for multiple testcases
            int testcases=in.nextInt();
            while(testcases-- >0){

              //TimeComplexity O(n) and SpaceComplexity O(1)
              long n = in.nextLong();

              long ans = 0;
              if (n %2 != 0) {
                  ans = 1;
              }
                if (n %2 == 0) {
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            ans++;
                        } else {
                            break;
                        }
                    }
                }

              System.out.println(ans);


            }

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
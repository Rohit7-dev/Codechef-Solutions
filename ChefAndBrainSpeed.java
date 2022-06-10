import java.util.*;
import java.io.*;

public class ChefAndBrainSpeed {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args){
            FastReader fr = new FastReader();

            int x = fr.nextInt();
            int y = fr.nextInt();

            System.out.println(x >=y ? "Yes" : "No");
    }
}
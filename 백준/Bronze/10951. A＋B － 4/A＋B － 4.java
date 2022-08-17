import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        String num;
        int a;
        int b;
        
        while((num=br.readLine())!= null){
            st = new StringTokenizer(num," ");
            
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            bw.write((a+b)+"\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }
}
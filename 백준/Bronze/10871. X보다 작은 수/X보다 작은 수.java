import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int count = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine()," ");
       
        int num;
        
        for(int i=0;i<count;i++){
            num = Integer.parseInt(st.nextToken());
            
            if(num<X){
                bw.write(num + " ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
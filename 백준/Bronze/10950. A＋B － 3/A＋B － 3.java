import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int size = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        for(int i = 0;i<size;i++){
            st = new StringTokenizer(br.readLine()," ");
            
            int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
            
            System.out.println(a+b);
        }
        
        
    }
}
import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        int totalPrice = 0;
        
        for(int i=0;i<count;i++){
            st = new StringTokenizer(br.readLine()," ");
           
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            totalPrice += (a*b);
        }
        if(price == totalPrice){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
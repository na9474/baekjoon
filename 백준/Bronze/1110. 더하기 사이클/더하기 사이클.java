import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        
        int num = Integer.parseInt(br.readLine());
        
        int n=num;
        int cnt=0;
        
        while(true){
            num = ((num%10)*10)+(((num/10)+(num%10))%10);
            cnt++;
            if(n==num){
                break;
            }
        }
        System.out.println(cnt);

    }
}
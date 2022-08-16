import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
 
        int C = Integer.parseInt(br.readLine());
        
        int M = 60 * A + B; //입력받은 시 분을 분으로 
        M += C; //총 소요시간 (단위 분)
            
        int hour = (M/60)%24; //시는 24를 넘을 수 없다
        int minute = M % 60;
        
        System.out.println(hour + " " + minute);
    }
}
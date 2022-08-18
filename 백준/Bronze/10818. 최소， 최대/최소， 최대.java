import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int arr[] = new int[size];
        int max = -1000001;
        int min = 1000001;
        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<size;i++){
            
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min+" "+max);
        
    }
}
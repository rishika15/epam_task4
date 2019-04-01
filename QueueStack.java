import java.io.*;
import java.util.*;

public class QueueStack {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        Stack s1=new Stack();
        Stack s2=new Stack();
        for(int i=0;i<t;i++){
            String[] in=br.readLine().split("\\s");
            if(in[0].equals("1")){
                s1.push(in[1]);
            }
            if(in[0].equals("2")){
                while(!s1.empty()){
                    s2.push(s1.pop().toString());
                    
                }
                s2.pop();
                
            }
            if(in[0].equals("3")){
                while(!s1.empty()){
                    s2.push(s1.pop().toString());
                }
                System.out.println(s2.peek().toString());
                while(!s2.empty()){
                    s1.push(s2.pop().toString());
                }
            }
            while(!s2.empty()){
                    s1.push(s2.pop().toString());
                }
        }

    }
}
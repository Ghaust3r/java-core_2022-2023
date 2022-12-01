package timus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task_2100 {
    public static void main(String[] args) {
        String File="src/timus/task_2100";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
int m=2;
        try{
            BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)):
                    new BufferedReader(new FileReader(File));

            String readLine="";
            int friends=0;
            int pares=0;

            while((readLine=bufferedReader.readLine()) !=null){
if (friends==0){
    friends=Integer.parseInt(readLine);
    continue;
}
if (readLine.contains("+")){
    pares++;
}
            }
                    int summ;
        int guest=(m+friends+pares);
        if(guest==13) {
            summ = (guest*100)+100;
        }
        else {
            summ=guest*100;
        }
            System.out.println(summ);
            System.out.println();
        } catch (IOException exception) {
exception.printStackTrace();
        }
    }
}

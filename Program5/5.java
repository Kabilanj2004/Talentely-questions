import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class JavaApplication4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        ArrayList<Integer> b=new ArrayList();
        int c=0;
        for(int i=0;i<size;i++){
            if(isPrime(a[i])){
                b.add(a[i]);
                c++;
            }
            else{
                continue;
            }
        }
        Collections.sort(b);
       // System.out.println(Arrays.toString(b));
        int sum=0;
        for(int i=1;i<b.size();i++){
            sum+=b.get(i);
        }
System.out.println(sum);       
    }
    public static boolean isPrime(int a){      
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    } }

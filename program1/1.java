import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author cclab
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String s=in.next();
       int[] a=new int[s.length()];
       int c=0,f=0;
       char[] b=new char[s.length()];
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)>=48&&s.charAt(i)<=57){
               a[c]=Integer.parseInt(Character.toString(s.charAt(i)));
               c++;
           }
           else if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122){
               continue;
           }
           else{
               b[f]=s.charAt(i);
               f++;
           }
       }
       int sum=0;
       Stack<Integer> n=new Stack();
       Stack<Character> m=new Stack();
       for(int i=c-1;i>=0;i--){
         n.push(a[i]);
       }
       for(int i=f-1;i>=0;i--){
           m.push(b[i]);
       }
       while(!(m.empty()))
       {
           switch(m.pop()){
               case '+':
                   sum=n.pop()+n.pop();
                   n.push(sum);
                  break;
               case '-':
                   sum=n.pop()-n.pop();
                   n.push(sum);
                  break;
               case '*':
                   sum=n.pop()*n.pop();
                   n.push(sum);
                  break;
               case '/':
                   sum=n.pop()/n.pop();
                   n.push(sum);
                   break;
           }
       }System.out.println(sum);      }

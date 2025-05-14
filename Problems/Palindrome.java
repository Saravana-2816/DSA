import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str=ob.nextLine();
        int i=0;
        boolean flag=true;
        for(int j=str.length()-1;j>=0;i--){
            if(j>i) break;
            else {
                if(str.chartAt(i)!=str.charAt(j)) flag=false;
            }
        }
        if (flag) System.out.println("palindrome");
        else System.out.print("not palindrome");
    }
}

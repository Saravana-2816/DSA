import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str=ob.nextLine();
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        if(res.equals(str)) System.out.println("palindrome");
        else System.out.print("Not palindrome");
    }
}

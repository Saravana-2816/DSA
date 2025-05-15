import java.util.*;
public class NonRepeating {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str=ob.nextLine();
        int[] count=new int[256];
        for(char ch : str.toCharArray()){
            count[ch]++;
        }
        for(char ch:str.toCharArray()){
            if(count[ch]==1){
                System.out.println(ch);
                break;
            }
        }
    }
}

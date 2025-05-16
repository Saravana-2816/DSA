import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        int[] arr={3,9,2,7,1,5,8,4};
        int[] countArray=new int[10];
        for(int num:arr){
            countArray[num]++;
        }
        for(int i=1;i<countArray.length;i++){
            countArray[i]=countArray[i]+countArray[i-1];
        }
        int[] outputArray=new int[arr.length];
        for(int num:arr){
            outputArray[countArray[num]-1]  = num;
        }
        for(int num:outputArray){
            System.out.print(num+" ");
        }
    }
}

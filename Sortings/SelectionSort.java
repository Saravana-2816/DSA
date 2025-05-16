import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,7,1,9,4,8,3};
       
        
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
             int idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[idx]>arr[j]){
                    
                    idx=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}

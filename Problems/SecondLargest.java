import java.util.*;
public class SecondLargest {

    public static void main(String[] args) {
        int arr[]={5,5,56,89,8,9,334};
        int largest=arr[0];
        int secondLargest=arr[0];
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
                
            }
            if(num>secondLargest && num<largest){
                     secondLargest=num;
            }
        }
        System.out.print(secondLargest);
    }
}

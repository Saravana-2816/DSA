public class MissingNumber {
    public static void main(String[] args) {
        int arr[] ={0,1,3};
        int ans=0;
        for(int num:arr){
            ans^=num;
        }
        for(int i=0;i<=arr.length;i++){
            ans^=i;
        }
        System.out.println(ans);
    }
}

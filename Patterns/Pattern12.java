package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n=4;
  
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            for(int k=0;k<(2*(n-i-1));k++){
                System.out.print(" ");
            }
            for(int l=i+1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
          
        }
    }
}

package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int space=str.length()-2;
        int start=0;
        int end=str.length()-1;
        for(int i=0;i<=(str.length()/2);i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(start++));
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
           if(space>0) System.out.print(str.charAt(end--));
            space-=2;
            System.out.println();
        }

    }
}

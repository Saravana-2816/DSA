package Matrix;

import java.util.Arrays;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] ans=new int[mat.length][mat[0].length];
        int n=mat[0].length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ans[j][n-i-1]=mat[i][j];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Approach");
        Transposal.transpose(mat);
        for(int i=0;i<mat.length;i++){
            reversal(mat[i],0,mat[0].length-1);
        }
        for(int[] row:mat){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void reversal(int[] arr,int left,int right){
        int temp;
        while(left<=right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}

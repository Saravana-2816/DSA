package Matrix;
import java.util.*;
public class Transposal{
    
    public static void main(String[] args) {
        int[][] mat={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        transpose(mat);
        for(int[] row:mat){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void transpose(int[][] mat){
        int temp;
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
}

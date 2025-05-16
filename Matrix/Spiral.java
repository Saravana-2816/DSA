package Matrix;

public class Spiral {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m=mat.length;
        int n=mat[0].length;
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=m-1;
       while(top<=bottom && left<=right){ 
        for(int i=left;i<=right;i++){
            System.out.print(mat[top][i]+" ");
        }
        top++;
        for(int i=top;i<=bottom;i++){
            System.out.print(mat[i][right]+" ");
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            System.out.print(mat[bottom][i]+" ");
        }

        bottom--;
    }   if(left<=right){
        for(int i=bottom;i>=top;i--){
            System.out.print(mat[i][left]+" ");
        }
        left++;
    }
    }
    }
}

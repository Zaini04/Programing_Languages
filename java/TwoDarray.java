public class TwoDarray {
    
    public static void main(String[] arg){
        int A[][]={{3,4,5},{6,7,8},{9,1,2}};
        int B[][]={{5,4,3},{8,7,6},{2,1,9}};
        int C[][]=new int[3][3];
        int i,j;
        for(i=0;i<A.length;i++){
            for(j=0;j<A[0].length;j++){
                C[i][j]=A[i][j]+B[i][j];
               

            }
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
        }
        }     
        
        


        
    }
}

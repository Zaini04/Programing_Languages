public class array1 {
    
    public static void main(String[] arg){
        int A[]={2,3,4,5,6,6,7,7,8,8,97,6,5};
        // A[0]=2;
        // A[1]=3;
        // A[3]=5;
        // int sum=0;
        // for(int i=0;i<A.length;i++)
        // {
        //     System.out.println(A[i]);
        //     sum=sum+A[i];
        // }
        // System.out.println(sum);
        int max1,max2;
        max1=max2=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {max2=max1;
            max1=A[i];
            }
            else if(A[i]>max1)
            {
                max2=A[i];
            }

        }
        System.out.print("Largest number is : "+max1);
        System.out.print("Second largest number is : "+max2);
  
    }
}

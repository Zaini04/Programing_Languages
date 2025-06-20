import java.util.*;
public class armstrong{
    public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Eneter any number:");
    int n=sc.nextInt();
    int m=n;
    int r;
    int sum =0;
    while(n>0)
    {
        r=n%10;
        sum=sum+r*r*r;
        n=n/10;
    }
    if(sum==m)
        System.out.println("Its a Armstrong number"+sum);
    else
        System.out.println("Its not a Armstrong number"+sum);
    }
}
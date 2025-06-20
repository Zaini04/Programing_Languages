import java.util.*;
public class Reverse {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter any number:");
        int n=sc.nextInt();
        int m=n;
        int r;
        int rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse number is: "+rev);
        if(rev==m)
        System.out.println("Number is Palindrome"+rev);
        else
        System.out.println("Number is not Pakindrome"+rev);

    }
    
}

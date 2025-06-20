public class SwapingBitwise {
    public static void main(String[] arg)
    {
        int a=0b101010;
        int b=0b110111;
        System.out.println("Before Swapping");
        System.out.println("a="+a);
        System.out.println("a="+Integer.toBinaryString(a));
        System.out.println("b="+b);
        System.out.println("b="+Integer.toBinaryString(b));
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping");
         System.out.println("a="+a);
        System.out.println("a="+Integer.toBinaryString(a));
        System.out.println("b="+b);
        System.out.println("b="+Integer.toBinaryString(b));
    }
}

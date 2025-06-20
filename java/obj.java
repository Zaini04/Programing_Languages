class Ahsan {
    int n,m,c;
    Ahsan()
    {
        n=3;
        m=2;
        c=4;
        
    }
}

class faindu {
    int n,m,c;

    faindu()
    {
        n=5;
        m=67;
        c=56;
    }
    faindu(int a,int b, int d)
{
n=a;
m=b;
c=d;
}
public void show(){
    System.out.println(n);
    System.out.println(m);
    System.out.println(c);
}
}
class obj{
    public static void main(String arg[]) {
       // faindu obj1=new faindu();
        faindu obj2=new faindu(22,25,30);
       // obj1.show();
        obj2.show();
    }
}
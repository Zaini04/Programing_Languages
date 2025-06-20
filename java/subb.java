abstract class superr{
    public superr()
    {
        System.out.println("Zain");
    }
    public void met1(){
        System.out.println("Iqbal");
    }
    abstract void met2();
}
class subb3 extends superr{
    void met2(){
        System.out.println("bsf2205779");
    }
}
class subb{
    public static void main(String[] args) {
        superr c=new subb3();
        c.met2();
    }
}


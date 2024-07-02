class FinalKey
{
    int a=5;
    final int b=4;
    final void disp()
    {
        System.out.println("I am from non final method");
    }
    final void show()
    {
        System.out.println("I am from final method");
    }
    void show(int k)
    {
        System.out.println("I am from final method "+k);
    }
}
final class Tuku
{
    final int g=90;
    void see()
    {
    System.out.println("I am from final class");
}
}

class FDemo extends FinalKey
{   void show()
    {
        System.out.println("Abch");
    }
    public static void main(String[]args)
    {
        FDemo f=new FDemo();
        f.show();
    }
}
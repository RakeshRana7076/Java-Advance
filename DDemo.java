class A 
{
    void Disp()
    {
        System.out.println("I am from A");
    }
}
class D extends A
{
    void Disp()
    { 
        System.out.println("I am from D");
    }
}
class DDemo
{
    public static void main(String[]args)
    {
        D obj=new D();
        obj.Disp();
        System.out.println("I am from main class");
    }
}
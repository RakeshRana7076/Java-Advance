class A
{
    A()
    {
        System.out.println("I aM CLASS A");
    }
}
class B
{
    public static void main(String[]args)
    {
        A obj=new A();
        System.out.println("I am from B");
    }
}
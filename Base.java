interface i1
{
    void f();
    void f3();
}
class Base implements i1
{
    public void f()
    {
        System.out.println("I am From F");
    }
   public void f3()
    {
        System.out.println("I am from F3");
    }
    public static void main(String[] args) 
    {
        
    Base b=new Base();
    b.f();
    b.f3();
    }
}
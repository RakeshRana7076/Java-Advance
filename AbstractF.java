abstract class AbstractDemo
{
    abstract void f2();
    abstract void f3();
    void show()
    {
        System.out.println("I am concrete method");
    }

}
class AbstractF extends AbstractDemo
{   public static void main(String[] args) 
    {
        AbstractF a=new AbstractF();
        a.show();
        a.f2();
        a.f3();

    }
    void f2()
    {
      System.out.println("I am from f2");
    }
    void f3()
    {
        System.out.println("I am from f3");
    }
    
}
class ThisConst
{   int k=23;
    ThisConst()
    { this(100);
        System.out.println("I am from no parameter");
    }
    ThisConst(int x)
    {  this(56,46);
        System.out.println("I am from single parameter have x as"+x);
    }
    ThisConst(int x,int y)
    {
        System.out.println("I am from double parameter having sum of x and y as "+(x+y));
    }
    void print()
    {
        int k=30;
        System.out.println(k);
        System.out.println(this.k);

    }

}
class ThisDemo extends ThisConst
{ int k=98;
 public static void main(String[] args) 
 {
    ThisConst t=new ThisConst();
    t.print();
    ThisDemo g=new ThisDemo();
    g.dip();
} void dip()
{
   int k= 113;
   System.out.println(k);
    System.out.println(this.k);
   System.out.println(super.k);
}
}

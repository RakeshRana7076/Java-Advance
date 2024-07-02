class OverLoading
{ 
    int a=10;
    OverLoading(int x)
    {  a=x;
        System.out.println("The value of X is ="+a);
    }
    OverLoading(OverLoadingConstructor ob2)
    { 
        System.out.println(ob2.a);
        System.out.println("the objecgt parameterised ");
    }
}
 class OverLoadingConstructor extends OverLoading
    {
        public static void main(String[]args)
        {
           OverLoading obj=new OverLoading(8);
           OverLoading obj2=new OverLoading(7);
           //OverLoading obj3=new OverLoading(obj);
        OverLoadingConstructor obj5=new OverLoadingConstructor();
        OverLoadingConstructor obj6=new OverLoadingConstructor(obj5);
            
        }
        OverLoadingConstructor(OverLoadingConstructor ob9)
        {
            super(ob9);
            System.out.println("I am from main");
        }
        int k=20;

    }


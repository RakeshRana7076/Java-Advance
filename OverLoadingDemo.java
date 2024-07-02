class OverLoading
{
    void add(int x)
    {
        System.out.println("The value of X is ="+x);
    }
    void add(int x,int y)
    {
        System.out.println("the sum is "+(x+y));
    }
}
 class OverLoadingDemo
    {
        public static void main(String[]args)
        {
           OverLoading o=new OverLoading();
           o.add(54);
           o.add(45,76); 
        }
    }

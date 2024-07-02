class InstStat
{
    int a=10;
    static int x=5;
    static void disp()
    {
        System.out.println("I am Static method");
        System.out.println("I am Static method having x="+x);

    }
    void show()
    {
        System.out.println("I am from Instance");
        System.out.println("I am instance method having a="+a);

    }
}
class InstStatDemo
{
    public static void main(String[]args)
    {
        InstStat obj=new InstStat();
        obj.show();
        InstStat.disp();
        obj.a=19;
        InstStat.x=24;
    }
}
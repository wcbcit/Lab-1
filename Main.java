public class Main
{
    public static void main(String[] args)
    {
        final IPhoneFifteen i1;
        final IPhoneFifteen i2;
        final IPhoneFifteen i3;

        i1 = new IPhoneFifteen("wtf",
                               1.5,
                               "Bell",
                               true,
                               100);
        i2 = new IPhoneFifteen("abc",
                               1.5,
                               "Telus",
                               false,
                               200);
        i3 = new IPhoneFifteen("w123",
                               1.5,
                               "Shaw",
                               true,
                               300);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println("------------");

        System.out.println(i1.equals(i3));
        System.out.println(i1.hashCode());
        System.out.println(i3.hashCode());
    }
}

/**
 * This main method is not required and strictly for testing.
 * 3 objects from each of the children classes were created.  IPod, IPad, IPhone, IPhoneFifteen
 * The .equals() method was tested twice for each class.  The first should pass.
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class Main
{
    public static void main(String[] args)
    {
        IPod ipod1 = new IPod(1, 1.0);
        IPod ipod2 = new IPod(1, 2.0);
        IPod ipod3 = new IPod(3, 3.0);

        IPad ipad1 = new IPad(true, "windows");
        IPad ipad2 = new IPad(false, "windows");
        IPad ipad3 = new IPad(true, "linux");

        IPhone iphone1 = new IPhone(10.0, "telus");
        IPhone iphone2 = new IPhone(10.0, "shaw");
        IPhone iphone3 = new IPhone(30.0, "rogers");

        IPhoneFifteen iphonefifteen1 = new IPhoneFifteen(20.0, "telus", true, 100);
        IPhoneFifteen iphonefifteen2 = new IPhoneFifteen(20.0, "shaw", true, 200);
        IPhoneFifteen iphonefifteen3 = new IPhoneFifteen(20.0, "rogers", false, 300);

        System.out.println(ipod1);
        System.out.println(ipod2);
        System.out.println(ipod2);
        System.out.println(ipod1.equals(ipod2));
        System.out.println(ipod1.equals(ipod3));

        System.out.println("----------");

        System.out.println(ipad1);
        System.out.println(ipad2);
        System.out.println(ipad3);
        System.out.println(ipad1.equals(ipad2));
        System.out.println(ipad1.equals(ipad3));

        System.out.println("----------");

        System.out.println(iphone1);
        System.out.println(iphone1);
        System.out.println(iphone1);
        System.out.println(iphone1.equals(iphone2));
        System.out.println(iphone1.equals(iphone3));

        System.out.println("----------");

        System.out.println(iphonefifteen1);
        System.out.println(iphonefifteen2);
        System.out.println(iphonefifteen3);
        System.out.println(iphonefifteen1.equals(iphonefifteen2));
        System.out.println(iphonefifteen1.equals(iphonefifteen3));
    }
}

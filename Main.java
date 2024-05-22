/**
 * A main class to test all IDevice classes and their functions.
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        final IPod ipod1;
        final IPod ipod2;
        final IPod ipod3;
        
        final IPad ipad1;
        final IPad ipad2;
        final IPad ipad3;
        
        final IPhoneFifteen iphonefifteen1;
        final IPhoneFifteen iphonefifteen2;
        final IPhoneFifteen iphonefifteen3;
        
        ipod1 = new IPod(1, 1.0);
        ipod2 = new IPod(1, 2.0);
        ipod3 = new IPod(3, 3.0);
        
        ipad1 = new IPad(true,  "windows");
        ipad2 = new IPad(false, "windows");
        ipad3 = new IPad(true,  "linux");
        
        iphonefifteen1 = new IPhoneFifteen
                (20.0, "telus",  true,  100);
        iphonefifteen2 = new IPhoneFifteen
                (20.0, "shaw",   true,  200);
        iphonefifteen3 = new IPhoneFifteen
                 (20.0, "rogers", false, 300);
         
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
        
        System.out.println(iphonefifteen1);
        System.out.println(iphonefifteen2);
        System.out.println(iphonefifteen3);
        System.out.println(iphonefifteen1.equals(iphonefifteen2));
        System.out.println(iphonefifteen1.equals(iphonefifteen3));
        
        System.out.println("----------");
        ipod3.printDetails();
        ipad3.printDetails();
        iphonefifteen2.printDetails();

        System.out.println("----------");
        iphonefifteen1.setPurpose("LALALALLA");
        System.out.println(iphonefifteen1.getPurpose());
    }
}

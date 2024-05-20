import java.util.Objects;

/**
 * The IPhoneFifteen class represents an iphone fifteen device.
 * It extends the IDevice class.
 * It contains inherited instance variables to store the purpose, minutes remaining on the plan, and the carrier of the device.
 * It also contains unique instance variables to indicate if it has a high resolution camera and store the memory in gigs.
 * It contains getters and setters for all instance variables.
 * It contains a method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPhoneFifteen extends IPhone
{
    private String  purpose;
    private double  minutesRemainingOnPlan;
    private String  carrier;
    private boolean hasHighResCamera;
    private int     memoryGigs;

    /**
     * Constructs an IPhoneFifteen object.
     *
     * @param minutesRemainingOnPlan The minutes remaining on the plan.
     * @param carrier                The carrier of the device.
     * @param hasHighResCamera       Indicates true if the device has a high resolution camera, and false if not.
     * @param memoryGigs             The amount of memory in gigs.
     */
    public IPhoneFifteen(final double  minutesRemainingOnPlan,
                         final String  carrier,
                         final boolean hasHighResCamera,
                         final int     memoryGigs)
    {
        super(minutesRemainingOnPlan, carrier);

        this.minutesRemainingOnPlan = super.getMinutesRemainingOnPlan();
        this.carrier                = super.getCarrier();
        this.purpose                = super.getPurpose();
        this.hasHighResCamera       = hasHighResCamera;
        this.memoryGigs             = memoryGigs;
    }

    /**
     * Returns the purpose of the device.
     *
     * @return The purpose of the device.
     */
    @Override
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Returns the minutes remaining on the plan.
     *
     * @return The minutes remaining on the plan.
     */
    @Override
    public double getMinutesRemainingOnPlan()
    {
        return minutesRemainingOnPlan;
    }

    /**
     * Returns the carrier of the device.
     *
     * @return The carrier of the device.
     */
    @Override
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Returns true if the device has a high resolution camera, and false if not.
     *
     * @return Indicates true if the device has a high resolution camera, and false if not.
     */
    public boolean isHasHighResCamera()
    {
        return hasHighResCamera;
    }

    /**
     * Returns the amount of memory in gigs.
     *
     * @return The amount of memory in gigs.
     */
    public int getMemoryGigs()
    {
        return memoryGigs;
    }

    /**
     * Sets the purpose of the device to a specified String.
     *
     * @param purpose Specified String representing a purpose.
     */
    @Override
    public void setPurpose(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Sets the minutes remaining on the plan.
     *
     * @param minutesRemainingOnPlan The minutes remaining on the plan.
     */
    @Override
    public void setMinutesRemainingOnPlan(final double minutesRemainingOnPlan)
    {
        this.minutesRemainingOnPlan = minutesRemainingOnPlan;
    }

    /**
     * Sets the carrier of the device.
     *
     * @param carrier The carrier of the device.
     */
    @Override
    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    /**
     * Sets the boolean indicating if the device has a high resolution camera.
     *
     * @param hasHighResCamera Indicates true if the device has a high resolution camera, and false otherwise.
     */
    public void setHasHighResCamera(final boolean hasHighResCamera)
    {
        this.hasHighResCamera = hasHighResCamera;
    }

    /**
     * Sets the amount of memory in gigs.
     *
     * @param memoryGigs The amount of memory in gigs.
     */
    public void setMemoryGigs(final int memoryGigs)
    {
        this.memoryGigs = memoryGigs;
    }

    /**
     * Prints all instance variables of this class.
     */
    @Override
    public void printDetails()
    {
        System.out.println("purpose = " + purpose);
        System.out.println("minutesRemainingOnPlan = " + minutesRemainingOnPlan);
        System.out.println("carrier = " + carrier);
        System.out.println("hasHighResCamera = " + hasHighResCamera);
        System.out.println("memoryGigs = " + memoryGigs);
    }

    /**
     * Overrides the toString() method to print all instance variables in the hierarchy.
     *
     * @return Prints all instance variables in the hierarchy.
     */
    @Override
    public String toString()
    {
        return "IPhoneFifteen{" +
           "purpose='" + purpose + '\'' +
           ", minutesRemainingOnPlan=" + minutesRemainingOnPlan +
           ", carrier='" + carrier + '\'' +
           ", hasHighResCamera=" + hasHighResCamera +
           ", memoryGigs=" + memoryGigs +
           "} " + super.toString();
    }

    /**
     * Overrides the equals() method to compare objects and return true or false according to the following criteria:
     * True if they are the same object.
     * False if the parameter is null.
     * False if the parameter is not an instance of this class.
     * True if the parameter is an instance of this class, and has the following attributes:
     * - same minutes remaining on the plan
     * - same boolean indicating the presence of a high resolution camera.
     *
     * @param o The object to compare.
     * @return True if the objects are the same, according to specified criteria.
     */
    @Override
    public boolean equals(final Object o)
    {
        if(this == o)
        {
            return true;
        }

        if(o ==null)
        {
            return false;
        }

        if(!(o instanceof final IPhoneFifteen that))
        {
            return false;
        }

        return Objects.equals(minutesRemainingOnPlan, that.minutesRemainingOnPlan) &&
               Objects.equals(hasHighResCamera, that.hasHighResCamera);
    }

    /**
     * Returns the hashcode of the minutes remaining on the plan and boolean indication the presence of a high resolution camera.
     *
     * @return The hashcode of the minutes remaining on the plan and boolean indication the presence of a high resolution camera.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(minutesRemainingOnPlan, hasHighResCamera);
    }
}

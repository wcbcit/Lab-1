import java.util.Objects;

/**
 * The IPhone class represents an iphone device.
 * It extends the IDevice class.
 * It contains an inherited instance variable to store the purpose of the device.
 * It also contains unique instance variables to store the minutes remaining on the plan and the carrier.
 * It contains getters and setters for all instance variables.
 * It contains a method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private static final String purposeIPhone = "talking";

    private String purpose;
    private double minutesRemainingOnPlan;
    private String carrier;

    /**
     * Constructs an IPhone object.
     *
     * @param minutesRemainingOnPlan The minutes remaining on the plan.
     * @param carrier                The carrier as a string.
     */
    public IPhone(final double minutesRemainingOnPlan,
                  final String carrier)
    {
        this.purpose                = purposeIPhone;
        this.minutesRemainingOnPlan = minutesRemainingOnPlan;
        this.carrier                = carrier;
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
    public double getMinutesRemainingOnPlan()
    {
        return minutesRemainingOnPlan;
    }

    /**
     * Returns the carrier of the device.
     *
     * @return The carrier of the device.
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Sets the purpose of the device.
     *
     * @param purpose The purpose of the device.
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
    public void setMinutesRemainingOnPlan(final double minutesRemainingOnPlan)
    {
        this.minutesRemainingOnPlan = minutesRemainingOnPlan;
    }

    /**
     * Sets the carrier of the device.
     *
     * @param carrier The carrier of the device.
     */
    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
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
    }

    /**
     * Overrides the toString() method to print all instance variables in the hierarchy.
     *
     * @return Prints all instance variables in the hierarchy.
     */
    @Override
    public String toString()
    {
        return "IPhone{" +
           "purpose='" + purpose + '\'' +
           ", minutesRemainingOnPlan=" + minutesRemainingOnPlan +
           ", carrier='" + carrier + '\'' +
           "} " + super.toString();
    }

    /**
     * Overrides the equals() method to compare objects and return true or false according to the following criteria:
     * True if they are the same object.
     * False if the parameter is null.
     * False if the parameter is not an instance of this class.
     * True if the parameter is an instance of this class, and has the same minutes remaining on plan.
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

        if(!(o instanceof final IPhone that))
        {
            return false;
        }

        return Objects.equals(minutesRemainingOnPlan, that.minutesRemainingOnPlan);
    }

    /**
     * Returns the hashcode of the minutes remaining on plan of this class.
     *
     * @return The hashcode of the minutes remaining on plan of this class.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(minutesRemainingOnPlan);
    }
}
import java.util.Objects;

/**
 * The IPad class represents an ipad device.
 * It extends the IDevice class.
 * It contains an inherited instance variable to store the purpose of the device.
 * It also contains unique instance variables to indicate if the device has a case and the version of the operating system.
 * It contains getters and setters for all instance variables.
 * It contains a method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPad extends IDevice
{
    private static final String purposeIPad = "learning";

    private String  purpose;
    private boolean hasCase;
    private String  operatingSystemVersion;

    /**
     * Constructs an IPad object.
     *
     * @param hasCase                Indicates true if the device has a case, and false otherwise.
     * @param operatingSystemVersion The operating system version.
     */
    public IPad(final boolean hasCase,
                final String  operatingSystemVersion)
    {
        this.purpose                = purposeIPad;
        this.hasCase                = hasCase;
        this.operatingSystemVersion = operatingSystemVersion;
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
     * Returns true if the device has a case, and false otherwise.
     *
     * @return Indicates true if the device has a case, and false otherwise.
     */
    public boolean isHasCase()
    {
        return hasCase;
    }

    /**
     * Returns the operating system version.
     *
     * @return The operating system version.
     */
    public String getOperatingSystemVersion()
    {
        return operatingSystemVersion;
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
     * Sets the boolean indicating if the device has a case.
     *
     * @param hasCase Indicates true if the device has a case, and false otherwise.
     */
    public void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    /**
     * Sets the operating system version.
     *
     * @param operatingSystemVersion The operating system version.
     */
    public void setOperatingSystemVersion(final String operatingSystemVersion)
    {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Prints all instance variables of this class.
     */
    @Override
    public void printDetails()
    {
        System.out.println("purpose = " + purpose);
        System.out.println("hasCase = " + hasCase);
        System.out.println("operatingSystemVersion = " + operatingSystemVersion);
    }

    /**
     * Overrides the toString() method to print all instance variables in the hierarchy.
     *
     * @return Prints all instance variables in the hierarchy.
     */
    @Override
    public String toString()
    {
        return "IPad{" +
           "purpose='" + purpose + '\'' +
           ", hasCase=" + hasCase +
           ", operatingSystemVersion='" + operatingSystemVersion + '\'' +
           ", purpose='" + purpose + '\'' +
           "} " + super.toString();
    }

    /**
     * Overrides the equals() method to compare objects and return true or false according to the following criteria:
     * True if they are the same object.
     * False if the parameter is null.
     * False if the parameter is not an instance of this class.
     * True if the parameter is an instance of this class, and has the same operating system version.
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

        if(o == null)
        {
            return false;
        }

        if(!(o instanceof final IPad that))
        {
            return false;
        }

        return Objects.equals(operatingSystemVersion, that.operatingSystemVersion);
    }

    /**
     * Returns the hashcode of the operating system version of this class.
     *
     * @return The hashcode of the operating system version of this class.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(operatingSystemVersion);
    }
}

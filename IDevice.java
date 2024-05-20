import java.util.Objects;

/**
 * The IDevice class represents the abstract parent class of various devices.
 * It contains an instance variable to store the purpose of the device.
 * It contains a getter and setter for the instance variable.
 * It contains an abstract method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
abstract class IDevice
{
    private String purpose;

    /**
     * Constructs a new IDevice with a specified purpose.
     * The constructor is used by the subclasses to initialize the purpose of the device.
     */
    public IDevice()
    {
        this.purpose = null;
    }

    /**
     * Returns the purpose of the device.
     *
     * @return The purpose of the device.
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Sets the purpose of the device.
     *
     * @param purpose The purpose of the device..
     */
    public void setPurpose(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * An abstract method to be used by subclasses to print details.
     */
    public abstract void printDetails();

    /**
     * Overrides the toString() method to print all instance variables in the hierarchy.
     *
     * @return Prints all instance variables in the hierarchy.
     */
    @Override
    public String toString()
    {
        return "IDevice{" +
           "purpose='" + purpose + '\'' +
           '}';
    }

    /**
     * Overrides the equals() method to compare objects and return true or false according to the following criteria:
     * True if they are the same object.
     * False if the parameter is null.
     * False if the parameter is not an instance of this class.
     * True if the parameter is an instance of this class, and has the same purpose.
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

        if(!(o instanceof final IDevice that))
        {
            return false;
        }

        return Objects.equals(purpose, that.purpose);
    }

    /**
     * Returns the hashcode of the purpose of this class.
     *
     * @return The hashcode of the purpose of this class.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(purpose);
    }
}
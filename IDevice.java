/**
 * The IDevice class represents the abstract parent class of various Apple devices.
 * It contains an instance variable to store the purpose of the device.
 * It contains a getter and setter for the instance variable.
 * It contains an abstract method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
abstract public class IDevice
{
    private String purpose;
    
    /**
     * A constructor.
     */
    public IDevice()
    {
        this.purpose = null;
    }
    
    /**
     * Method to get purpose of the device.
     * @return Returns purpose.
     */
    public String getPurpose()
    {
        return purpose;
    }
    
    /**
     * A method to set purpose of the device.
     * @param newPurpose New purpose of the device.
     */
    public void setPurpose(final String newPurpose)
    {
        if(newPurpose == null || newPurpose.isBlank())
        {
            throw new IllegalArgumentException("Invalid purpose: " + newPurpose);
        }
        this.purpose = newPurpose;
    }
    
    /**
     * An abstract method to print device's details.
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
     * Returns the hashcode of this class.
     *
     * @return The hashcode of this class.
     */
    @Override
    public int hashCode()
    {
        return 0;
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
        
        if(!(o instanceof IDevice))
        {
            return false;
        }
        
        final IDevice that;
        that = (IDevice) o;
        
        return this.purpose == that.purpose;
    }
}

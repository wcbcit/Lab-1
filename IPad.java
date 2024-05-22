/**
 * The IPad class represents the class of Apple IPod devices.
 * It contains an instance variable to store the operating system and if a device has a case.
 * It contains a getter and setter for the instance variable.
 * It contains a method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPad extends IDevice
{
    private boolean hasACase;
    private String  operatingSystemVersion;
    public static final String IPAD_PURPOSE = "learning";
    
    /**
     * A constructor. Sets purpose of all Ipod devices to "learning".
     * @param hasACase True if device has a case, false if it does not.
     * @param operatingSystemVersion Operating system of the device.
     */
    public IPad(final boolean hasACase,
                final String  operatingSystemVersion)
    {
        super();
        
        if(!validateOperatingSystemVersion(operatingSystemVersion))
        {
            throw new IllegalArgumentException("Invalid operating system version:" + operatingSystemVersion);
        }
        
        setPurpose(IPAD_PURPOSE);
        this.hasACase               = hasACase;
        this.operatingSystemVersion = operatingSystemVersion;
    }
    
    /**
     * A getter method for getting true/false if a device has a case.
     * @return Returns true if device has a case, false if it does not.
     */
    public boolean isHasACase()
    {
        return hasACase;
    }
    
    /**
     * A getter methid for getting operating system of the device.
     * @return Returns operating system version.
     */
    public String getOperatingSystemVersion()
    {
        return operatingSystemVersion;
    }
    
    /**
     * A setter method for setting true/false if a device has a case.
     * @param newHasACase True if device has a case, false if it does not.
     */
    public void setHasACase(final boolean newHasACase)
    {
        this.hasACase = newHasACase;
    }
    
    /**
     * A setter method for setting new operating system.
     * This method will validate new operating system before setting it.
     * If new operating system is not valid no change will ocuur.
     * @param newOperatingSystemVersion New operating system version.
     */
    public void setOperatingSystemVersion(final String newOperatingSystemVersion)
    {
        if(validateOperatingSystemVersion(newOperatingSystemVersion))
        {
            this.operatingSystemVersion = newOperatingSystemVersion;
        }
    }
    
//    /**
//     * A private method for validating operating system version.
//     * @param operatingSystemToValidate Operating system version to validate.
//     * @return Returns true if parameter if valid, false if parameter is null of blank.
//     */
    private boolean validateOperatingSystemVersion(final String operatingSystemToValidate)
    {
        if(operatingSystemToValidate == null || operatingSystemToValidate.isBlank())
        {
            return false;
        }
        return true;
    }
    
    /**
     * Method prints out all details of the device in a form of:
     *"This is a class IPad, it has  a case, and linux version of the operating system."
     */
    @Override
    public void printDetails()
    {
        final StringBuilder sb;
        final String        details;
        
        sb = new StringBuilder();
        
        sb.append("This is a ");
        sb.append(this.getClass());
        sb.append(", it has ");
        if(hasACase)
        {
            sb.append(" a case, and ");
        }
        else
        {
            sb.append("no case, and ");
        }
        sb.append(operatingSystemVersion);
        sb.append(" version of the operating system.");
        
        details = sb.toString();
        
        System.out.println(details);
    }
    
    /**
     * Overrides the toString() method to print all instance variables in the hierarchy.
     *
     * @return Prints all instance variables in the hierarchy.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "IPad{" +
                "hasACase=" + hasACase +
                ", operatingSystemVersion='" + operatingSystemVersion + '\'' +
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
        
        if(!(o instanceof IPad))
        {
            return false;
        }
        
        final IPad that;
        that = (IPad) o;
        
        return this.operatingSystemVersion.equalsIgnoreCase(that.operatingSystemVersion);
    }
}

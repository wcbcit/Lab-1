/**
 * The IPhoneFifteen class represents the class of Iphone15 devices.
 * It contains an instance variable to store gigabytes of memory and a boolean for if a phone has a high resolution camera.
 * It contains a getter and setter for the instance variable.
 * It contains a method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPhoneFifteen extends IPhone
{
    private boolean highResolutionCamera;
    private int gigabytesOfMemory;
    public static final int MIN_MEMORY_IN_GIGABYTES = 0;
    
    /**
     * A constructor.
     * @param numberOfMinutesRemainingOnPhonePlan Number of minutes remaining ob the phone plan.
     * @param carrier Phone carrier.
     * @param highResolutionCamera True if phone has high resolution camera, false if it does not.
     * @param gigabytesOfMemory Gigabytes of memory.
     */
    public IPhoneFifteen(final double  numberOfMinutesRemainingOnPhonePlan,
                         final String  carrier,
                         final boolean highResolutionCamera,
                         final int     gigabytesOfMemory)
    {
        super(numberOfMinutesRemainingOnPhonePlan, carrier);
        
        if(!validateGigabytesOfMemory(gigabytesOfMemory))
        {
           throw new IllegalArgumentException("Invalid memory:" + gigabytesOfMemory) ;
        }
        
        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesOfMemory    = gigabytesOfMemory;
    }
    
    /**
     * A getter method for high resolution camera.
     * @return Returns true if phone has high resolution camera, false if it does not.
     */
    public boolean isHighResolutionCamera()
    {
        return highResolutionCamera;
    }
    
    /**
     * A getter method for gigabytes of memory.
     * @return Returns gigabytes of memory.
     */
    public int getGigabytesOfMemory()
    {
        return gigabytesOfMemory;
    }
    
    /**
     * A setter method for high resolution camera.
     * @param newHighResolutionCamera True if phone has high resolution camera, false if it does not.
     */
    public void setHighResolutionCamera(final boolean newHighResolutionCamera)
    {
        this.highResolutionCamera = newHighResolutionCamera;
    }
    
    /**
     * A setter method for gigabytes of memory.
     * @param newGigabytesOfMemory New gigabytes of memory.
     */
    public void setGigabytesOfMemory(final int newGigabytesOfMemory)
    {
        if(validateGigabytesOfMemory(newGigabytesOfMemory))
        {
            this.gigabytesOfMemory = newGigabytesOfMemory;
        }
    }
    
//    /**
//     * A private method for validating gigabytes of memory.
//     * This method validates the parameter before setting it.
//     * No change will occur if parameter is not valid.
//     * @param GigabytesOfMemoryToValidate Gigabytes of memory to validate.
//     * @return Returns true if the parameter is valid, false if it is less than MIN_MEMORY_IN_GIGABYTES.
//     */
    private boolean validateGigabytesOfMemory(final int GigabytesOfMemoryToValidate)
    {
        if(GigabytesOfMemoryToValidate < MIN_MEMORY_IN_GIGABYTES)
        {
            return false;
        }
        return true;
    }
    
    /**
     * Overrides the toString() method to print all instance variables in the hierarchy.
     *
     * @return Prints all instance variables in the hierarchy.
     */
    @Override
    public String toString()
    {
        return  super.toString() +
                "IPhoneFifteen{" +
                "highResolutionCamera=" + highResolutionCamera +
                ", gigabytesOfMemory=" + gigabytesOfMemory +
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
     * True if the parameter is an instance of this class, and has the same number of minutes remaining on phone plan
     * within 0.5 minutes and same high resolution camera.
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
        
        if(!(o instanceof IPhoneFifteen))
        {
            return false;
        }
        
        final IPhoneFifteen that;
        that = (IPhoneFifteen) o;
        
        return ((Math.abs(this.getNumberOfMinutesRemainingOnPhonePlan() -
                that.getNumberOfMinutesRemainingOnPhonePlan()) < MINUTES_WITHIN) &&
                this.highResolutionCamera == that.highResolutionCamera);
    }
}

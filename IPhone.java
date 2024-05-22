/**
 * The IPhone class represents the abstract parent class of various Apple Iphone devices.
 * It contains an instance variable to store number of minutes remaining ob the phone plan and the carrier.
 * It contains a getter and setter for the instance variable.
 * It contains a method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
abstract public class IPhone extends IDevice
{
    private double numberOfMinutesRemainingOnPhonePlan;
    private String carrier;
    public static final String IPHONE_PURPOSE        = "talking";
    public static final double MINUTES_WITHIN        = 0.5;
    public static final double MIN_MINUTES_REMAINING = 0.0;
    
    /**
     * A constructor. A constructor. Sets purpose of all Ipod devices to "talking".
     * @param numberOfMinutesRemainingOnPhonePlan Number of minutes remaining ob the phone plan.
     * @param carrier Phone carrier.
     */
    public IPhone(final double numberOfMinutesRemainingOnPhonePlan,
                  final String carrier)
    {
        super();
        
        if(!validateNumberOfMinutesRemainingOnPhonePlan(numberOfMinutesRemainingOnPhonePlan))
        {
            throw new IllegalArgumentException("Invalid number of minutes" + numberOfMinutesRemainingOnPhonePlan);
        }
        
        setPurpose(IPHONE_PURPOSE);
        this.numberOfMinutesRemainingOnPhonePlan = numberOfMinutesRemainingOnPhonePlan;
        this.carrier                             = carrier;
    }
    
    /**
     * A getter method for number of minutes remaining ob the phone plan.
     * @return Returns number of minutes remaining ob the phone plan.
     */
    public double getNumberOfMinutesRemainingOnPhonePlan()
    {
        return numberOfMinutesRemainingOnPhonePlan;
    }
    
    /**
     * A getter method for carrier.
     * @return Returns carrier.
     */
    public String getCarrier()
    {
        return carrier;
    }
    
    /**
     * A setter method for number of minutes remaining ob the phone plan.
     * This method validates the parameter before setting it.
     * No change will occur if parameter is not valid.
     * @param newNumberOfMinutesRemainingOnPhonePlan New number of minutes remaining on the phone plan.
     */
    public void setNumberOfMinutesRemainingOnPhonePlan(final double newNumberOfMinutesRemainingOnPhonePlan)
    {
        if(validateNumberOfMinutesRemainingOnPhonePlan(newNumberOfMinutesRemainingOnPhonePlan))
        {
            this.numberOfMinutesRemainingOnPhonePlan = newNumberOfMinutesRemainingOnPhonePlan;
        }
    }
    
//    /**
//     * A private method for validating number of minutes remaining ob the phone plan.
//     * @param minutesToValidate Number of minutes remaining ob the phone plan to validate.
//     * @return Returns true if valid, false if parameter is less than MIN_MINUTES_REMAINING.
//     */
    private boolean validateNumberOfMinutesRemainingOnPhonePlan(final double minutesToValidate)
    {
        if(minutesToValidate < MIN_MINUTES_REMAINING)
        {
            return false;
        }
        return true;
    }
    
    /**
     *A setter method for carrier.
     *This method validates the parameter before setting it.
     *No change will occur if parameter is not valid.
     * @param newCarrier New carrier.
     */
    public void setCarrier(final String newCarrier)
    {
        if(validateCarrier(newCarrier))
        {
            this.carrier = newCarrier;
        }
    }
    
//    /**
//     * A private method for validating carrier.
//     * @param carrierToValidate carrier to validate.
//     * @return Returns true if valid, false if parameter is null or blank.
//     */
    private boolean validateCarrier(final String carrierToValidate)
    {
        if(carrierToValidate == null || carrierToValidate.isBlank())
        {
            return false;
        }
        return true;
    }
    
    /**
     * Method prints out all details of the device in a form of:
     *"This is a class [specific IPhone child class], it has 20.0 minutes remaining on the phone plan and shaw carrier."
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
        sb.append(numberOfMinutesRemainingOnPhonePlan);
        sb.append(" minutes remaining on the phone plan and ");
        sb.append(carrier);
        sb.append(" carrier.");
        
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
                "IPhone{" +
                "numberOfMinutesRemainingOnPhonePlan=" + numberOfMinutesRemainingOnPhonePlan +
                ", carrier='" + carrier + '\'' +
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
     * True if the parameter is an instance of this class, and has the same number of minutes remaining on phone plan within 0.5 minutes.
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
        
        if(!(o instanceof IPhone))
        {
            return false;
        }
        
        final IPhone that;
        that = (IPhone) o;
        
        return (Math.abs(this.numberOfMinutesRemainingOnPhonePlan -
                that.numberOfMinutesRemainingOnPhonePlan) < MINUTES_WITHIN);
    }
}

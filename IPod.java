/**
 * The IPod class represents the class of Apple IPod devices.
 * It contains an instance variable to store the number of songs on the device and maximum volume in decibels.
 * It contains a getter and setter for the instance variable.
 * It contains a method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPod extends IDevice
{
    private int    numberOfSongsStored;
    private double maximumVolumeInDecibels;
    public static final String IPOD_PURPOSE            = "music";
    public static final int MIN_NUM_OF_SONGS_STORED    = 0;
    public static final double MIN_VOLUME_IN_DECIBELS  = 0.0;
    
    /**
     * A constructor. Sets purpose of all Ipod devices to "music".
     * @param numberOfSongsStored Number of songs stored on the device.
     * @param maximumVolumeInDecibels Maximum volume of the device in decibels.
     */
    public IPod(final int    numberOfSongsStored,
                final double maximumVolumeInDecibels)
    {
        super();
        
        if(!validateNumberOfSongsStored(numberOfSongsStored))
        {
            throw new IllegalArgumentException("Invalid number of songs:" + numberOfSongsStored);
        }
        
        if(!validateMaximumVolumeInDecibels(maximumVolumeInDecibels))
        {
            throw new IllegalArgumentException("Invalid volume:" + maximumVolumeInDecibels);
        }
        
        setPurpose(IPOD_PURPOSE);
        this.numberOfSongsStored     = numberOfSongsStored;
        this.maximumVolumeInDecibels = maximumVolumeInDecibels;
    }
    
    /**
     * A getter method for number of songs stored on the device.
     * @return Returns number of songs stored.
     */
    public int getNumberOfSongsStored()
    {
        return numberOfSongsStored;
    }
    
    /**
     * A getter method for maximum volume of the device in decibels.
     * @return Returns maximum volume in decibels
     */
    public double getMaximumVolumeInDecibels()
    {
        return maximumVolumeInDecibels;
    }
    
    /**
     * A setter method for setting new number of songs stored by the device.
     * Method validates the new number before setting it.
     * If number is not valid no change will occur.
     * @param newNumberOfSongsStored New number of songs.
     */
    public void setNumberOfSongsStored(final int newNumberOfSongsStored)
    {
        if(validateNumberOfSongsStored(newNumberOfSongsStored))
        {
            this.numberOfSongsStored = newNumberOfSongsStored;
        }
    }
    
//    /**
//     * A private method for validating number of songs stored on the device.
//     * @param numberOfSongToValidate Number of songs to be validated.
//     * @return Returns true if the number is valid and false if it is less than MIN_NUM_OF_SONGS_STORED.
//     */
    private boolean validateNumberOfSongsStored(final int numberOfSongToValidate)
    {
        if(numberOfSongToValidate < MIN_NUM_OF_SONGS_STORED)
        {
            return false;
        }
        return true;
    }
    
    /**
     * A setter method for setting new maximum volume in decibels.
     * Method validates the new volume before setting it.
     * If volume is not valid no change will occur.
     * @param newMaximumVolumeInDecibels New maximum volume in decibels.
     */
    public void setMaximumVolumeInDecibels(final double newMaximumVolumeInDecibels)
    {
        if(validateMaximumVolumeInDecibels(newMaximumVolumeInDecibels))
        {
            this.maximumVolumeInDecibels = newMaximumVolumeInDecibels;
        }
    }
    
//    /**
//     * A private method for validating maximum volume in decibels.
//     * @param MaxVolumeToValidate Maximum volume in decibels to be validated.
//     * @return Returns true if the number is valid and false if it is less than MIN_VOLUME_IN_DECIBELS.
//     */
    private boolean validateMaximumVolumeInDecibels(final double MaxVolumeToValidate)
    {
        if(MaxVolumeToValidate < MIN_VOLUME_IN_DECIBELS)
        {
            return false;
        }
        return true;
    }
    
    /**
     * Method prints out all details of the device in a form of:
     *"This is a class IPod, it has 3 number of songs stored, with 3.0 maximum volume in decibels."
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
        sb.append(numberOfSongsStored);
        sb.append(" songs stored, with ");
        sb.append(maximumVolumeInDecibels);
        sb.append(" maximum volume in decibels.");
        
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
                "IPod{" +
                "numberOfSongsStored=" + numberOfSongsStored +
                ", maximumVolumeInDecibels=" + maximumVolumeInDecibels +
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
     * True if the parameter is an instance of this class, and has the same number of songs stored.
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
        
        if(!(o instanceof IPod))
        {
            return false;
        }
        
        final IPod that;
        that = (IPod) o;
        
        return this.numberOfSongsStored == that.numberOfSongsStored;
    }
}

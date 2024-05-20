import java.util.Objects;

/**
 * The IPod class represents an ipod device.
 * It extends the IDevice class.
 * It contains an inherited instance variable to store the purpose of the device.
 * It also contains unique instance variables to store the number of songs stored and maximum volume in decibels.
 * It contains getters and setters for all instance variables.
 * It contains a method to print the details of the device.
 * It also contains methods to override toString(), equals(), and hashCode().
 *
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPod extends IDevice
{
    private static final String purposeIPod = "music";

    private String purpose;
    private int    numSongsStored;
    private double maxVolumeDecibels;

    /**
     * Constructs an IPod object.
     *
     * @param numSongsStored    The number of songs that can be stored.
     * @param maxVolumeDecibels The maximum volume of the device in decibels.
     */
    public IPod(final int    numSongsStored,
                final double maxVolumeDecibels)
    {
        this.purpose           = purposeIPod;
        this.numSongsStored    = numSongsStored;
        this.maxVolumeDecibels = maxVolumeDecibels;
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
     * Returns the number of songs that can be stored.
     *
     * @return The number of songs that can be stored.
     */
    public int getNumSongsStored()
    {
        return numSongsStored;
    }

    /**
     * Returns the maximum volume in decibels.
     *
     * @return The maximum volume in decibels.
     */
    public double getMaxVolumeDecibels()
    {
        return maxVolumeDecibels;
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
     * Sets the number of songs that can be stored.
     *
     * @param numSongsStored The number of songs that can be stored.
     */
    public void setNumSongsStored(final int numSongsStored)
    {
        this.numSongsStored = numSongsStored;
    }

    /**
     * Sets the maximum volume in decibels.
     *
     * @param maxVolumeDecibels The maximum volume in decibels.
     */
    public void setMaxVolumeDecibels(final double maxVolumeDecibels)
    {
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    /**
     * Prints all instance variables of this class.
     */
    @Override
    public void printDetails()
    {
        System.out.println("purpose = " + purpose);
        System.out.println("numSongsStored = " + numSongsStored);
        System.out.println("maxVolumeDecibels = " + maxVolumeDecibels);
    }

    /**
     * Overrides the toString() method to print all instance variables in the hierarchy.
     *
     * @return Prints all instance variables in the hierarchy.
     */
    @Override
    public String toString()
    {
        return "IPod{" +
           "purpose='" + purpose + '\'' +
           ", numSongsStored=" + numSongsStored +
           ", maxVolumeDecibels=" + maxVolumeDecibels +
           ", purpose='" + purpose + '\'' +
           "} " + super.toString();
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

        if(o==null)
        {
            return false;
        }

        if(!(o instanceof final IPod that))
        {
            return false;
        }

        return numSongsStored == that.numSongsStored;
    }

    /**
     * Returns the hashcode of the number of songs stored of this class.
     *
     * @return The hashcode of the number of songs stored of this class.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(numSongsStored);
    }
}
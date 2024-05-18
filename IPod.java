import java.util.Objects;

/**
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

    public IPod(final String purpose,
                final int    numSongsStored,
                final double maxVolumeDecibels)
    {
        super(purpose);
        this.setPurpose(purposeIPod);

        this.purpose           = "music";
        this.numSongsStored    = numSongsStored;
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    @Override
    public String getPurpose()
    {
        return purpose;
    }

    public int getNumSongsStored()
    {
        return numSongsStored;
    }

    public double getMaxVolumeDecibels()
    {
        return maxVolumeDecibels;
    }

    @Override
    public void setPurpose(final String purpose)
    {
        this.purpose = purpose;
    }

    public void setNumSongsStored(final int numSongsStored)
    {
        this.numSongsStored = numSongsStored;
    }

    public void setMaxVolumeDecibels(final double maxVolumeDecibels)
    {
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    @Override
    public void printDetails()
    {

    }

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

    @Override
    public int hashCode()
    {
        return Objects.hash(numSongsStored);
    }
}
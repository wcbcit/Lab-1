import java.util.Objects;

/**
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPhoneFifteen extends IPhone
{
    private String  purpose;
    private double  minutesRemainingOnPlan;
    private String  carrier;
    private boolean hasHighResCamera;
    private int     memoryGigs;

    public IPhoneFifteen(final String  purpose,
                         final double  minutesRemainingOnPlan,
                         final String  carrier,
                         final boolean hasHighResCamera,
                         final int     memoryGigs)
    {
        super(purpose, minutesRemainingOnPlan, carrier);

        this.hasHighResCamera = hasHighResCamera;
        this.memoryGigs       = memoryGigs;
    }

    @Override
    public String getPurpose()
    {
        return purpose;
    }

    @Override
    public double getMinutesRemainingOnPlan()
    {
        return minutesRemainingOnPlan;
    }

    @Override
    public String getCarrier()
    {
        return carrier;
    }

    public boolean isHasHighResCamera()
    {
        return hasHighResCamera;
    }

    public int getMemoryGigs()
    {
        return memoryGigs;
    }

    @Override
    public void setPurpose(final String purpose)
    {
        this.purpose = purpose;
    }

    @Override
    public void setMinutesRemainingOnPlan(final double minutesRemainingOnPlan)
    {
        this.minutesRemainingOnPlan = minutesRemainingOnPlan;
    }

    @Override
    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    public void setHasHighResCamera(final boolean hasHighResCamera)
    {
        this.hasHighResCamera = hasHighResCamera;
    }

    public void setMemoryGigs(final int memoryGigs)
    {
        this.memoryGigs = memoryGigs;
    }

    @Override
    public String toString()
    {
        return "IPhoneFifteen{" +
           "purpose='" + purpose + '\'' +
           ", minutesRemainingOnPlan=" + minutesRemainingOnPlan +
           ", carrier='" + carrier + '\'' +
           ", hasHighResCamera=" + hasHighResCamera +
           ", memoryGigs=" + memoryGigs +
           "} " + super.toString();
    }

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

        if(!(o instanceof final IPhoneFifteen that))
        {
            return false;
        }

        return Objects.equals(minutesRemainingOnPlan, that.minutesRemainingOnPlan) &&
               Objects.equals(hasHighResCamera, that.hasHighResCamera);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(minutesRemainingOnPlan, hasHighResCamera);
    }
}

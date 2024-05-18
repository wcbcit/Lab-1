import java.util.Objects;

/**
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private static final String purposeIPhone = "talking";

    private String purpose;
    private double minutesRemainingOnPlan;
    private String carrier;

    public IPhone(final String purpose,
                  final double minutesRemainingOnPlan,
                  final String carrier)
    {
        super(purpose);
        this.setPurpose(purposeIPhone);

        this.purpose                = "talking";
        this.minutesRemainingOnPlan = minutesRemainingOnPlan;
        this.carrier                = carrier;
    }

    @Override
    public String getPurpose()
    {
        return purpose;
    }

    public double getMinutesRemainingOnPlan()
    {
        return minutesRemainingOnPlan;
    }

    public String getCarrier()
    {
        return carrier;
    }

    @Override
    public void setPurpose(final String purpose)
    {
        this.purpose = purpose;
    }

    public void setMinutesRemainingOnPlan(final double minutesRemainingOnPlan)
    {
        this.minutesRemainingOnPlan = minutesRemainingOnPlan;
    }

    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    @Override
    public void printDetails()
    {

    }

    @Override
    public String toString()
    {
        return "IPhone{" +
           "purpose='" + purpose + '\'' +
           ", minutesRemainingOnPlan=" + minutesRemainingOnPlan +
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

        if(o ==null)
        {
            return false;
        }

        if(!(o instanceof final IPhone that))
        {
            return false;
        }

        return Objects.equals(minutesRemainingOnPlan, that.minutesRemainingOnPlan);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(minutesRemainingOnPlan);
    }
}
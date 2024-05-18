import java.util.Objects;

/**
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
abstract class IDevice
{
    private String purpose;

    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    public String getPurpose()
    {
        return purpose;
    }

    public void setPurpose(final String purpose)
    {
        this.purpose = purpose;
    }

    public abstract void printDetails();

    @Override
    public String toString()
    {
        return "IDevice{" +
           "purpose='" + purpose + '\'' +
           '}';
    }

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

    @Override
    public int hashCode()
    {
        return Objects.hash(purpose);
    }
}